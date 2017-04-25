package com.code4a.bean;

import java.util.List;

/**
 * Created by code4a on 2017/3/6.
 */

public class ResponseGetDeviceListBean {

    /**
     * code : 000000
     * msg : success
     * time : 2017-04-01 17:41:01
     * data : {"total":12,"list":[{"deviceId":"402881e75ab70e4e015ab75336270215","deviceToken":"2c5595a9f06e491d87716903e3de11d5","deviceName":"智能锁A","typeId":"15","typeCode":"intelligent_lock","typeName":"智能锁","online":1,"sn":"3H8JLKA7N15","status":2,"mac":"A6:BB:cc:DD:EE:15","localIp":"192.168.1.128","factoryId":"1","factoryName":"中国移动","model":"MK98-SAD1","electricity":50,"hardwareVersion":"1.01-e","platformVersion":"linux 2.6","andlinkVersion":"1.0","bindDeviceId":"","hasChildDevice":0,"parentDeviceId":"402881e75ab70e4e015ab7533487000f","regTimeStr":"2017-04-01 17:24:34","productionDateStr":"2017-01-12","isThirdDevice":0,"thirdDeviceRegType":0,"thirdPlatformCode":"","thirdPlatformName":"","thirdPlatformDeviceId":""},{"deviceId":"402881e75ab70e4e015ab75336270214","deviceToken":"2c5595a9f06e491d87716903e3de11d5","deviceName":"声光报警器A","typeId":"14","typeCode":"sound_and_light_alarm","typeName":"声光报警器","online":1,"sn":"3H8JLKA7N14","status":2,"mac":"A6:BB:cc:DD:EE:14","localIp":"192.168.1.127","factoryId":"1","factoryName":"中国移动","model":"MK98-SAD1","electricity":50,"hardwareVersion":"1.01-e","platformVersion":"linux 2.6","andlinkVersion":"1.0","bindDeviceId":"","hasChildDevice":0,"parentDeviceId":"402881e75ab70e4e015ab7533487000f","regTimeStr":"2017-04-01 17:24:29","productionDateStr":"2017-01-12","isThirdDevice":0,"thirdDeviceRegType":0,"thirdPlatformCode":"","thirdPlatformName":"","thirdPlatformDeviceId":""},{"deviceId":"402881e75ab70e4e015ab75336270213","deviceToken":"2c5595a9f06e491d87716903e3de11d5","deviceName":"可燃气体检测器A","typeId":"13","typeCode":"combustible_gas_detector","typeName":"可燃气体检测器","online":1,"sn":"3H8JLKA7N13","status":2,"mac":"A6:BB:cc:DD:EE:13","localIp":"192.168.1.126","factoryId":"1","factoryName":"中国移动","model":"MK98-SAD1","electricity":50,"hardwareVersion":"1.01-e","platformVersion":"linux 2.6","andlinkVersion":"1.0","bindDeviceId":"","hasChildDevice":0,"parentDeviceId":"402881e75ab70e4e015ab7533487000f","regTimeStr":"2017-04-01 17:24:24","productionDateStr":"2017-01-12","isThirdDevice":0,"thirdDeviceRegType":0,"thirdPlatformCode":"","thirdPlatformName":"","thirdPlatformDeviceId":""},{"deviceId":"402881e75ab70e4e015ab75336270212","deviceToken":"2c5595a9f06e491d87716903e3de11d5","deviceName":"震动感应报警A","typeId":"12","typeCode":"vibration_sensor","typeName":"震动感应报警","online":1,"sn":"3H8JLKA7N12","status":2,"mac":"A6:BB:cc:DD:EE:12","localIp":"192.168.1.125","factoryId":"1","factoryName":"中国移动","model":"MK98-SAD1","electricity":50,"hardwareVersion":"1.01-e","platformVersion":"linux 2.6","andlinkVersion":"1.0","bindDeviceId":"","hasChildDevice":0,"parentDeviceId":"402881e75ab70e4e015ab7533487000f","regTimeStr":"2017-04-01 17:24:18","productionDateStr":"2017-01-12","isThirdDevice":0,"thirdDeviceRegType":0,"thirdPlatformCode":"","thirdPlatformName":"","thirdPlatformDeviceId":""},{"deviceId":"402881e75ab70e4e015ab75336270211","deviceToken":"2c5595a9f06e491d87716903e3de11d5","deviceName":"水浸A","typeId":"11","typeCode":"water_sensor","typeName":"水浸感应器","online":1,"sn":"3H8JLKA7N11","status":2,"mac":"A6:BB:cc:DD:EE:11","localIp":"192.168.1.124","factoryId":"1","factoryName":"中国移动","model":"MK98-SAD1","electricity":50,"hardwareVersion":"1.01-e","platformVersion":"linux 2.6","andlinkVersion":"1.0","bindDeviceId":"","hasChildDevice":0,"parentDeviceId":"402881e75ab70e4e015ab7533487000f","regTimeStr":"2017-04-01 17:24:13","productionDateStr":"2017-01-12","isThirdDevice":0,"thirdDeviceRegType":0,"thirdPlatformCode":"","thirdPlatformName":"","thirdPlatformDeviceId":""}]}
     */

