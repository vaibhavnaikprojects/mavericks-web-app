package edu.uta.mav.beans;

public class HoldItemBean {
	private int itemId;
	private String holdItem;
	private String institution;
	private String startTerm;
	private String endTerm;
	private String startDate;
	private String endDate;
	private String departmentName;
	private double amount;
	public HoldItemBean(){
	}
	public HoldItemBean(int itemId, String holdItem, String institution,
			String startTerm, String endTerm, String startDate, String endDate,
			String departmentName, double amount) {
		super();
		this.itemId = itemId;
		this.holdItem = holdItem;
		this.institution = institution;
		this.startTerm = startTerm;
		this.endTerm = endTerm;
		this.startDate = startDate;
		this.endDate = endDate;
		this.departmentName = departmentName;
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getHoldItem() {
		return holdItem;
	}
	public void setHoldItem(String holdItem) {
		this.holdItem = holdItem;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getStartTerm() {
		return startTerm;
	}
	public void setStartTerm(String startTerm) {
		this.startTerm = startTerm;
	}
	public String getEndTerm() {
		return endTerm;
	}
	public void setEndTerm(String endTerm) {
		this.endTerm = endTerm;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "HoldItemBean [itemId=" + itemId + ", holdItem=" + holdItem
				+ ", institution=" + institution + ", startTerm=" + startTerm
				+ ", endTerm=" + endTerm + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", departmentName=" + departmentName
				+ ", amount=" + amount + "]";
	}
}
