package constants.database;

/**
 * 
 * @author NicolaiSonne
 *
 *         Schema for Attributes
 */
public class KHSchemaAttribute extends KHSchemaAttributeBase {

	public static final String TABLE_NAME = "attribute";
	public static final String CN_PIM_ID = "product_info_meta_id";

	// @formatter:off
	public static final String SQL_CREATE = "CREATE TABLE " + TABLE_NAME + " (" + CN_ID + INTEGER_TYPE + PK + COMMA_SEP + CN_PIM_ID + INTEGER_TYPE + COMMA_SEP
			+ CN_ATTR_KEY + TEXT_TYPE + COMMA_SEP + CN_ATTR_NAME + TEXT_TYPE + COMMA_SEP + CN_ATTR_VALUE + TEXT_TYPE + COMMA_SEP + CN_ATTR_TYPE_ID
			+ INTEGER_TYPE + COMMA_SEP + CN_VALUE_FORMAT + TEXT_TYPE + COMMA_SEP + CN_SORT_ORDER + INTEGER_TYPE + COMMA_SEP + FK_1 + CN_PIM_ID + FK_2
			+ KHSchemaProductInfoMeta.TABLE_NAME + FK_3 + KHSchemaProductInfoMeta.CN_ID + FK_4 + " )";
	// @formatter:on

	// A projection of all columns in the containers table.
	public static final String[] PROJECTION_ALL = { CN_ID, CN_PIM_ID, CN_ATTR_KEY, CN_ATTR_NAME, CN_ATTR_VALUE, CN_ATTR_TYPE_ID, CN_VALUE_FORMAT, CN_SORT_ORDER };
}