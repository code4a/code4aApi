package com.code4a.bean;

/**
 * Created by code4a on 2017/3/2.
 */

public class ResponseLoginUserBean {

//    {"code":"100001","msg":"success","time":"2017-03-02 17:04:08","data":{"token":"8da202514d8e4bc9af8d41493bf96244","expiresIn":2678400000,"userId":"4028858d59cf59480159cf5980b70000"}}

    /**
     * code : 000000
     * msg : success
     * time : 2016-09-18 16:25:56
     * data : {"userId":"\u201c302a0ea509f4f3996970acce1337hasd\u201d","token":"\u201c1091a0ea509f4f3996970acce1335d36\u201d","expiresIn":5183999}
     */

    private String code;
    private String msg;
    private String time;
    /**
     * userId : “302a0ea509f4f3996970acce1337hasd”
     * token : “1091a0ea509f4f3996970acce1335d36”
     * expiresIn : 5183999
     */

    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String userId;
        private String token;
        private long expiresIn;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public long getExpiresIn() {
            return expiresIn;
        }

        public void setExpiresIn(long expiresIn) {
            this.expiresIn = expiresIn;
        }

        @Override
        public String toString() {
            return "{" +
                    "userId='" + userId + '\'' +
                    ", token='" + token + '\'' +
                    ", expiresIn=" + expiresIn +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", time='" + time + '\'' +
                ", data=" + data +
                '}';
    }
}
