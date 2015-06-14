package constants.database;

/**
 * 
 * @author NicolaiSonne
 *
 *         Schema for DataSource Container Relations
 */
public class KHSchemaDatasourceContainer extends KHSchema {

	public static final String TABLE_NAME = "datasource_container_relation";
	public static final String CN_DATA_SOURCE_ID = "datasource_id";
	public static final String CN_CONTAINER_ID = "container_id";
	public static final String CN_ANTENNA = "antenna";

	// @formatter:off
	public static final String SQL_CREATE = "CREATE TABLE " + TABLE_NAME + " (" + CN_ID + INTEGER_TYPE + PK + COMMA_SEP + CN_DATA_SOURCE_ID + INTEGER_TYPE
			+ COMMA_SEP + CN_CONTAINER_ID + INTEGER_TYPE + COMMA_SEP + CN_ANTENNA + INTEGER_TYPE + COMMA_SEP + FK_1 + CN_DATA_SOURCE_ID + FK_2
			+ KHSchemaDataSource.TABLE_NAME + FK_3 + KHSchemaDataSource.CN_ID + FK_4 + COMMA_SEP + FK_1 + CN_CONTAINER_ID + FK_2 + KHSchemaContainer.TABLE_NAME
			+ FK_3 + KHSchemaContainer.CN_ID + FK_4 + " )";
	// @formatter:on

	// A projection of all columns in the reader/container table.
	public static final String[] PROJECTION_ALL = { CN_ID, CN_DATA_SOURCE_ID, CN_CONTAINER_ID, CN_ANTENNA };
}