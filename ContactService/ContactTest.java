/*
 * Author Name: Brandon Cook
 * Date: 9/18/24
 * Course ID: CS-320; Software Testing, Automation & QA
 * Description: Testing for Contact.java to ensure proper functionality.
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import project.Contact;

class ContactTest {

	// Test that Contact object is created correctly
	@Test
	void testContact() {
		Contact testContact = new Contact("12345", "First", "Last", "8005551234", "123 Cherry Lane");
		assertTrue(testContact.getContactID().equals("12345"));
		assertTrue(testContact.getFirstName().equals("First"));
		assertTrue(testContact.getLastName().equals("Last"));
		assertTrue(testContact.getPhoneNumber().equals("8005551234"));
		assertTrue(testContact.getAddress().equals("123 Cherry Lane"));
	}
	
	// Test that contactID throws exception if too long
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "First", "Last", "8005551234", "123 Cherry Lane");
		});	
	}
	
	// Test that contactID throws exception if null
	@Test
	void testContactIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "First", "Last", "8005551234", "123 Cherry Lane");
		});	
	}
	
	// Test that firstName throws exception if too long
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "First123456", "Last", "8005551234", "123 Cherry Lane");
		});	
	}
	
	// Test that firstName throws exception if null
	@Test
	void testFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", null, "Last", "8005551234", "123 Cherry Lane");
		});	
	}
	
	// Test that lastName throws exception if too long
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "First", "Last1234567", "8005551234", "123 Cherry Lane");
		});	
	}
	
	// Test that lastName throws exception if null
	@Test
	void testLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "First", null, "8005551234", "123 Cherry Lane");
		});	
	}
	
	// Test that phoneNumber throws exception if too long
	@Test
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "First", "Last", "80055512341", "123 Cherry Lane");
		});	
	}
	
	// Test that phoneNumber throws exception if too short
	@Test
	void testPhoneNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "First", "Last", "8005", "123 Cherry Lane");
		});	
	}
	
	// Test that phoneNumber throws exception if null
	@Test
	void testPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "First", "Last", null, "123 Cherry Lane");
		});	
	}
	
	// Test that address throws exception if too long
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "First", "Last", "8005551234", "This is a very long address indeed");
		});	
	}
	
	// Test that address throws exception if null
	@Test
	void testAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "First", "Last", "8005551234", null);
		});	
	}

}
