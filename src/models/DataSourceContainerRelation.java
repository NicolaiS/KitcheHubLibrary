package models;

/**
 * 
 * @author NicolaiSonne
 *
 *         Data Source - Container relation
 */
public class DataSourceContainerRelation {

	private Integer id;
	private DataSource datasource;
	private Container container;
	private Integer antenna;

	public DataSourceContainerRelation(Integer id, DataSource datasource, Container container, Integer antenna) {
		this.id = id;
		this.datasource = datasource;
		this.container = container;
		this.antenna = antenna;
	}

	public DataSourceContainerRelation(Integer id, Integer datasourceId, Integer containerId, Integer antenna) {
		this.id = id;
		this.datasource = new DataSource(datasourceId);
		this.container = new Container(containerId);
		this.antenna = antenna;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	public Container getContainer() {
		return container;
	}

	public void setContainer(Container container) {
		this.container = container;
	}

	public Integer getAntenna() {
		return antenna;
	}

	public void setAntenna(Integer antenna) {
		this.antenna = antenna;
	}

}
