package com.code4a.debug;

import android.util.Log;

import com.code4a.bean.ResponseLoginUserBean;
import com.code4a.bean.ResponseGetDeviceListBean;
import com.code4a.callback.AndLinkCallback;
import com.code4a.utils.LogUtil;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

import static com.code4a.andlinklib.net.AndLinkNet.SUCCESS_CODE;
import static com.code4a.andlinklib.net.AndLinkNet.SUCCESS_MSG;

/**
 * Created by code4a on 2017/4/7.
 */

public class Code4aApiImpl implements Code4aApi {

    private static final String TAG = Code4aApiImpl.class.getSimpleName();

    @Override
    public void testHttp() {
        Code4aRetrofit.getCode4aRetrofit()
                .create(Code4aService.class)
                .getAlipayInfo(CODE4A_ALIPAYINFO)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<String>(){

                    @Override
                    public void onCompleted() {
                        Log.e(TAG, "onCompleted ---> : xxxxxxxxxxxxxx ");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError ---> : " + e);

                    }

                    @Override
                    public void onNext(String result) {
                        Log.e(TAG, "result : " + result);

                    }
                });
    }

    @Override
    public void andLinkUserLogin(final AndLinkCallback<ResponseLoginUserBean> aluCallback) {
        Code4aRetrofit.getCode4aRetrofit()
                .create(Code4aService.class)
                .andLinkUserLogin(USER_LOGIN)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseLoginUserBean>() {
                    @Override
                    public void onCompleted() {
                        LogUtil.i(TAG, " ---- andLinkUserLogin ---- completed --------- ");
                        if (aluCallback != null) {
                            aluCallback.onCompleted();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        LogUtil.e(TAG, " ---- andLinkUserLogin ---- error:  " + e);
                        if (aluCallback != null) {
                            aluCallback.onError(e);
                        }
                    }

                    @Override
                    public void onNext(ResponseLoginUserBean responseLoginUserBean) {
                        LogUtil.i(TAG, " ---- andLinkUserLogin ---- next: responseLoginUserBean: " + responseLoginUserBean.toString());
                        if (SUCCESS_CODE.equals(responseLoginUserBean.getCode()) || SUCCESS_MSG.equals(responseLoginUserBean.getMsg())) {
                            if (aluCallback != null) {
                                aluCallback.onSuccess(responseLoginUserBean);
                            }
                        } else {
                            if (aluCallback != null) {
                                aluCallback.onFailed(responseLoginUserBean);
                            }
                        }
                    }
                });
    }

    @Override
    public void andLinkGetHubList(String key, final AndLinkCallback<ResponseGetDeviceListBean> alCallback) {
        Code4aRetrofit.getCode4aRetrofit()
                .create(Code4aService.class)
                .andLinkDeviceGetHubList(key)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseGetDeviceListBean>() {
                    @Override
                    public void onCompleted() {
                        LogUtil.i(TAG, " ---- andLinkGetHubList ---- completed --------- ");
                        if (alCallback != null) {
                            alCallback.onCompleted();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        LogUtil.e(TAG, " ---- andLinkGetHubList ---- error:  " + e);
                        if (alCallback != null) {
                            alCallback.onError(e);
                        }
                    }

                    @Override
                    public void onNext(ResponseGetDeviceListBean responseGetDeviceListBean) {
                        LogUtil.i(TAG, " ---- andLinkGetHubList ---- next: responseGetDeviceListBean: " + responseGetDeviceListBean.toString());
                        if (SUCCESS_CODE.equals(responseGetDeviceListBean.getCode()) || SUCCESS_MSG.equals(responseGetDeviceListBean.getMsg())) {
                            if (alCallback != null) {
                                alCallback.onSuccess(responseGetDeviceListBean);
                            }
                        } else {
                            if (alCallback != null) {
                                alCallback.onFailed(responseGetDeviceListBean.getCode());
                            }
                        }
                    }
                });
    }
}
