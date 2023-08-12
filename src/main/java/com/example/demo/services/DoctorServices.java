
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.Doctor;
import com.example.demo.repositories.DoctorReposition;

@Service
public class DoctorServices {
	
	@Autowired
	DoctorReposition doctrepo;
	
	public List<Doctor> getDoctorsHaving( int years , String specialization  )
	{
		return doctrepo.getDoctorsHaving(years,specialization);
	}
}
