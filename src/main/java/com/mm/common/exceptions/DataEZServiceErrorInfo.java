package com.mm.common.exceptions;

/**
 * @author vishsinha ON 08/05/2018
 * @classdesc
 * @project monitor-mate-apis
 */
//@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DataEZServiceErrorInfo {
    private String errorMessage;
    private Integer dataEZErrorCode;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Integer getDataEZErrorCode() {
        return dataEZErrorCode;
    }

    public void setDataEZErrorCode(Integer dataEZErrorCode) {
        this.dataEZErrorCode = dataEZErrorCode;
    }

    @Override
    public String toString() {
        return "DataEZServiceErrorInfo{" +
                "errorMessage='" + errorMessage + '\'' +
                ", dataEZErrorCode=" + dataEZErrorCode +
                '}';
    }
}