    private String code;
    private String msg;
    private String time;
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
        /**
         * total : 12
         * list : [{"deviceId":"402881e75ab70e4e015ab75336270215","deviceToken":"2c5595a9f06e491d87716903e3de11d5","deviceName":"智能锁A","typeId":"15","typeCode":"intelligent_lock","typeName":"智能锁","online":1,"sn":"3H8JLKA7N15","status":2,"mac":"A6:BB:cc:DD:EE:15","localIp":"192.168.1.128","factoryId":"1","factoryName":"中国移动","model":"MK98-SAD1","electricity":50,"hardwareVersion":"1.01-e","platformVersion":"linux 2.6","andlinkVersion":"1.0","bindDeviceId":"","hasChildDevice":0,"parentDeviceId":"402881e75ab70e4e015ab7533487000f","regTimeStr":"2017-04-01 17:24:34","productionDateStr":"2017-01-12","isThirdDevice":0,"thirdDeviceRegType":0,"thirdPlatformCode":"","thirdPlatformName":"","thirdPlatformDeviceId":""},{"deviceId":"402881e75ab70e4e015ab75336270214","deviceToken":"2c5595a9f06e491d87716903e3de11d5","deviceName":"声光报警器A","typeId":"14","typeCode":"sound_and_light_alarm","typeName":"声光报警器","online":1,"sn":"3H8JLKA7N14","status":2,"mac":"A6:BB:cc:DD:EE:14","localIp":"192.168.1.127","factoryId":"1","factoryName":"中国移动","model":"MK98-SAD1","electricity":50,"hardwareVersion":"1.01-e","platformVersion":"linux 2.6","andlinkVersion":"1.0","bindDeviceId":"","hasChildDevice":0,"parentDeviceId":"402881e75ab70e4e015ab7533487000f","regTimeStr":"2017-04-01 17:24:29","productionDateStr":"2017-01-12","isThirdDevice":0,"thirdDeviceRegType":0,"thirdPlatformCode":"","thirdPlatformName":"","thirdPlatformDeviceId":""},{"deviceId":"402881e75ab70e4e015ab75336270213","deviceToken":"2c5595a9f06e491d87716903e3de11d5","deviceName":"可燃气体检测器A","typeId":"13","typeCode":"combustible_gas_detector","typeName":"可燃气体检测器","online":1,"sn":"3H8JLKA7N13","status":2,"mac":"A6:BB:cc:DD:EE:13","localIp":"192.168.1.126","factoryId":"1","factoryName":"中国移动","model":"MK98-SAD1","electricity":50,"hardwareVersion":"1.01-e","platformVersion":"linux 2.6","andlinkVersion":"1.0","bindDeviceId":"","hasChildDevice":0,"parentDeviceId":"402881e75ab70e4e015ab7533487000f","regTimeStr":"2017-04-01 17:24:24","productionDateStr":"2017-01-12","isThirdDevice":0,"thirdDeviceRegType":0,"thirdPlatformCode":"","thirdPlatformName":"","thirdPlatformDeviceId":""},{"deviceId":"402881e75ab70e4e015ab75336270212","deviceToken":"2c5595a9f06e491d87716903e3de11d5","deviceName":"震动感应报警A","typeId":"12","typeCode":"vibration_sensor","typeName":"震动感应报警","online":1,"sn":"3H8JLKA7N12","status":2,"mac":"A6:BB:cc:DD:EE:12","localIp":"192.168.1.125","factoryId":"1","factoryName":"中国移动","model":"MK98-SAD1","electricity":50,"hardwareVersion":"1.01-e","platformVersion":"linux 2.6","andlinkVersion":"1.0","bindDeviceId":"","hasChildDevice":0,"parentDeviceId":"402881e75ab70e4e015ab7533487000f","regTimeStr":"2017-04-01 17:24:18","productionDateStr":"2017-01-12","isThirdDevice":0,"thirdDeviceRegType":0,"thirdPlatformCode":"","thirdPlatformName":"","thirdPlatformDeviceId":""},{"deviceId":"402881e75ab70e4e015ab75336270211","deviceToken":"2c5595a9f06e491d87716903e3de11d5","deviceName":"水浸A","typeId":"11","typeCode":"water_sensor","typeName":"水浸感应器","online":1,"sn":"3H8JLKA7N11","status":2,"mac":"A6:BB:cc:DD:EE:11","localIp":"192.168.1.124","factoryId":"1","factoryName":"中国移动","model":"MK98-SAD1","electricity":50,"hardwareVersion":"1.01-e","platformVersion":"linux 2.6","andlinkVersion":"1.0","bindDeviceId":"","hasChildDevice":0,"parentDeviceId":"402881e75ab70e4e015ab7533487000f","regTimeStr":"2017-04-01 17:24:13","productionDateStr":"2017-01-12","isThirdDevice":0,"thirdDeviceRegType":0,"thirdPlatformCode":"","thirdPlatformName":"","thirdPlatformDeviceId":""}]
         */

