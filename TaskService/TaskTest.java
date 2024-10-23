/*
 * Author Name: Brandon Cook
 * Date: 9/25/24
 * Course ID: CS-320; Software Testing, Automation & QA
 * Description: A class to allow adding, deleting, or modifying Task ID information.
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import project.Task;

class TaskTest {

	// Test that Task object is created correctly
	@Test
	void testTask() {
		Task testTask = new Task("12345", "Task Name", "This is the task description.");
		assertTrue(testTask.getTaskID().equals("12345"));
		assertTrue(testTask.getTaskName().equals("Task Name"));
		assertTrue(testTask.getTaskDesc().equals("This is the task description."));
	}
	
	// Test that taskID throws exception if too long
	@Test
	void testTaskIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345678901", "Task Name", "This is the task description.");
		});	
	}
	
	// Test that taskID throws exception if null
	@Test
	void testTaskIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Task Name", "This is the task description.");
		});	
	}
	
	// Test that taskName throws exception if too long
	@Test
	void testTaskNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", "Task Name Is Very Long", "This is the task description.");
		});	
	}
	
	// Test that taskName throws exception if null
	@Test
	void testTaskNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", null, "This is the task description.");
		});	
	}
	
	// Test that taskDesc throws exception if too long
	@Test
	void testTaskDescTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", "Task Name", "This is the task description. This is the task description.");
		});	
	}
	
	// Test that taskID throws exception if null
	@Test
	void testTaskDescIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", "Task Name", null);
		});	
	}

}
