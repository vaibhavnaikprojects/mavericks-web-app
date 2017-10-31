package edu.uta.mav.beans;

public class ToDoBean {
	private int todoId;
	private String todoItem;
	private String dueDate;
	private String status;
	private String universityName;
	private String adminFunction;
	public ToDoBean(){
	}
	public ToDoBean(int todoId, String todoItem,
			String dueDate, String status,String universityName,
			String adminFunction) {
		super();
		this.todoId = todoId;
		this.todoItem = todoItem;
		this.dueDate = dueDate;
		this.status = status;
		this.universityName = universityName;
		this.adminFunction = adminFunction;
	}
	public int getTodoId() {
		return todoId;
	}
	public void setTodoId(int todoId) {
		this.todoId = todoId;
	}
	public String getTodoItem() {
		return todoItem;
	}
	public void setTodoItem(String todoItem) {
		this.todoItem = todoItem;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getAdminFunction() {
		return adminFunction;
	}
	public void setAdminFunction(String adminFunction) {
		this.adminFunction = adminFunction;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ToDoBean [todoId=" + todoId + ", todoItem=" + todoItem
				+ ", dueDate=" + dueDate + ", status=" + status
				+ ", universityName=" + universityName + ", adminFunction="
				+ adminFunction + "]";
	}
}
