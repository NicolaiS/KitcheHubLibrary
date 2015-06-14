package constants.database;

/**
 * 
 * @author NicolaiSonne
 *
 *         Schema for Products
 */
public class KHSchemaProduct extends KHSchema {

	public static final String TABLE_NAME = "product";
	public static final String CN_CONTAINER_ID = "container_id";
	public static final String CN_INDICATOR = "indicator";
	public static final String CN_COMPANY_PREFIX = "company_prefix";
	public static final String CN_ITEM_REFERENCE_NUMBER = "item_reference_number";
	public static final String CN_SERIAL_NUMBER = "serial_number";
	public static final String CN_CHECKSUM = "checksum";
	public static final String CN_PRESENT = "present";
	public static final String CN_LAST_EDIT = "last_edit";

	// @formatter:off
	public static final String SQL_CREATE = "CREATE TABLE " + TABLE_NAME + " (" + CN_ID + INTEGER_TYPE + PK + COMMA_SEP + CN_CONTAINER_ID + INTEGER_TYPE
			+ COMMA_SEP + CN_INDICATOR + INTEGER_TYPE + COMMA_SEP + CN_COMPANY_PREFIX + TEXT_TYPE + COMMA_SEP + CN_ITEM_REFERENCE_NUMBER + TEXT_TYPE
			+ COMMA_SEP + CN_SERIAL_NUMBER + TEXT_TYPE + COMMA_SEP + CN_CHECKSUM + INTEGER_TYPE + COMMA_SEP + CN_PRESENT + INTEGER_TYPE + COMMA_SEP
			+ CN_LAST_EDIT + INTEGER_TYPE + COMMA_SEP + FK_1 + CN_CONTAINER_ID + FK_2 + KHSchemaContainer.TABLE_NAME + FK_3 + KHSchemaContainer.CN_ID + FK_4
			+ " )";
	// @formatter:on

	// A projection of all columns in the items table.
	public static final String[] PROJECTION_ALL = { CN_ID, CN_CONTAINER_ID, CN_INDICATOR, CN_COMPANY_PREFIX, CN_ITEM_REFERENCE_NUMBER, CN_SERIAL_NUMBER,
			CN_CHECKSUM, CN_PRESENT, CN_LAST_EDIT };

}