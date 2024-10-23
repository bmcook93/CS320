/*
 * Author Name: Brandon Cook
 * Date: 9/25/24
 * Course ID: CS-320; Software Testing, Automation & QA
 * Description: A class to test adding, deleting, or modifying Task Service information.
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import project.TaskService;

class TaskServiceTest {

	TaskService testService;

	// method to initialize TaskService variable each test
	@BeforeEach
	public void initialize() {
		testService = new TaskService();
	}
	
	// method to test adding a new task
	@Test
	public void testAddTask() {
		// add task to list, test that list equals 1
		testService.addTask("12345", "Task Name", "This is the task description.");
		assertEquals(1, testService.taskList.size());
		
		// add another task to list, test that list equals 2
		testService.addTask("56789", "Task Name 2", "This is another task description.");
		assertEquals(2, testService.taskList.size());
	}
	
	// method to test deleting a task
	@Test
	public void testDeleteTask() {
		// add task to list, assert that list has 1 item
		testService.addTask("12345", "Task Name", "This is the task description.");
		assertEquals(1, testService.taskList.size());
		
		// delete task from list, assert that list is empty
		testService.deleteTask("12345");
		assertTrue(testService.taskList.isEmpty());
	}
	
	// method to test updated a task's name
	@Test
	public void testUpdateTaskName() {
		// add a task to list, update task name
		testService.addTask("12345", "Task Name", "This is the task description.");
		testService.updateTaskName("12345", "Task #1");
		
		// test that task name changed
		assertEquals("Task #1", testService.taskList.get(0).getTaskName());
	}
	
	// method to test updated a task's description
	@Test
	public void testUpdateLastName() {
		// add a task to list, update description
		testService.addTask("12345", "Task Name", "Perform this task.");
		testService.updateTaskDesc("12345", "Perform this task.");
		
		// test that description changed
		assertEquals("Perform this task.", testService.taskList.get(0).getTaskDesc());
	}

}
