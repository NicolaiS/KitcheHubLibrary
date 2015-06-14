package enums;

/**
 * 
 * @author NicolaiSonne
 *
 *         Enumerator for types of Containers
 */
public enum EnumContainerType {

	REFRIGERATED(1, "container_refrigerated"), FREEZER(2, "container_freezer"), LIVING_ROOM_TEMP(
			3, "container_living_room_temp");

	public Integer id;
	public String	 name;

	private EnumContainerType(Integer id, String name) {
		this.id = id;
		this.name = name;
	};

	public static EnumContainerType enumFromId(Integer id) throws Exception {
		switch (id) {
		case 1:
			return EnumContainerType.REFRIGERATED;
		case 2:
			return EnumContainerType.FREEZER;
		case 3:
			return EnumContainerType.LIVING_ROOM_TEMP;
		default:
			throw new Exception("Unknown id: " + id);
		}
	}
}
