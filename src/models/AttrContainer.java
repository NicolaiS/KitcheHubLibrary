package models;

import java.util.ArrayList;
import java.util.List;

public class AttrContainer {

	private Integer id;
	private String name;
	private Integer sortOrder;
	private List<Attribute> attributes;

	public AttrContainer(Integer id, String name, Integer sortOrder) {
		super();
		this.id = id;
		this.name = name;
		this.sortOrder = sortOrder;
		this.attributes = new ArrayList<Attribute>();
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

	public Integer getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public List<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

}
