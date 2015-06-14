package enums;

/**
 * 
 * @author NicolaiSonne
 *
 *         Enumerator for types of Data sources
 */
public enum EnumDataSourceType {

	LLRP(1, "reader_llrp"), ALIEN(2, "reader_alien");

	public Integer id;
	public String name;

	private EnumDataSourceType(Integer id, String name) {
		this.id = id;
		this.name = name;
	};

	public static EnumDataSourceType enumFromId(Integer id) throws Exception {
		switch (id) {
			case 1:
				return EnumDataSourceType.LLRP;
			case 2:
				return EnumDataSourceType.ALIEN;
			default:
				throw new Exception("Unknown id: " + id);
		}
	}
}
