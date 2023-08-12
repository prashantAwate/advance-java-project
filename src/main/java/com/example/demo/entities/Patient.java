package com.example.demo.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="patient")
public class Patient 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int pid;
	
	@Column
	private String fname;
	
	@Column
	private String lname;
	
	@Column
	private String address;
	
	@Column
	private String contact;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column
	private Date birthdate;
	
	
	@JsonIgnoreProperties("patients")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="doctor_id")
	private  Doctor doctor;

	
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Patient(int pid, String fname, String lname, String address, String contact, Date birthdate, Doctor doctor) {
		super();
		this.pid = pid;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.contact = contact;
		this.birthdate = birthdate;
		this.doctor = doctor;
	}



	public int getPid() {
		return pid;
	}



	public void setPid(int pid) {
		this.pid = pid;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	public Date getBirthdate() {
		return birthdate;
	}



	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}



	public Doctor getDoctor() {
		return doctor;
	}



	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
	
}