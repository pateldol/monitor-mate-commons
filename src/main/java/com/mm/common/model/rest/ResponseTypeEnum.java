package com.mm.common.model.rest;

/**
 * The enum Response type enum.
 *
 * @author vishsinha ON 01/05/2018
 * @classdesc
 * @project monitor-mate-apis
 */
public enum ResponseTypeEnum {

    /**
     * Ok response type enum.
     */
    OK("OK"),

    /**
     * Error response type enum.
     */
    ERROR("ERROR");

    /**
     * The Response type.
     */
    public String responseType;

    ResponseTypeEnum(String responseType) {
        this.responseType = responseType;
    }

    /**
     * Value string.
     *
     * @return the string
     */
    public String value() {
        return responseType;
    }

}
