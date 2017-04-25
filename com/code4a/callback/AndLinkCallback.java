package com.code4a.callback;

/**
 * Created by code4a on 2017/3/2.
 */

public interface AndLinkCallback<T> {

    void onCompleted();

//    void onError();

    void onError(Throwable throwable);

    void onFailed(Object obj);

    void onSuccess(T t);
}
