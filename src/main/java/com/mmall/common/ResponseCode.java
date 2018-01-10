package com.mmall.common;

/**
 * enum 枚举类型
 * Created by Zhangkai Wan on 2017/11/13.
 */
public enum ResponseCode {

    //与前端约定的枚举类型
    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    NEED_LOGIN(10, "NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2, "ILLEGEL_AGUMENT");

    //两个属性
    private  final int code;
    private  final String desc;

    //枚举构造器
    ResponseCode(int code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public  int getCode(){
        return  code;
    }
    public  String getDesc(){
        return desc;
    }

}
