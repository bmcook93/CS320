/*
 * Author Name: Brandon Cook
 * Date: 9/18/24
 * Course ID: CS-320; Software Testing, Automation & QA
 * Description: Testing for ContactService.java to ensure proper functionality.
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import project.ContactService;

import org.junit.jupiter.api.BeforeEach;

class ContactServiceTest {
	
	ContactService testService;

	// method to initialize ContactService variable each test
	@BeforeEach
	public void initialize() {
		testService = new ContactService();
	}
	
	// method to test adding a new contact
	@Test
	public void testAddContact() {
		// add contact to list, test that list equals 1
		testService.addContact("12345", "First", "Last", "8005551234", "123 Cherry Lane");
		assertEquals(1, testService.contactList.size());
		
		// add another contact to list, test that list equals 2
		testService.addContact("6789", "First", "Last", "8005551234", "123 Cherry Lane");
		assertEquals(2, testService.contactList.size());
	}
	
	// method to test deleting a contact
	@Test
	public void testDeleteContact() {
		// add contact to list, assert that list has 1 item
		testService.addContact("12345", "First", "Last", "8005551234", "123 Cherry Lane");
		assertEquals(1, testService.contactList.size());
		
		// delete contact from list, assert that list is empty
		testService.deleteContact("12345");
		assertTrue(testService.contactList.isEmpty());
	}
	
	// method to test updated a contact's first name
	@Test
	public void testUpdateFirstName() {
		// add a contact to list, update first name
		testService.addContact("12345", "First", "Last", "8005551234", "123 Cherry Lane");
		testService.updateFirstName("12345", "Albert");
		
		// test that first name changed
		assertEquals("Albert", testService.contactList.get(0).getFirstName());
	}
	
	// method to test updated a contact's last name
	@Test
	public void testUpdateLastName() {
		// add a contact to list, update last name
		testService.addContact("12345", "First", "Last", "8005551234", "123 Cherry Lane");
		testService.updateLastName("12345", "Hanner");
		
		// test that last name changed
		assertEquals("Hanner", testService.contactList.get(0).getLastName());
	}
	
	// method to test updated a contact's phone number
	@Test
	public void testPhoneNumber() {
		// add a contact to list, update phone number
		testService.addContact("12345", "First", "Last", "8005551234", "123 Cherry Lane");
		testService.updatePhoneNumber("12345", "8005554321");
		
		// test that phone number changed
		assertEquals("8005554321", testService.contactList.get(0).getPhoneNumber());
	}
	
	// method to test updated a contact's address
	@Test
	public void testAddress() {
		// add a contact to list, update address
		testService.addContact("12345", "First", "Last", "8005551234", "123 Cherry Lane");
		testService.updateAddress("12345", "456 Strawberry Circuit");
		
		// test that phone number changed
		assertEquals("456 Strawberry Circuit", testService.contactList.get(0).getAddress());
	}

}
