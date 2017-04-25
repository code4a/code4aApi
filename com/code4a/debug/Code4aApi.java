package com.code4a.debug;

import com.code4a.bean.ResponseLoginUserBean;
import com.code4a.bean.ResponseGetDeviceListBean;
import com.code4a.callback.AndLinkCallback;

/**
 * Created by code4a on 2017/4/7.
 */

public interface Code4aApi {

    String USER_LOGIN = "userLoginResponse";
    String GET_HUB_LIST = "deviceGetHubList";
    String GET_HUB_LIST4BIND = "deviceGetHubList4Bind";
    String GET_DEVICE_LIST = "deviceGetDeviceList";

    String CODE4A_ALIPAYINFO = "key.txt";

    void testHttp();

    /**
     * 外网测试用户登陆接口
     *
     * @param aluCallback 结果回调
     */
    void andLinkUserLogin(AndLinkCallback<ResponseLoginUserBean> aluCallback);

    /**
     * 外网测试获取设备列表
     *
     * @param key 请求的接口数据字段
     * @param alCallback 结果回调
     */
    void andLinkGetHubList(String key, AndLinkCallback<ResponseGetDeviceListBean> alCallback);
}
