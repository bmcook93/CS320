/*
 * Author Name: Brandon Cook
 * Date: 9/18/24
 * Course ID: CS-320; Software Testing, Automation & QA
 * Description: A class to store Contact ID information.
 */

package project;

public class Contact {
	
	// declare private variables
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	// default constructor, must take argument for all fields, none can be null
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		// check that contactID is not null and does not contain more than 10 characters
		if(contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid Contact ID");
		}
		// check that firstName is not null and does not contain more than 10 characters
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		// check that lastName is not null and does not contain more than 10 characters
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		// check that phoneNumber is not null and contains exactly 10 characters
		if(phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		// check that address is not null and does not contain more than 30 characters
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		// assign variables with values
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	
	// public getter methods
	public String getContactID() {
		return this.contactID;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	
	// public setter methods; Contact ID cannot be changed
	public void setFirstName(String firstName) {
		// check that firstName is not null and does not contain more than 10 characters
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		// set firstName
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		// check that lastName is not null and does not contain more than 10 characters
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		// set lastName
		this.lastName = lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		// check that phoneNumber is not null and contains exactly 10 characters
		if(phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		
		// set phoneNumber
		this.phoneNumber = phoneNumber;
	}
	
	public void setAddress(String address) {
		// check that address is not null and does not contain more than 30 characters
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		// set address
		this.address = address;
	}
	
}
