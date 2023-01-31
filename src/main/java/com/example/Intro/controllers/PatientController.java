package com.example.Intro.controllers;


import com.example.Intro.models.Employee;
import com.example.Intro.models.Patient;
import com.example.Intro.models.Status;
import com.example.Intro.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
public class PatientController {

    @Autowired
    PatientRepository patientRepository;


    //5 Create a route to get all patients.
    @GetMapping("/patients")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findAllPatients() {
        return patientRepository.findAll();
    }

    //6 Create a route to get a patient by patient_id.
    @GetMapping("/patients-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Patient findPatientsById(@PathVariable Integer id) {
        return patientRepository.findById(id).get();
    }

    //7 Create a route to get patients date of birth within a specified range.
    @GetMapping("/patients-range-birth/{startDate}&{endDate}")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findAllPatientsByRangeOfBirth(@PathVariable LocalDate startDate, @PathVariable LocalDate endDate) {
        return patientRepository.findAllPatientsBetweenDatesOfBirth(startDate,endDate);
    }

    //8 Create a route to get patients by the department that their admitting doctor is in (For example, get all patients admitted by a doctor in cardiology).
    @GetMapping("/patients-doctors-departments/{department}")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findAllPatientsByDepartmentWithDoctorInSameDepartment(@PathVariable String department) {
        return patientRepository.findAllPatientsByDepartmentWithDoctorInDepartment(department);
    }

     //9 Create a route to get all patients with a doctor whose status is OFF (ON or  ON_CALL).
    @GetMapping("/patients-doctors-status/{status}")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findAllPatientsByDepartmentWithDoctorInSomeStatus(@PathVariable Status status) {
        return patientRepository.findAllPatientsByDepartmentWithDoctorStatus(status);
    }




}