        private int total;
        private List<ListBean> list;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * deviceId : 402881e75ab70e4e015ab75336270215
             * deviceToken : 2c5595a9f06e491d87716903e3de11d5
             * deviceName : 智能锁A
             * typeId : 15
             * typeCode : intelligent_lock
             * typeName : 智能锁
             * online : 1
             * sn : 3H8JLKA7N15
             * status : 2
             * mac : A6:BB:cc:DD:EE:15
             * localIp : 192.168.1.128
             * factoryId : 1
             * factoryName : 中国移动
             * model : MK98-SAD1
             * electricity : 50
             * hardwareVersion : 1.01-e
             * platformVersion : linux 2.6
             * andlinkVersion : 1.0
             * bindDeviceId :
             * hasChildDevice : 0
             * parentDeviceId : 402881e75ab70e4e015ab7533487000f
             * regTimeStr : 2017-04-01 17:24:34
             * productionDateStr : 2017-01-12
             * isThirdDevice : 0
             * thirdDeviceRegType : 0
             * thirdPlatformCode :
             * thirdPlatformName :
             * thirdPlatformDeviceId :
             */

            private String deviceId;
            private String deviceToken;
            private String deviceName;
            private String typeId;
            private String typeCode;
            private String typeName;
            private int online;
            private String sn;
            private int status;
            private String mac;
            private String localIp;
            private String factoryId;
            private String factoryName;
            private String model;
            private int electricity;
            private String hardwareVersion;
            private String platformVersion;
            private String andlinkVersion;
            private String bindDeviceId;
            private int hasChildDevice;
            private String parentDeviceId;
            private String regTimeStr;
            private String productionDateStr;
            private int isThirdDevice;
            private int thirdDeviceRegType;
            private String thirdPlatformCode;
            private String thirdPlatformName;
            private String thirdPlatformDeviceId;

            public String getDeviceId() {
                return deviceId;
            }

            public void setDeviceId(String deviceId) {
                this.deviceId = deviceId;
            }

            public String getDeviceToken() {
                return deviceToken;
            }

