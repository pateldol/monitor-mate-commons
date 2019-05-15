package com.mm.common.exceptions;

import com.mm.common.constatnts.CommonConstants;

/**
 * The type Data ez service exception.
 *
 * @author vishsinha ON 01/05/2018
 * @classdesc
 * @project monitor-mate-apis
 */
public class DataEZServiceException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7707590869992388383L;
	private String serviceReferenceId;
    private DataEZServiceErrorInfo dataEZServiceErrorInfo;

    /**
     * Instantiates a new Data ez service exception.
     *  @param serviceReferenceId the service reference id
     * @param throwable          the error code
     */
    public DataEZServiceException(String serviceReferenceId, Throwable throwable) {
        this.serviceReferenceId = serviceReferenceId;
        //this.errorCode = errorCode;
        buildDataEZServiceErrorInfo(throwable);

    }

    /**
     * Instantiates a new Data ez service exception.
     */
    public DataEZServiceException(String message) {
        this.serviceReferenceId = "ERROR";
        //this.errorCode = errorCode;
        buildDataEZServiceErrorInfo(message);

    }

    private void buildDataEZServiceErrorInfo(Throwable throwable) {
        DataEZServiceErrorInfo dataEZServiceErrorInfo = new DataEZServiceErrorInfo();
        String errorMessage = CommonConstants.DATAEZ_EXCEPTION_MESSAGE;
        if(throwable!=null && throwable.getCause()!=null) {
        	errorMessage += throwable.getCause().getMessage();
        }else if(throwable != null && throwable.getMessage() != "") {
        	errorMessage += throwable.getMessage();
        }
        dataEZServiceErrorInfo.setErrorMessage(errorMessage);
        this.setDataEZServiceErrorInfo(dataEZServiceErrorInfo);
    }

    private void buildDataEZServiceErrorInfo(String errorMessage) {
        DataEZServiceErrorInfo dataEZServiceErrorInfo = new DataEZServiceErrorInfo();
        dataEZServiceErrorInfo.setErrorMessage(errorMessage);
        this.setDataEZServiceErrorInfo(dataEZServiceErrorInfo);
    }
    /**
     * Gets service reference id.
     *
     * @return the service reference id
     */
    public String getServiceReferenceId() {
        return serviceReferenceId;
    }

    /**
     * Sets service reference id.
     *
     * @param serviceReferenceId the service reference id
     */
    public void setServiceReferenceId(String serviceReferenceId) {
        this.serviceReferenceId = serviceReferenceId;
    }

    public DataEZServiceErrorInfo getDataEZServiceErrorInfo() {
        return dataEZServiceErrorInfo;
    }

    public void setDataEZServiceErrorInfo(DataEZServiceErrorInfo dataEZServiceErrorInfo) {
        this.dataEZServiceErrorInfo = dataEZServiceErrorInfo;
    }

    @Override
    public String toString() {
        return "DataEZServiceException{" +
                "serviceReferenceId='" + serviceReferenceId + '\'' +
                ", dataEZServiceErrorInfo=" + dataEZServiceErrorInfo +
                '}';
    }
}
