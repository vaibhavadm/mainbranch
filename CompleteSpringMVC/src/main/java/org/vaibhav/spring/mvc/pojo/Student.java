/**
 * 
 */
package org.vaibhav.spring.mvc.pojo;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Size;

/**
 * @author VAIBHAVREDDYGUDDETI May 2, 2017
 */
public class Student {
	@Size(min=2, max=10)
	private String studentFirstName;
	private String studentLastName;
	private long mobileNumber;
	private Date dateOfBirth;
	private ArrayList<String> userSkills;
	//custom data type
	private Address studentAddress;
	
	
	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public ArrayList<String> getUserSkills() {
		return userSkills;
	}

	public void setUserSkills(ArrayList<String> userSkills) {
		this.userSkills = userSkills;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

}
