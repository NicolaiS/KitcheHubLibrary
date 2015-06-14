package models;

import java.util.Date;

/**
 * 
 * @author NicolaiSonne
 *
 *         Recall Model
 */
public class Recall {

	private Integer id = null;
	private String urn = null;
	private String recall_serial = null;
	private Date issueDate = null;
	private String description = null;
	private String danger = null;
	private String instructions = null;
	private Boolean accepted = null;
	private Integer version = null;

	public Recall(Integer id, String urn, String recall_serial, Date issueDate, String description, String danger, String instructions, Boolean accepted,
			Integer version) {
		this.id = id;
		this.urn = urn;
		this.recall_serial = recall_serial;
		this.issueDate = issueDate;
		this.description = description;
		this.danger = danger;
		this.instructions = instructions;
		this.accepted = accepted;
		this.version = version;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrn() {
		return urn;
	}

	public void setUrn(String urn) {
		this.urn = urn;
	}

	public String getRecall_serial() {
		return recall_serial;
	}

	public void setRecall_serial(String recall_serial) {
		this.recall_serial = recall_serial;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDanger() {
		return danger;
	}

	public void setDanger(String danger) {
		this.danger = danger;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public Boolean getAccepted() {
		return accepted;
	}

	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
