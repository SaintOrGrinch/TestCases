package com.exquisite.testcases.model;

public enum ResultStatus {
    NOT_EXECUTED("0"),
    SUCCESSFUL("1"),
    OK_WITH_COMMENTS("2"),
    UNSUCCESFUL("3");

    private String code;

    ResultStatus(String code){
        this.code = code;
    }

    public String getCode(){
        return this.code;
    }
}


