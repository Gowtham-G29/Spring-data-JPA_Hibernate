//package org.g_29.hibernatespringboot.Service;
//
//import org.g_29.hibernatespringboot.Model.Address;
//import org.g_29.hibernatespringboot.Model.Patient;
//import org.g_29.hibernatespringboot.Repository.DoctorRepo;
//import org.g_29.hibernatespringboot.Repository.PatientRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//
////@Component
//public class EmbeddedDataPopulate implements CommandLineRunner {
//
//    @Autowired
//    private DoctorRepo doctorRepo;
//
//    @Autowired
//    private PatientRepo patientRepo;
//
//    @Override
//    public void run(String... args) throws Exception {
//
//         Address address = new Address(
//                 "kamarajar nagar",
//                 "coimbatore",
//                 "tamilnadu",
//                 "641655");
//
//         Patient patient = new Patient();
//         patient.setName("Patrick");
//         patient.setAge(30);
//         patient.setAddress(address);
//         patientRepo.save(patient);
//
//         Patient patient2 = patientRepo.findById(patient.getId()).get();
//         System.out.println(patient2.getAddress().getCity());
//
//
//
//    }
//}
