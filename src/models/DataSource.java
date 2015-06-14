package models;

import enums.EnumDataSourceType;

public class DataSource {

	private Integer id;
	private String ipAddress;
	private EnumDataSourceType datasourceType;

	public DataSource(Integer id) {
		this.id = id;
	}

	public DataSource(Integer id, String ipAddress,
			EnumDataSourceType datasourceType) {
		this.id = id;
		this.ipAddress = ipAddress;
		this.datasourceType = datasourceType;
	}

	public DataSource(Integer id, String ipAddress, Integer datasourceTypeId)
			throws Exception {
		this.id = id;
		this.ipAddress = ipAddress;
		this.datasourceType = EnumDataSourceType.enumFromId(datasourceTypeId);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public EnumDataSourceType getDatasourceType() {
		return datasourceType;
	}

	public void setDatasourceType(EnumDataSourceType datasourceType) {
		this.datasourceType = datasourceType;
	}

}
