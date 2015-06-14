package constants.database;

/**
 * 
 * @author NicolaiSonne
 *
 *         Schema for Attribute Container
 */
public class KHSchemaAttrContainer extends KHSchema {

	public static final String TABLE_NAME = "attr_container";
	public static final String CN_PIM_ID = "product_info_meta_id";
	public static final String CN_NAME = "name";
	public static final String CN_SORT_ORDER = "sort_order";

	// @formatter:off
	public static final String SQL_CREATE = "CREATE TABLE " + TABLE_NAME + " (" + CN_ID + INTEGER_TYPE + PK + COMMA_SEP + CN_PIM_ID + INTEGER_TYPE + COMMA_SEP
			+ CN_NAME + TEXT_TYPE + COMMA_SEP + CN_SORT_ORDER + INTEGER_TYPE + COMMA_SEP + FK_1 + CN_PIM_ID + FK_2 + KHSchemaProductInfoMeta.TABLE_NAME + FK_3
			+ KHSchemaProductInfoMeta.CN_ID + FK_4 + " )";
	// @formatter:on

	// A projection of all columns in the containers table.
	public static final String[] PROJECTION_ALL = { CN_ID, CN_PIM_ID, CN_NAME, CN_SORT_ORDER };
}