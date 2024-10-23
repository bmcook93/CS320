/*
 * Author Name: Brandon Cook
 * Date: 9/30/24
 * Course ID: CS-320; Software Testing, Automation & QA
 * Description: A class to store Appointment ID information.
 */

package project;

import java.util.Date;

public class Appointment {

	// declare private variables
	private String appointmentID;
	private Date appointmentDate;
	private String appointmentDesc;
	
	// default constructor, variables must meet certain requirements
	public Appointment(String appointmentID, Date appointmentDate, String appointmentDesc) {
		// check that appointmentID is not null and is less than 10 characters
		if (appointmentID == null || appointmentID.length() > 10) {
			throw new IllegalArgumentException("Invalid Appointment ID");
		}
		
		// check that appointmentDate is not in the past and is not null
		if (appointmentDate == null || appointmentDate.before(new Date())) {
			throw new IllegalArgumentException("Invalid Appointment Date");
		}
		
		// check that appointmentDesc is not null and description is less than 50 characters
		if (appointmentDesc == null || appointmentDesc.length() > 50) {
			throw new IllegalArgumentException("Invalid Appointment Description");
		}
		
		// assign values to variables
		this.appointmentID = appointmentID;
		this.appointmentDate = appointmentDate;
		this.appointmentDesc = appointmentDesc;
		
	}
	
	// public getter methods
	public String getAppointmentID() {
		return this.appointmentID;
	}
	
	public Date getAppointmentDate() {
		return this.appointmentDate;
	}
	
	public String getAppointmentDesc() {
		return this.appointmentDesc;
	}
	
	// public setter methods
	public void setAppointmentID(String appointmentID) {
		// check that appointmentID is not null and is less than 10 characters
		if (appointmentID == null || appointmentID.length() > 10) {
			throw new IllegalArgumentException("Invalid Appointment ID");
		}
		
		// assign value to variable
		this.appointmentID = appointmentID;
	}
	
	public void setAppointmentDate(Date appointmentDate) {
		// check that appointmentDate is not in the past and is not null
		Date currDate = new Date(); // get current date
		if (appointmentDate.before(currDate) || appointmentDate == null) {
			throw new IllegalArgumentException("Invalid Appointment Date");
		}
		
		// assign value to variable
		this.appointmentDate = appointmentDate;
	}
	
	public void setAppointmentDesc(String appointmentDesc) {
		// check that appointmentDesc is not null and description is less than 50 characters
		if (appointmentDesc == null || appointmentDesc.length() > 50) {
			throw new IllegalArgumentException("Invalid Appointment Description");
		}
		
		// assign value to variable
		this.appointmentDesc = appointmentDesc;
	}
	
}
