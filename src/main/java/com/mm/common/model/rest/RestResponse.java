package com.mm.common.model.rest;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The type Rest response.
 *
 * @author vishsinha ON 30/04/2018
 * @classdesc
 * @project monitor-mate-apis
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RestResponse extends ServiceResponse {

    public RestResponse() {
        super();
    }

    /**
     * The Response data.
     */
    Object responseData;

    /**
     * Gets response data.
     *
     * @return the response data
     */
    public Object getResponseData() {
        return responseData;
    }

    /**
     * Sets response data.
     *
     * @param responseData the response data
     */
    public void setResponseData(Object responseData) {
        this.responseData = responseData;
    }

    @Override
    public String toString() {
        return "RestResponse{" +
                "responseData=" + responseData +
                '}';
    }
}
