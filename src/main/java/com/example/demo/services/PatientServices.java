package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Patient;
import com.example.demo.repositories.PatientReposition;

@Service
public class PatientServices {
	@Autowired
	PatientReposition patrepo;
	
	public Patient savePatient(Patient p)
	{
		return patrepo.save(p);
	}
	
	public int updateContact( int patient_id, String contact_num)
	{
		return patrepo.updateContact(patient_id,contact_num);
	}
}