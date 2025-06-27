package org.g_29.hibernatespringboot.Service;

import org.g_29.hibernatespringboot.Model.Doctor;
import org.g_29.hibernatespringboot.Model.Gender;
import org.g_29.hibernatespringboot.Model.Patient;
import org.g_29.hibernatespringboot.Repository.DoctorRepo;
import org.g_29.hibernatespringboot.Repository.PatientRepo;
import org.g_29.hibernatespringboot.Repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

//@Component
public class InheritanceDemo implements CommandLineRunner {

    @Autowired
    private DoctorRepo doctorRepo;
    @Autowired
    private PatientRepo patientRepo;

    @Autowired
    private PersonRepo personRepo;


    @Override
    public void run(String... args) throws Exception {
        Doctor doctor = new Doctor();
        doctor.setName("Doctor 1");
        doctor.setAge(30);
        doctor.setEmail("@doct1@mail");
        doctor.setSpecialization("cardiology");
        doctorRepo.save(doctor);

        Patient patient = new Patient();
        patient.setName("Patient 1");
        patient.setAge(30);
        patient.setEmail("@patient1@mail");
        patient.setGender(Gender.FEMALE);
        patientRepo.save(patient);

        Patient fetchedPatient=patientRepo.findById(patient.getId()).get();
        System.out.println(fetchedPatient.getName());


    }
}
