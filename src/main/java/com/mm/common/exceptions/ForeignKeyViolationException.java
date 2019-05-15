package com.mm.common.exceptions;

import com.mm.common.constatnts.CommonConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class ForeignKeyViolationException.
 */
public class ForeignKeyViolationException extends Exception {
   
	/**
	 * Instantiates a new foreign key violation exception.
	 */
	public ForeignKeyViolationException() {
		super(CommonConstants.FOREIGN_KEY_VIOLATON, new Throwable(CommonConstants.FOREIGN_KEY_VIOLATON_MESSAGE));
	}
	
	/**
	 * Instantiates a new foreign key violation exception.
	 *
	 * @param message the message
	 */
	public ForeignKeyViolationException(String name, String mappingName){
		super(CommonConstants.FOREIGN_KEY_VIOLATON, new Throwable("'" + name + "' is already associated with one or more "+ mappingName +"! Please remove mapping first to delete this from DataEZ system."));
	}

    
}
