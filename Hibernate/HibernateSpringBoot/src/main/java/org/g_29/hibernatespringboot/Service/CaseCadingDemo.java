//package org.g_29.hibernatespringboot.Service;
//
//import org.g_29.hibernatespringboot.Model.Doctor;
//import org.g_29.hibernatespringboot.Model.Patient;
//import org.g_29.hibernatespringboot.Repository.DoctorRepo;
//import org.g_29.hibernatespringboot.Repository.MedicalRecordRepo;
//import org.g_29.hibernatespringboot.Repository.PatientRepo;
//import org.springframework.boot.CommandLineRunner;
//
////@Component
//public class CaseCadingDemo implements CommandLineRunner {
//
//
//    private PatientRepo patientRepo;
//
//    private MedicalRecordRepo medicalRecordRepo;
//
//    private DoctorRepo doctorRepo;
//
//    public CaseCadingDemo(PatientRepo patientRepo, MedicalRecordRepo medicalRecordRepo, DoctorRepo doctorRepo) {
//        this.patientRepo = patientRepo;
//        this.medicalRecordRepo = medicalRecordRepo;
//        this.doctorRepo = doctorRepo;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        //ONE TO ONE
//
////        MedicalRecord medicalRecord = new MedicalRecord();
////        medicalRecord.setDiagnosis("fever");
////        medicalRecordRepo.save(medicalRecord);
////
////        Patient patient = new Patient();
////        patient.setName("sri");
////        patient.setAge(18);
////        patient.setMedicalRecord( medicalRecord);
////        patientRepo.save(patient);
//
//        //ONE TO MANY and MANY TO ONE
//
//        Doctor doctor = new Doctor();
//        doctor.setName("Prabu");
////        doctorRepo.save(doctor);
//
//        Doctor doctor2 = new Doctor();
//        doctor2.setName("Ram");
////        doctorRepo.save(doctor2);
//
//
//        Patient patient = new Patient();
//        patient.setName("Gowtham");
//        patient.setDoctor(doctor);
//        patientRepo.save(patient);
//
//        Patient patient2 = new Patient();
//        patient2.setName("Arun");
//        patient2.setDoctor(doctor2);
//        patientRepo.save(patient2);
//
//
//
//
//    }
//
//
//}
