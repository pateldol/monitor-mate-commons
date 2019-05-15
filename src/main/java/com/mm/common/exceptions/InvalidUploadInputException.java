package com.mm.common.exceptions;

import com.mm.common.constatnts.CommonConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class ForeignKeyViolationException.
 */
public class InvalidUploadInputException extends Exception {
   
	/**
	 * Instantiates a new foreign key violation exception.
	 */
	public InvalidUploadInputException() {
		super(CommonConstants.INVALID_UPLOAD_INPUT, new Throwable(CommonConstants.FILE_HEADER_MISMATCH_MESSAGE));
	}
	
	/**
	 * Instantiates a new foreign key violation exception.
	 *
	 * @param message the message
	 */
	public InvalidUploadInputException(String name, String mappingName){
		super(CommonConstants.INVALID_UPLOAD_INPUT, new Throwable("'" + name + "' is already associated with one or more "+ mappingName +"! Please remove mapping first to delete this from DataEZ system."));
	}

    
}
