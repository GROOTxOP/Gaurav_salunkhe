package com.Student_Registration;

public class RegLog2 {
	private String Firstname;
	private String LastName;
	private String Username;
	private Integer password;
	private String City;
	private String Email;
	private Integer MobileNumber;

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Integer getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(Integer mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public RegLog2(String firstname, String lastName, String username, Integer password, String city, String email,
			Integer mobileNumber) {
		super();
		Firstname = firstname;
		LastName = lastName;
		Username = username;
		this.password = password;
		City = city;
		Email = email;
		MobileNumber = mobileNumber;
	}

	RegLog2() {

	}

	@Override
	public String toString() {
		return "RogLog2 [Firstname=" + Firstname + ", LastName=" + LastName + ", Username=" + Username + ", password="
				+ password + ", City=" + City + ", Email=" + Email + ", MobileNumber=" + MobileNumber + "]";
	}

}
