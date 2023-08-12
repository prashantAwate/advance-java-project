package com.example.demo.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="doctor")
public class Doctor {

	@Id
	@Column
	private int doctor_id;
	
	@Column
	private String name;
	
	@Column
	private String degree;
	
	@Column
	private String specialization;
	
	@Column
	private int experience;
	
	@JsonIgnoreProperties("doctor")
	@OneToMany(mappedBy = "doctor" , cascade = CascadeType.ALL)
	private List<Patient>  patients;

	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Doctor(int doctor_id, String name, String degree, String specialization, int experience,
			List<Patient> patients) {
		super();
		this.doctor_id = doctor_id;
		this.name = name;
		this.degree = degree;
		this.specialization = specialization;
		this.experience = experience;
		this.patients = patients;
	}



	public int getDoctor_id() {
		return doctor_id;
	}



	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDegree() {
		return degree;
	}



	public void setDegree(String degree) {
		this.degree = degree;
	}



	public String getSpecialization() {
		return specialization;
	}



	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}



	public int getExperience() {
		return experience;
	}



	public void setExperience(int experience) {
		this.experience = experience;
	}



	public List<Patient> getPatients() {
		return patients;
	}



	public void setPatients(List<Patient> patients) {
		for(Patient p : patients)
		{
			p.setDoctor(this);
		}
		this.patients = patients;
	}

	
 
	
	
}