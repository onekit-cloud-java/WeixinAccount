package cn.onekit.cloud.weixinaccount.entity.response;

import java.util.ArrayList;
import java.util.List;


    public  class MenuButton {
        public enum Type {
            view, click, miniprogram
        }

        public String name;
        public Type type;
        public String key;
        public List<MenuButton> sub_button = new ArrayList<>();
    }
