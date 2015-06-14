package constants.database;

/**
 * 
 * @author NicolaiSonne
 *
 *         Schema for Containers
 */
public class KHSchemaContainer extends KHSchema {

	public static final String TABLE_NAME = "container";
	public static final String CN_NAME = "name";
	public static final String CN_TYPE_ID = "type_id";

	// @formatter:off
	public static final String SQL_CREATE = "CREATE TABLE " + TABLE_NAME + " (" + CN_ID + INTEGER_TYPE + PK + COMMA_SEP + CN_NAME + TEXT_TYPE + COMMA_SEP
			+ CN_TYPE_ID + INTEGER_TYPE + " )";
	// @formatter:on

	// A projection of all columns in the containers table.
	public static final String[] PROJECTION_ALL = { CN_ID, CN_NAME, CN_TYPE_ID };
}