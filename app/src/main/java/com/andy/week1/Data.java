package com.andy.week1;

import java.util.List;

/**
 * 类描述：
 * 创建人：yekh
 * 创建时间：2017/7/7 16:50
 */
public class Data {

    /**
     * status : true
     * total : 16004
     * tngou : [{"count":589,"description":"漫画多次勒索他人财物但屡次被拒,而且又受到被勒索人和其朋友的责备心生怨恨,提出要与对方见面缓和关系,却在交谈中故意制造冲突再将人伤","fcount":0,"fromname":"齐鲁晚报","fromurl":"http://www.qlwb.com.cn/2017/0405/898961.shtml","id":16250,"img":"/top/170405/db6602fe0dae0e0b68d00b16d7009add.png","keywords":"嫌犯勒索未成反遭责备","rcount":0,"time":1491372765000,"title":"嫌犯勒索未成反遭责备 假装要缓和关系故意\"挑事\"砍伤人","topclass":0},{"count":385,"description":"4日援引叙利亚人权观察组织报告称，叙利亚西北部伊德利卜省汉谢洪市当地时间4日遭到疑似化学武器攻击，造成至少58人死亡，其中包括11名儿童，另有数十人受伤","fcount":0,"fromname":"东方头条","fromurl":"http://mil.eastday.com/a/170405073303113.html","id":16249,"img":"/top/default.jpg","keywords":"叙利亚遭战机投毒气","rcount":0,"time":1491365565000,"title":"叙利亚遭战机投毒气 惨案背后迷雾重重","topclass":0},{"count":414,"description":"p;央视网消息：当地时间3号，俄罗斯圣彼得堡地铁站发生爆炸，事故原因暂不清楚","fcount":0,"fromname":"新浪新闻","fromurl":"http://news.sina.com.cn/o/2017-04-03/doc-ifycwyxr9291899.shtml","id":16248,"img":"/top/170403/584560548dd6a085ca278a2480fccc07.jpg","keywords":"俄罗斯地铁站爆炸","rcount":0,"time":1491232365000,"title":"俄罗斯圣彼得堡地铁站发生爆炸","topclass":0},{"count":380,"description":"孕妇花5千请人为父扫墓清明扫墓是中华民族的传统习俗，现代人由于异地生活等原因无法亲自去扫墓，于是一种代替扫墓的业务抓住市场需求应运而生","fcount":0,"fromname":"中国青年网","fromurl":"http://minsheng.youth.cn/mszxgch/201704/t20170402_9408136.htm","id":16247,"img":"/top/default.jpg","keywords":"花5千请人为父亲扫墓","rcount":0,"time":1491131566000,"title":"孕妇花5千请人为父扫墓 网友对此褒贬不一各持己见","topclass":0},{"count":457,"description":"\u201c河北高院态度还可以\u201d\u201c谈得很艰难，有的时候连着谈两天，有的时候谈三天，但是谈得比较融洽，最后的结果双方都还能接受","fcount":0,"fromname":"中华网","fromurl":"http://news.china.com/socialgd/10000169/20170402/30383598.html","id":16246,"img":"/top/170402/7fb2aba0c05b8ea8f079751a23554772.jpg","keywords":"聂树斌案将拍电影系假新闻","rcount":0,"time":1491131565000,"title":"聂树斌案将拍电影 媒体称最高法正与张艺谋接洽","topclass":0}]
     */

    private boolean status;
    private int total;
    private List<TngouBean> tngou;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<TngouBean> getTngou() {
        return tngou;
    }

    public void setTngou(List<TngouBean> tngou) {
        this.tngou = tngou;
    }

    public static class TngouBean {
        /**
         * count : 589
         * description : 漫画多次勒索他人财物但屡次被拒,而且又受到被勒索人和其朋友的责备心生怨恨,提出要与对方见面缓和关系,却在交谈中故意制造冲突再将人伤
         * fcount : 0
         * fromname : 齐鲁晚报
         * fromurl : http://www.qlwb.com.cn/2017/0405/898961.shtml
         * id : 16250
         * img : /top/170405/db6602fe0dae0e0b68d00b16d7009add.png
         * keywords : 嫌犯勒索未成反遭责备
         * rcount : 0
         * time : 1491372765000
         * title : 嫌犯勒索未成反遭责备 假装要缓和关系故意"挑事"砍伤人
         * topclass : 0
         */

        private int count;
        private String description;
        private int fcount;
        private String fromname;
        private String fromurl;
        private int id;
        private String img;
        private String keywords;
        private int rcount;
        private long time;
        private String title;
        private int topclass;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getFcount() {
            return fcount;
        }

        public void setFcount(int fcount) {
            this.fcount = fcount;
        }

        public String getFromname() {
            return fromname;
        }

        public void setFromname(String fromname) {
            this.fromname = fromname;
        }

        public String getFromurl() {
            return fromurl;
        }

        public void setFromurl(String fromurl) {
            this.fromurl = fromurl;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public int getRcount() {
            return rcount;
        }

        public void setRcount(int rcount) {
            this.rcount = rcount;
        }

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getTopclass() {
            return topclass;
        }

        public void setTopclass(int topclass) {
            this.topclass = topclass;
        }
    }
}
