//package org.g_29.hibernatespringboot.Service;
//
//import jakarta.persistence.EntityManager;
//import org.g_29.hibernatespringboot.Model.Doctor;
//import org.g_29.hibernatespringboot.Model.Gender;
//import org.g_29.hibernatespringboot.Model.MedicalRecord;
//import org.g_29.hibernatespringboot.Model.Patient;
//import org.g_29.hibernatespringboot.Repository.DoctorRepo;
//import org.g_29.hibernatespringboot.Repository.MedicalRecordRepo;
//import org.g_29.hibernatespringboot.Repository.PatientRepo;
//import org.g_29.hibernatespringboot.Repository.PersonRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class BasicJPQLQueries implements CommandLineRunner {
//
//    @Autowired
//    private DoctorRepo doctorRepo;
//    @Autowired
//    private PatientRepo patientRepo;
//
//    @Autowired
//    private PersonRepo personRepo;
//
//    @Autowired
//    private MedicalRecordRepo medicalRecordRepo;
//
//    @Autowired
//    private EntityManager entityManager;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Doctor doctor = new Doctor();
//        doctor.setName("Doctor 1");
//        doctor.setAge(30);
//        doctor.setEmail("@doct1@mail");
//        doctor.setSpecialization("cardiology");
//        doctorRepo.save(doctor);
//
//        Patient patient = new Patient();
//        patient.setName("Patient 1");
//        patient.setAge(30);
//        patient.setEmail("@patient1@mail");
//        patient.setGender(Gender.FEMALE);
//        patientRepo.save(patient);
//
//        patient.setDoctor(doctor);
//
//        MedicalRecord medicalRecord = new MedicalRecord();
//        medicalRecord.setDiagnosis("Hypertension");
//        medicalRecord.setPatient(patient);
//        medicalRecordRepo.save(medicalRecord);
//
//        patient.setMedicalRecord(medicalRecord);
//        patientRepo.save(patient);
//
//
////        //JPQL Queries
////        List<Patient> patients0 = patientRepo.findAllPatients(Gender.FEMALE);
////
////        for (Patient p : patients0) {
////            System.out.println("Hello "+p.getName());
////        }
////
////        List<Patient> patients=entityManager.createQuery(
////                "SELECT p FROM Patient p",
////                Patient.class)
////                .getResultList();
////
////        System.out.println("Patient list Size: "+patients.size());
////
////        List<Patient>malePatients=entityManager.createQuery(
////                "SELECT p FROM Patient p WHERE p.gender=:gender", Patient.class)
////                .setParameter("gender", Gender.FEMALE)
////                .getResultList();
////
////        System.out.println("Patient Female: "+malePatients.getFirst().getName());
//    }
//}
