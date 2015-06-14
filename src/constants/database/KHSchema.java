package constants.database;

/**
 * @author NicolaiSonne
 * 
 *         Schema basis
 */
public abstract class KHSchema {

	protected static String TABLE_NAME;

	protected static final String PK = " PRIMARY KEY AUTOINCREMENT";

	protected static final String FK_1 = "FOREIGN KEY(";
	protected static final String FK_2 = ") REFERENCES ";
	protected static final String FK_3 = "(";
	protected static final String FK_4 = ")";

	public static final String CN_ID = "_id";

	protected static final String TEXT_TYPE = " TEXT";
	protected static final String INTEGER_TYPE = " INTEGER";
	protected static final String COMMA_SEP = ",";

	public static final String SQL_DELETE = "DROP TABLE IF EXISTS " + TABLE_NAME;
}
