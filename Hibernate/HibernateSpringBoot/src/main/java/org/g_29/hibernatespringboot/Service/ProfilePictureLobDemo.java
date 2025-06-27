//package org.g_29.hibernatespringboot.Service;
//
//import org.g_29.hibernatespringboot.Model.Gender;
//import org.g_29.hibernatespringboot.Model.Patient;
//import org.g_29.hibernatespringboot.Repository.PatientRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.core.io.ClassPathResource;
//
//import java.nio.file.Files;
//
////@Component
//public class ProfilePictureLobDemo implements CommandLineRunner {
//
//    @Autowired
//    private PatientRepo  patientRepo;
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        Patient patient = new Patient();
//        patient.setName("John Doe");
//        patient.setAge(20);
//
//        byte[] imageData= Files.readAllBytes(
//                new ClassPathResource("Images/eden-constantino-OXmym9cuaEY-unsplash.jpg")
//                        .getFile().
//                        toPath());
//        patient.setProfileImage(imageData);
//        patient.setGender(Gender.MALE);
//        patientRepo.save(patient);
//
//
//    }
//}
