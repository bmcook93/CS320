/*
 * Author Name: Brandon Cook
 * Date: 9/25/24
 * Course ID: CS-320; Software Testing, Automation & QA
 * Description: A class to allow adding, deleting, or modifying Task Service information.
 */

package project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskService {

	// create in-memory arraylist data structure to store Tasks
	public List<Task> taskList = new ArrayList<Task>();
	
	// method to add task
	public void addTask(String taskID, String taskName, String taskDesc) {
		Task newTask = new Task (taskID, taskName, taskDesc); // create new task
		taskList.add(newTask); // add new task to list
	}
	
	// method to delete task via ID
	public void deleteTask(String taskID) {
		// iterate over list to remove task via ID; using Iterator
		Iterator<Task> iterator = taskList.iterator();
		while (iterator.hasNext()) {
			Task currTask = iterator.next();
			if (currTask.getTaskID().equals(taskID)) {
				iterator.remove();
			}
		}
	}
	
	// method to update the task name via ID
	public void updateTaskName(String taskID, String taskName) {
		for (Task taskIter : taskList) {
			if (taskIter.getTaskID() == taskID) {
				taskIter.setTaskName(taskName);
			}
		}
	}
	
	// method to update the task description via ID
	public void updateTaskDesc(String taskID, String taskDesc) {
		for (Task taskIter : taskList) {
			if (taskIter.getTaskDesc() == taskID) {
				taskIter.setTaskDesc(taskDesc);
			}
		}
	}
	
}
