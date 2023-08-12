package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Patient;
import com.example.demo.services.PatientServices;

@RestController
public class PatientController {
	
	@Autowired
	PatientServices patserv;
	
	@PostMapping("/savePatient")
	public Patient savePatient(@RequestBody Patient p)
	{
		return  patserv.savePatient(p);
	}
	
	@PutMapping("/updatecontact/{patientid}/{contactnum}")
	public int updateContact(@PathVariable("patientid") int patient_id ,@PathVariable("contactnum")  String contact_num )
	{
		return patserv.updateContact(patient_id,contact_num);
	}

}

  
 