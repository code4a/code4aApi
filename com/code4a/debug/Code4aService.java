package com.code4a.debug;

import com.code4a.bean.ResponseLoginUserBean;
import com.code4a.bean.ResponseGetDeviceListBean;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by code4a on 2017/4/7.
 */

public interface Code4aService {

    @GET(DebugApi.ANDLINK_PLATFORMURL + "{key}")
    Observable<ResponseLoginUserBean> andLinkUserLogin(
            @Path("key") String key
    );

    @GET(DebugApi.ANDLINK_PLATFORMURL + "{key}")
    Observable<ResponseGetDeviceListBean> andLinkDeviceGetHubList(
            @Path("key") String key
    );

    @GET("{key}")
    Observable<String> getAlipayInfo(
            @Path("key") String key
    );

}
