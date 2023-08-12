package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Doctor;
 

@Repository
public interface DoctorReposition extends JpaRepository<Doctor, Integer> {

	@Query("select d from Doctor d where d.specialization = :specialization and  experience >= :years")
	public List<Doctor> getDoctorsHaving( int years , String specialization  );
	
}