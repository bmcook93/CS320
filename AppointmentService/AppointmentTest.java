/*
 * Author Name: Brandon Cook
 * Date: 9/30/24
 * Course ID: CS-320; Software Testing, Automation & QA
 * Description: A class to test Appointment ID information.
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import project.Appointment;

import java.util.Date;

class AppointmentTest {
	
	// declare static variables for @BeforeAll initialization
	static Date newDate;
	static Date pastDate;
	
	// create a date in the past and future
	@BeforeAll
	static void dateSet() {
		newDate = new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000); // create a new date 1 day ahead of current time
		pastDate = new Date(System.currentTimeMillis() - 24 * 60 * 60 * 1000); // create a past date 1 day before current time
	}

	// Test that Appointment object is created correctly
	@Test
	void testAppointment() {
				
		Appointment testAppointment = new Appointment("12345", newDate, "This is the appointment description.");
		assertTrue(testAppointment.getAppointmentID().equals("12345"));
		assertTrue(testAppointment.getAppointmentDate().equals(newDate));
		assertTrue(testAppointment.getAppointmentDesc().equals("This is the appointment description."));
	}
	
	// Test that appointmentID throws exception if too long
	@Test
	void testAppointmentIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678901", newDate, "This is the appointment description.");
		});	
	}
	
	// Test that appointmentID throws exception if null
	@Test
	void testAppointmentIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, newDate, "This is the appointment description.");
		});	
	}
	
	// Test that appointmentDate throws exception if date is in the past
	@Test
	void testAppointmentDateInPast() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", pastDate, "This is the appointment description.");
		});	
	}
	
	// Test that appointmentDate throws exception if null
	@Test
	void testAppointmentDateIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", null, "This is the appointment description.");
		});	
	}
	
	// Test that appointmentDesc throws exception if too long
	@Test
	void testAppointmentDescTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", newDate, "This is the appointment description. This is the appointment description.");
		});	
	}
	
	// Test that appointmentDesc throws exception if null
	@Test
	void testAppointmentDescIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", newDate, null);
		});	
	}

}
