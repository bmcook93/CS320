/*
 * Author Name: Brandon Cook
 * Date: 9/30/24
 * Course ID: CS-320; Software Testing, Automation & QA
 * Description: A class to allow adding or deleting Appointment ID information.
 */

package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Iterator;

public class AppointmentService {
	
	// create in-memory arraylist data structure to store Appointments
	public List<Appointment> appointmentList = new ArrayList<Appointment>();
	
	// method to add appointments
	public void addAppointment(String appointmentID, Date appointmentDate, String appointmentDesc) {
		Appointment newAppointment = new Appointment(appointmentID, appointmentDate, appointmentDesc); // create new appointment
		appointmentList.add(newAppointment); // add new appointment to list
	}
	
	// method to delete appointment via ID
	public void deleteAppointment(String appointmentID) {
		// iterate over list to remove appointment via ID; using Iterator
		Iterator<Appointment> iterator = appointmentList.iterator();
		while (iterator.hasNext()) {
			Appointment currAppointment = iterator.next();
			if (currAppointment.getAppointmentID().equals(appointmentID)) {
				iterator.remove();
			}
		}
	}

}
