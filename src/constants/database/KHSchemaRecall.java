package constants.database;

/**
 * 
 * @author NicolaiSonne
 *
 *         Schema for Recall
 */

public class KHSchemaRecall extends KHSchema {

	public static final String TABLE_NAME = "recall";
	public static final String CN_URN = "urn";
	public static final String CN_RECALL_SERIAL = "recall_serial";
	public static final String CN_ISSUE_DATE = "issue_date";
	public static final String CN_DESCRIPTION = "description";
	public static final String CN_DANGER = "danger";
	public static final String CN_INSTRUCTIONS = "instructions";
	public static final String CN_ACCEPTED = "accepted";
	public static final String CN_VERSION = "version";

	// @formatter:off
	public static final String SQL_CREATE = "CREATE TABLE " + TABLE_NAME + " (" + CN_ID + INTEGER_TYPE + PK + COMMA_SEP + CN_URN + TEXT_TYPE + COMMA_SEP
			+ CN_RECALL_SERIAL + TEXT_TYPE + COMMA_SEP + CN_ISSUE_DATE + INTEGER_TYPE + COMMA_SEP + CN_DESCRIPTION + TEXT_TYPE + COMMA_SEP + CN_DANGER
			+ TEXT_TYPE + COMMA_SEP + CN_INSTRUCTIONS + TEXT_TYPE + COMMA_SEP + CN_ACCEPTED + INTEGER_TYPE + COMMA_SEP + CN_VERSION + INTEGER_TYPE + " )";
	// @formatter:on

	// A projection of all columns in the containers table.
	public static final String[] PROJECTION_ALL = { CN_ID, CN_URN, CN_RECALL_SERIAL, CN_ISSUE_DATE, CN_DESCRIPTION, CN_DANGER, CN_INSTRUCTIONS, CN_ACCEPTED,
			CN_VERSION };

}
