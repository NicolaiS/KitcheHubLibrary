package models;

public class Attribute {

	private Integer id;
	private String attrKey;
	private String attrName;
	private String attrValue;
	private Integer attrTypeId;
	private String valueFormat;
	private Integer sortOrder;

	public Attribute(Integer id, String attrKey, String attrName,
			String attrValue, Integer attrTypeId, String valueFormat,
			Integer sortOrder) {
		this.id = id;
		this.attrKey = attrKey;
		this.attrName = attrName;
		this.attrValue = attrValue;
		this.attrTypeId = attrTypeId;
		this.valueFormat = valueFormat;
		this.sortOrder = sortOrder;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAttrKey() {
		return attrKey;
	}

	public void setAttrKey(String attrKey) {
		this.attrKey = attrKey;
	}

	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getAttrValue() {
		return attrValue;
	}

	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

	public Integer getAttrTypeId() {
		return attrTypeId;
	}

	public void setAttrTypeId(Integer attrTypeId) {
		this.attrTypeId = attrTypeId;
	}

	public String getValueFormat() {
		return valueFormat;
	}

	public void setValueFormat(String valueFormat) {
		this.valueFormat = valueFormat;
	}

	public Integer getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}
