package com.mm.common.constatnts;

/**
 * @author vsinha ON 29/05/2018
 * @classdesc
 * @project monitor-mate-apis
 */
public class CommonConstants {
	
	public static String DEZ_SYSTEM_USER = "dezsystem";
    /**
     * The constant COLON.
     */
    public static String COLON = ":";
    public static String COMMA = ",";
    public static String DOT = ".";
    public static String STAR = "*";
    public static String UNDER_SCORE = "_";
    public static String FORWARD_SLASH = "/";
    public static String SPLIT_PIPE_DELIMITER = "\\|";
    public static String PIPE_DELIMITER = "|";
    public static String JSON_ARROW = "->>";
    public static String SINGLE_QUOTE = "'";

    public static String FOREIGN_KEY_VIOLATON = "Foreign key violation";

    public static String UNIQUE_KEY_VIOLATON = "Unique key violation";

    public static String INVALID_UPLOAD_INPUT = "Invalid Upload Input";

    public static String FILE_HEADER_MISMATCH_MESSAGE = "Uploaded Data file header list not matching with the template attribute. Please fix the same and try again!";

    public static String FOREIGN_KEY_VIOLATON_MESSAGE = "This is already associated with other mapping! Please remove mapping first to delete this from DataEZ system.";

    public static String UNIQUE_KEY_VIOLATON_MESSAGE = "Unique key violation exception!";

    public static String DATAEZ_EXCEPTION_MESSAGE = "Please contact System Administrator with this screen shot or the text below: ";

    
    public static final String REQ_HEADER_TENANT_ID = "XTenantID";
    public static final String REQ_AUTH_TOKEN = "Authorization";
    public static final String VALIDATE_USER_API = "http://localhost:9000/monitor-mate-apis/api/isValid";

    public static final String MSG_INVALID_TENANT_ID = "[!] DataSource not found for given tenant Id '{}'!";
    public static final String MSG_INVALID_DB_PROPERTIES_ID = "[!] DataSource properties related to the given tenant ('{}') is invalid!";
    public static final String MSG_RESOLVING_TENANT_ID = "[!] Could not resolve tenant ID '{}'!";

    public static final String TID = "XTenantID";

}
