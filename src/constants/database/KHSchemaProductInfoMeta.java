package constants.database;

/**
 * 
 * @author NicolaiSonne
 *
 */
public class KHSchemaProductInfoMeta extends KHSchema {

	public static final String TABLE_NAME = "product_info_meta";
	public static final String CN_URN = "urn";
	public static final String CN_VERSION = "version";

	// @formatter:off
	public static final String SQL_CREATE = "CREATE TABLE " + TABLE_NAME + " ("
			+ CN_ID + INTEGER_TYPE + PK + COMMA_SEP
			+ CN_URN + TEXT_TYPE + COMMA_SEP
			+ CN_VERSION + INTEGER_TYPE
			+ " )";
	// @formatter:on

	// A projection of all columns in the containers table.
	public static final String[] PROJECTION_ALL = { CN_ID, CN_URN, CN_VERSION };
}