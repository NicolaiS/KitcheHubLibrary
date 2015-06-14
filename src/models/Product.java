package models;

import java.util.Date;

public class Product {

	private Integer id;
	private Integer containerId;
	private Integer indicator;
	private String companyPrefix;
	private String itemRefNo;
	private String serial;
	private Integer checksum;
	private Boolean present;
	private Date lastEdit;

	public Product(Integer id, Integer containerId, Integer indicator,
			String companyPrefix, String itemRefNo, String serial,
			Integer checksum, Boolean present, Long lastEdit) {
		this(id, containerId, indicator, companyPrefix, itemRefNo, serial,
				checksum, present, new Date(lastEdit));
	}

	public Product(Integer id, Integer containerId, Integer indicator,
			String companyPrefix, String itemRefNo, String serial,
			Integer checksum, Boolean present, Date lastEdit) {
		this.id = id;
		this.containerId = containerId;
		this.indicator = indicator;
		this.companyPrefix = companyPrefix;
		this.itemRefNo = itemRefNo;
		this.serial = serial;
		this.checksum = checksum;
		this.present = present;
		this.lastEdit = lastEdit;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getContainerId() {
		return containerId;
	}

	public void setContainerId(Integer containerId) {
		this.containerId = containerId;
	}

	public Integer getIndicator() {
		return indicator;
	}

	public void setIndicator(Integer indicator) {
		this.indicator = indicator;
	}

	public String getCompanyPrefix() {
		return companyPrefix;
	}

	public void setCompanyPrefix(String companyPrefix) {
		this.companyPrefix = companyPrefix;
	}

	public String getItemRefNo() {
		return itemRefNo;
	}

	public void setItemRefNo(String itemRefNo) {
		this.itemRefNo = itemRefNo;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public Integer getChecksum() {
		return checksum;
	}

	public void setChecksum(Integer checksum) {
		this.checksum = checksum;
	}

	public Boolean getPresent() {
		return present;
	}

	public void setPresent(Boolean present) {
		this.present = present;
	}

	public Date getLastEdit() {
		return lastEdit;
	}

	public void setLastEdit(Date lastEdit) {
		this.lastEdit = lastEdit;
	}

}
