/*
 * Author Name: Brandon Cook
 * Date: 9/30/24
 * Course ID: CS-320; Software Testing, Automation & QA
 * Description: A class to test adding and deleting Appointment ID information.
 */

package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import project.AppointmentService;

public class AppointmentServiceTest {
	
	static Date newDate; // used to create future date
	AppointmentService testService;
	
	// create a date in the future
	@BeforeAll
	static void dateSet() {
		newDate = new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000); // create a new date 1 day ahead of current time
	}
	
	// method to initialize AppointmentService variable each test
	@BeforeEach
	public void initialize() {
		testService = new AppointmentService();
	}
	
	// method to test adding a new appointment
	@Test
	public void testAddAppointment() {
		// add appointment to list, test that list equals 1
		testService.addAppointment("12345", newDate, "This is the appointment description.");
		assertEquals(1, testService.appointmentList.size());
		
		// add another appointment to list, test that list equals 2
		testService.addAppointment("56789", newDate, "This is another appointment description.");
		assertEquals(2, testService.appointmentList.size());
	}
	
	// method to test deleting an appointment
	@Test
	public void testDeleteAppointment() {
		// add appointment to list, assert that list has 1 item
		testService.addAppointment("12345", newDate, "This is the appointment description.");
		assertEquals(1, testService.appointmentList.size());
		
		// delete appointment from list, assert that list is empty
		testService.deleteAppointment("12345");
		assertTrue(testService.appointmentList.isEmpty());
	}
}
