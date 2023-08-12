package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Patient;

@Repository
public interface PatientReposition extends JpaRepository<Patient, Integer> {
	
	@Modifying
	@Query("update Patient p set p.contact = :contact_num where p.pid = :patient_id")
	public int updateContact(int patient_id,String contact_num);


}
