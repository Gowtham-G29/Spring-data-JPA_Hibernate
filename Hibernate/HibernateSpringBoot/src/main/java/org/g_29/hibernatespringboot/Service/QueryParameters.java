package org.g_29.hibernatespringboot.Service;

import jakarta.persistence.EntityManager;
import org.g_29.hibernatespringboot.Model.*;
import org.g_29.hibernatespringboot.Repository.DoctorRepo;
import org.g_29.hibernatespringboot.Repository.MedicalRecordRepo;
import org.g_29.hibernatespringboot.Repository.PatientRepo;
import org.g_29.hibernatespringboot.Repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryParameters implements CommandLineRunner {



    @Autowired
    private DoctorRepo doctorRepo;
    @Autowired
    private PatientRepo patientRepo;

    @Autowired
    private PersonRepo personRepo;

    @Autowired
    private MedicalRecordRepo medicalRecordRepo;

    @Autowired
    private EntityManager entityManager;

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

        patient.setDoctor(doctor);

        MedicalRecord medicalRecord = new MedicalRecord();
        medicalRecord.setDiagnosis("Hypertension");
        medicalRecord.setPatient(patient);
        medicalRecordRepo.save(medicalRecord);

        patient.setMedicalRecord(medicalRecord);
        patientRepo.save(patient);

        Patient patient2 = new Patient();
        patient2.setName("Patient 2");
        patient2.setAge(80);
        patient2.setEmail("@patient2@mail");
        patient2.setGender(Gender.MALE);
        patientRepo.save(patient2);

        Patient patient3 = new Patient();
        patient3.setName("Patient 3");
        patient3.setAge(90);
        patient3.setEmail("@patient3@mail");
        patient3.setGender(Gender.FEMALE);
        patientRepo.save(patient3);

//        //Postional
//        TypedQuery<Patient> query1 = entityManager.createQuery(
//                "select p from Patient p where p.name= ?1",
//                Patient.class).setParameter(1,"Patient 1");
//        List<Patient> patients = query1.getResultList();
//        System.out.println("Patient postion: " + patients);
//
//        //Named
//        TypedQuery<Patient> query = entityManager.createQuery(
//                "select p from Patient p where p.name=:name",
//                Patient.class).setParameter("name","Patient 1");
//        List<Patient> patients1 = query.getResultList();
//        System.out.println("Patient 1: " + patients1);

//        List<Patient>patients=patientRepo.findByNameAndGender("Patient 1",Gender.FEMALE);
//        System.out.println(patients.getFirst().getEmail());

        List<Patient>older=patientRepo.findByAgeGreaterThan(20 );
        for(Patient p:older){
            System.out.println(p.getName()+" "+p.getAge());
        }

        List<Patient>namematches=patientRepo.findByNameStartsWith("Pat");
        for(Patient p:namematches){
            System.out.println("Hello"+p.getName()+" "+p.getAge());
        }

        List<Patient>sortByAge=patientRepo.sortByAge();
        for (Patient p:sortByAge){
            System.out.println(p.getName()+" "+p.getAge());
        }

        List<Patient>findByGenderOrderByAge=patientRepo.findByGenderOrderByAge(Gender.FEMALE);
        for (Patient p:findByGenderOrderByAge){
            System.out.println("Filter based on Age: "+p.getName()+" "+p.getAge());
        }

        int count=patientRepo.countPatientsByNameStartingWith("Pat");
        System.out.println(count);

        System.out.println("count:"+doctorRepo.countDoctorBySpecialization("cardiology"));

        System.out.println("avg age :"+patientRepo.avgPatientsAgeByGender(Gender.FEMALE));


        //Bulk update
//        int count1 =patientRepo.bulkIncreaseAge();
//        System.out.println("modifyed :"+ count1);
//
//        int count2 =patientRepo.bulkDeleteByAge(60);
//        System.out.println("deleted :"+ count2);

        List<PatientSummary>summaries=patientRepo.getPatientsSummary();
        for (PatientSummary p:summaries){
            System.out.println("Hello bye "+p.getName()+" "+p.getAge());
        }

//        List<Patient>patientList=entityManager.createNamedQuery("Patient.olderThanAge")
//                .setParameter("minAge",30)
//                .getResultList();

        List<Patient>patientList=patientRepo.olderThanAge(30);

        System.out.println("patientList:"+patientList);


    }
}
