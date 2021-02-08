package cn.onekit.cloud.weixinaccount;

import cn.onekit.cloud.weixinaccount.entity.WeixinAccountError;
import cn.onekit.cloud.weixinaccount.entity.response.Menu;
import cn.onekit.cloud.weixinaccount.entity.response.SelfMenu;
import cn.onekit.cloud.weixinaccount.entity.response.Token;

public interface WeixinAccountAPI {

    Token token() throws WeixinAccountError;

    void menu_create(Menu mnu) throws WeixinAccountError;

    SelfMenu get_current_selfmenu_info() throws WeixinAccountError;

    void menu_delete() throws WeixinAccountError;
}
