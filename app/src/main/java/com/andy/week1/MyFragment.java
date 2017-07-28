package com.andy.week1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述：
 * 创建人：yekh
 * 创建时间：2017/7/7 16:11
 */
@ContentView(R.layout.my_fragment)
public class MyFragment extends Fragment{

    @ViewInject(R.id.lv)
    private ListView lv;
    private int id;

    private List<Data.TngouBean> list=new ArrayList<>();
    private MyAdapter adapter;

    public static MyFragment getInstance(int id){
        MyFragment myFragment=new MyFragment();
        Bundle bundle=new Bundle();
        bundle.putInt("id",id);
        myFragment.setArguments(bundle);
        return myFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = x.view().inject(this,inflater,container);
        id = getArguments().getInt("id");

        adapter=new MyAdapter();
        lv.setAdapter(adapter);

        loadData();
        return view;
    }

    private void loadData() {
        RequestParams requestParams=new RequestParams("http://www.tngou.net/api/top/list");
        requestParams.addQueryStringParameter("page","1");
        requestParams.addQueryStringParameter("rows","10");
        requestParams.addQueryStringParameter("id",id+"");

        x.http().get(requestParams, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Data data=new Gson().fromJson(result,Data.class);
                list.addAll(data.getTngou());
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }


    class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder=null;
            if(convertView==null){
                holder=new ViewHolder();
                convertView=View.inflate(getContext(),R.layout.item,null);
                x.view().inject(holder,convertView);

                convertView.setTag(holder);
            }else{
                holder= (ViewHolder) convertView.getTag();
            }

            Data.TngouBean bean = list.get(position);
            holder.name.setText(bean.getTitle());

            x.image().bind(holder.image,"http://tnfs.tngou.net/image"+bean.getImg());

            return convertView;
        }
    }

    class ViewHolder{
        @ViewInject(R.id.name)
        TextView name;
        @ViewInject(R.id.image)
        ImageView image;
    }
}
