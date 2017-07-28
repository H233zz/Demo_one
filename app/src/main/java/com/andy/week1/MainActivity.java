package com.andy.week1;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @ViewInject(R.id.tablayout)
    private TabLayout mTabLayout;

    @ViewInject(R.id.viewpager)
    private ViewPager viewPager;

    private Gson gson;
    private  List<DataTab.TngouBean> listTabs;
    private MyFragment [] fragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
        gson=new Gson();

        loadDataTab();
//        listTabs=new ArrayList<>();
//        for (int i=0;i<10;i++){
//            DataTab.TngouBean bean=new DataTab.TngouBean();
//            bean.setName("i-"+i);
//            listTabs.add(bean);
//        }
//        initTab();
    }

    private void loadDataTab() {
        RequestParams params=new RequestParams("http://www.tngou.net/api/top/classify");
        x.http().get(params, new Callback.CommonCallback<String>() {

            @Override
            public void onSuccess(String result) {
                DataTab tab=gson.fromJson(result,DataTab.class);
                listTabs = tab.getTngou();
                initTab();
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

    private void initTab() {
        for(DataTab.TngouBean bean : listTabs){
            mTabLayout.addTab(mTabLayout.newTab().setText(bean.getName()));
        }
        fragments=new MyFragment[listTabs.size()];

        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                if(fragments[position]==null){
                    MyFragment my = MyFragment.getInstance(listTabs.get(position).getId());
                    fragments[position]=my;
                }
                return fragments[position];
            }

            @Override
            public int getCount() {
                return listTabs.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return listTabs.get(position).getName();
            }
        });
        mTabLayout.setupWithViewPager(viewPager);
    }
}
