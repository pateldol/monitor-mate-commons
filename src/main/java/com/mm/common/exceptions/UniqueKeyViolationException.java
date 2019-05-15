package com.mm.common.exceptions;

import com.mm.common.constatnts.CommonConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class ForeignKeyViolationException.
 */
public class UniqueKeyViolationException extends Exception {
   
	/**
	 * Instantiates a new foreign key violation exception.
	 */
	public UniqueKeyViolationException() {
		super(CommonConstants.UNIQUE_KEY_VIOLATON, new Throwable(CommonConstants.UNIQUE_KEY_VIOLATON_MESSAGE));
	}
	
	/**
	 * Instantiates a new foreign key violation exception.
	 *
	 * @param message the message
	 */
	public UniqueKeyViolationException(String name, String mappingName){
		super(CommonConstants.UNIQUE_KEY_VIOLATON, new Throwable( mappingName + " with '" + name + "' unique name is already existed into DataEZ system!"));
	}

    
}
