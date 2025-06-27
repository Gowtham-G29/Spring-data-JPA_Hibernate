//package org.g_29.hibernatespringboot.Service;
//
//import org.g_29.hibernatespringboot.Model.Doctor;
//import org.g_29.hibernatespringboot.Model.Gender;
//import org.g_29.hibernatespringboot.Model.Patient;
//import org.g_29.hibernatespringboot.Repository.DoctorRepo;
//import org.g_29.hibernatespringboot.Repository.PatientRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//
////@Component
//public class VersionPreventingDemo implements CommandLineRunner {
//
//    @Autowired
//    private PatientRepo patientRepo;
//    @Autowired
//    private DoctorRepo doctorRepo;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Doctor doctor = new Doctor();
//        doctor.setName("John Doe");
//        Patient patient = new Patient();
//        patient.setName("Patient 1");
//        patient.setAge(20);
//        patient.setGender(Gender.FEMALE);
//
//        patientRepo.save(patient);
//
//    }
//}
