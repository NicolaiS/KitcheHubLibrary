package models;

import enums.EnumContainerType;

/**
 * 
 * @author NicolaiSonne
 *
 *         Container model
 */
public class Container {

	private Integer id;
	private String name;
	private EnumContainerType containerType;

	public Container(Integer id) {
		this.id = id;
	}

	public Container(Integer id, String name, Integer typeId) throws Exception {
		this.id = id;
		this.name = name;
		this.containerType = EnumContainerType.enumFromId(typeId);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EnumContainerType getType() {
		return containerType;
	}

	public void setType(EnumContainerType type) {
		this.containerType = type;
	}

}
