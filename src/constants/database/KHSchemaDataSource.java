package constants.database;

/**
 * 
 * @author NicolaiSonne
 *
 *         Schema for Data Sources
 */
public class KHSchemaDataSource extends KHSchema {

	public static final String TABLE_NAME = "data_source";
	public static final String CN_IP_ADDRESS = "ip_address";
	public static final String CN_TYPE_ID = "type_id";

	// @formatter:off
	public static final String SQL_CREATE = "CREATE TABLE " + TABLE_NAME + " (" + CN_ID + INTEGER_TYPE + PK + COMMA_SEP + CN_IP_ADDRESS + TEXT_TYPE + COMMA_SEP
			+ CN_TYPE_ID + INTEGER_TYPE + " )";
	// @formatter:on

	// A projection of all columns in the data source table.
	public static final String[] PROJECTION_ALL = { CN_ID, CN_IP_ADDRESS, CN_TYPE_ID };
}