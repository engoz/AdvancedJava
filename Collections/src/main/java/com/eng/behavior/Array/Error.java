package com.eng.behavior.Array;

public class Error {


    private Integer code;
    private String error;

    public Error() {
    }

    public Error(Integer code, String error) {
        this.code = code;
        this.error = error;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Error Code = " + code + " Error Content : " + error;
    }

}
