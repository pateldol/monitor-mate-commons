package com.mm.common.model.rest;

import java.util.UUID;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.mm.common.constatnts.RestServiceConstants;
import com.mm.common.exceptions.DataEZServiceErrorInfo;
import com.mm.common.exceptions.DataEZServiceException;

/**
 * @author vishsinha ON 30/04/2018
 * @classdesc
 * @project monitor-mate-apis
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Metadata {

    private String serviceReferenceId;
    private Integer status;
    private String type;
    private String message;
    private Integer code;
    private DataEZServiceErrorInfo dataEZServiceErrorInfo;


    public void setServiceReferenceId(String serviceReferenceId) {
        if(serviceReferenceId!=null) {
            this.serviceReferenceId = serviceReferenceId;
        } else {
            this.serviceReferenceId = UUID.randomUUID().toString();
        }
    }

    public String getServiceReferenceId() {

        if(this.serviceReferenceId!=null) {
           return serviceReferenceId;
        } else {
           return UUID.randomUUID().toString();
        }
    }


    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Sets success outcome.
     */
    public void setSuccessOutcome() {
        this.serviceReferenceId = getServiceReferenceId();
        this.status = HttpStatus.OK.value();
        this.type = ResponseTypeEnum.OK.value();
        this.message = RestServiceConstants.REST_SERVICE_SUCCESS_MSG;
        this.code = RestServiceConstants.REST_SERVICE_SUCCESS_CODE;
    }


    public void setErrorOutcome(DataEZServiceException dataEZServiceException) {
        this.serviceReferenceId = getServiceReferenceId();
        this.status = HttpStatus.CONFLICT.value();
        this.type = ResponseTypeEnum.ERROR.value();
        this.dataEZServiceErrorInfo = dataEZServiceException.getDataEZServiceErrorInfo();
        this.code = RestServiceConstants.REST_SERVICE_ERROR_CODE;
    }

    public DataEZServiceErrorInfo getDataEZServiceErrorInfo() {
        return dataEZServiceErrorInfo;
    }

    public void setDataEZServiceErrorInfo(DataEZServiceErrorInfo dataEZServiceErrorInfo) {
        this.dataEZServiceErrorInfo = dataEZServiceErrorInfo;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "serviceReferenceId='" + serviceReferenceId + '\'' +
                ", status=" + status +
                ", type='" + type + '\'' +
                ", message='" + message + '\'' +
                ", code=" + code +
                ", dataEZServiceErrorInfo=" + dataEZServiceErrorInfo +
                '}';
    }
}