            public void setDeviceToken(String deviceToken) {
                this.deviceToken = deviceToken;
            }

            public String getDeviceName() {
                return deviceName;
            }

            public void setDeviceName(String deviceName) {
                this.deviceName = deviceName;
            }

            public String getTypeId() {
                return typeId;
            }

            public void setTypeId(String typeId) {
                this.typeId = typeId;
            }

            public String getTypeCode() {
                return typeCode;
            }

            public void setTypeCode(String typeCode) {
                this.typeCode = typeCode;
            }

            public String getTypeName() {
                return typeName;
            }

            public void setTypeName(String typeName) {
                this.typeName = typeName;
            }

            public int getOnline() {
                return online;
            }

            public void setOnline(int online) {
                this.online = online;
            }

            public String getSn() {
                return sn;
            }

            public void setSn(String sn) {
                this.sn = sn;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getMac() {
                return mac;
            }

            public void setMac(String mac) {
                this.mac = mac;
            }

            public String getLocalIp() {
                return localIp;
            }

            public void setLocalIp(String localIp) {
                this.localIp = localIp;
            }

            public String getFactoryId() {
                return factoryId;
            }

            public void setFactoryId(String factoryId) {
                this.factoryId = factoryId;
            }

            public String getFactoryName() {
                return factoryName;
            }

            public void setFactoryName(String factoryName) {
                this.factoryName = factoryName;
            }

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }

            public int getElectricity() {
                return electricity;
            }

            public void setElectricity(int electricity) {
                this.electricity = electricity;
            }

            public String getHardwareVersion() {
                return hardwareVersion;
            }

            public void setHardwareVersion(String hardwareVersion) {
                this.hardwareVersion = hardwareVersion;
            }

            public String getPlatformVersion() {
                return platformVersion;
            }

            public void setPlatformVersion(String platformVersion) {
                this.platformVersion = platformVersion;
            }

            public String getAndlinkVersion() {
                return andlinkVersion;
            }

            public void setAndlinkVersion(String andlinkVersion) {
                this.andlinkVersion = andlinkVersion;
            }

            public String getBindDeviceId() {
                return bindDeviceId;
            }

            public void setBindDeviceId(String bindDeviceId) {
                this.bindDeviceId = bindDeviceId;
            }

            public int getHasChildDevice() {
                return hasChildDevice;
            }

            public void setHasChildDevice(int hasChildDevice) {
                this.hasChildDevice = hasChildDevice;
            }

            public String getParentDeviceId() {
                return parentDeviceId;
            }

            public void setParentDeviceId(String parentDeviceId) {
                this.parentDeviceId = parentDeviceId;
            }

            public String getRegTimeStr() {
                return regTimeStr;
            }

            public void setRegTimeStr(String regTimeStr) {
                this.regTimeStr = regTimeStr;
            }

            public String getProductionDateStr() {
                return productionDateStr;
            }

            public void setProductionDateStr(String productionDateStr) {
                this.productionDateStr = productionDateStr;
            }

            public int getIsThirdDevice() {
                return isThirdDevice;
            }

            public void setIsThirdDevice(int isThirdDevice) {
                this.isThirdDevice = isThirdDevice;
            }

            public int getThirdDeviceRegType() {
                return thirdDeviceRegType;
            }

            public void setThirdDeviceRegType(int thirdDeviceRegType) {
                this.thirdDeviceRegType = thirdDeviceRegType;
            }

            public String getThirdPlatformCode() {
                return thirdPlatformCode;
            }

            public void setThirdPlatformCode(String thirdPlatformCode) {
                this.thirdPlatformCode = thirdPlatformCode;
            }

            public String getThirdPlatformName() {
                return thirdPlatformName;
            }

            public void setThirdPlatformName(String thirdPlatformName) {
                this.thirdPlatformName = thirdPlatformName;
            }

            public String getThirdPlatformDeviceId() {
                return thirdPlatformDeviceId;
            }

            public void setThirdPlatformDeviceId(String thirdPlatformDeviceId) {
                this.thirdPlatformDeviceId = thirdPlatformDeviceId;
            }
        }
    }
}
