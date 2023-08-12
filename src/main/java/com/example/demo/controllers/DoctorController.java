  package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Doctor;
import com.example.demo.services.DoctorServices;

@RestController
public class DoctorController {

	@Autowired
	DoctorServices docserv;
	
	@GetMapping("/getDoctors")
	public List<Doctor> getDoctorsHaving(@RequestParam("years") int years ,@RequestParam("specialization") String specialization )
	{
		return docserv.getDoctorsHaving(years,specialization);
	}
	
}