/*
 * Author Name: Brandon Cook
 * Date: 9/25/24
 * Course ID: CS-320; Software Testing, Automation & QA
 * Description: A class to allow adding, deleting, or modifying Task ID information.
 */

package project;

public class Task {

	// declare private variables
	private String taskID;
	private String taskName;
	private String taskDesc;
	
	// default constructor, variables cannot be null and must meet certain length requirements
	public Task(String taskID, String taskName, String taskDesc) {
		// check that taskID is not null and does not contain more than 10 characters
		if(taskID == null || taskID.length() > 10) {
			throw new IllegalArgumentException("Invalid Task ID");
		}
		// check that taskName is not null and does not contain more than 20 characters
		if(taskName == null || taskName.length() > 20) {
			throw new IllegalArgumentException("Invalid Task Name");
		}
		// check that taskDesc is not null and does not contain more than 50 characters
		if(taskDesc == null || taskDesc.length() > 50) {
			throw new IllegalArgumentException("Invalid Task Description");
		}
		
		// assign values to variables
		this.taskID = taskID;
		this.taskName = taskName;
		this.taskDesc = taskDesc;
	}
	
	// public getter methods
	public String getTaskID() {
		return this.taskID;
	}
	
	public String getTaskName() {
		return this.taskName;
	}
	
	public String getTaskDesc() {
		return this.taskDesc;
	}
	
	// public setter methods
	public void setTaskName(String taskName) {
		// check that taskName is not null and does not contain more than 20 characters
		if(taskName == null || taskName.length() > 20) {
			throw new IllegalArgumentException("Invalid Task Name");
		}
		
		// assign value to variable
		this.taskName = taskName;
	}
	
	public void setTaskDesc(String taskDesc) {
		// check that taskDesc is not null and does not contain more than 50 characters
		if(taskDesc == null || taskDesc.length() > 10) {
			throw new IllegalArgumentException("Invalid Task Description");
		}
		
		// assign value to variable
		this.taskDesc = taskDesc;
	}
	
}
