package com.hiker.HikerApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class BasicDetailsUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 100 )
	@NotNull(message = "Enter your name...")
	
	private String name;
	
	@Column(length = 100 )
	@NotNull(message = "Enter your address...")
	private String address;
	
	@Column(length = 20)
	@NotNull(message = "Enter your city.....")
	private String city;
	
	@Column(length = 20)
	@NotNull(message = "Enter your state...")
	private String state;
	
	@Column(length = 50 )
	@NotNull(message = "Enter your Email...")
	private String email;
	
	@Column(length = 100 )
	@NotNull(message = "Enter your occupation....")
	private String occupation;
	
	@Column(length = 100 )
	@NotNull(message = "Enter your six digit pincode...")
	private Integer pincode;
	
	@Column(length = 12 )
	@NotNull(message = "Enter your ten digit Phone No....")
	private Integer phoneNo;
	
	@Column(length = 8)
	@NotNull(message = "Enter your 8 digit aadhar no....")
	private Integer aadharNo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public Integer getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Integer getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(Integer aadharNo) {
		this.aadharNo = aadharNo;
	}
	
	

}
