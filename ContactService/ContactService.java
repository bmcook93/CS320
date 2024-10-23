/*
 * Author Name: Brandon Cook
 * Date: 9/18/24
 * Course ID: CS-320; Software Testing, Automation & QA
 * Description: A class to allow adding, deleting, or modifying Contact ID information.
 */

package project;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ContactService {
	
	// create in-memory arraylist data structure to store Contacts
	public List<Contact> contactList = new ArrayList<Contact>();
	
	// method to add contact
	public void addContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		Contact newContact = new Contact (contactID, firstName, lastName, phoneNumber, address); // create new contact
		contactList.add(newContact); // add new contact to list
	}
	
	// method to delete contact via ID
	public void deleteContact(String contactID) {
		// iterate over list to remove contact via ID; using Iterator
		Iterator<Contact> iterator = contactList.iterator();
		while (iterator.hasNext()) {
			Contact currContact = iterator.next();
			if (currContact.getContactID().equals(contactID)) {
				iterator.remove();
			}
		}
	}
	
	// method to update the first name via ID
	public void updateFirstName(String contactID, String firstName) {
		for (Contact contactIter : contactList) {
			if (contactIter.getContactID() == contactID) {
				contactIter.setFirstName(firstName);
			}
		}
	}
	
	// method to update the last name via ID
	public void updateLastName(String contactID, String lastName) {
		for (Contact contactIter : contactList) {
			if (contactIter.getContactID() == contactID) {
				contactIter.setLastName(lastName);
			}
		}
	}
	
	// method to update the phone number name via ID
	public void updatePhoneNumber(String contactID, String phoneNumber) {
		for (Contact contactIter : contactList) {
			if (contactIter.getContactID() == contactID) {
				contactIter.setPhoneNumber(phoneNumber);
			}
		}
	}
	
	// method to update the address name via ID
	public void updateAddress(String contactID, String address) {
		for (Contact contactIter : contactList) {
			if (contactIter.getContactID() == contactID) {
				contactIter.setAddress(address);
			}
		}
	}
	
}
