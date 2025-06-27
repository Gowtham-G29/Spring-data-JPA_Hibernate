package org.g_29.hibernatespringboot.Service;

import org.g_29.hibernatespringboot.Model.Medicine;
import org.g_29.hibernatespringboot.Model.Prescription;
import org.g_29.hibernatespringboot.Repository.MedicineRepo;
import org.g_29.hibernatespringboot.Repository.PrescriptionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

//@Component
public class ManyToManyDemo implements CommandLineRunner {

    @Autowired
    private MedicineRepo medicineRepo;

    @Autowired
    private PrescriptionRepo prescriptionRepo;

    @Override
    public void run(String... args) throws Exception {
        Medicine medicine = new Medicine();
        medicine.setName("<UNK>");
        Medicine medicine2 = new Medicine();
        medicine2.setName("Paracetamol");
        Medicine medicine3 = new Medicine();
        medicine3.setName("Amoxylin");
        medicineRepo.saveAll(List.of(medicine,medicine2,medicine3));

        Prescription prescription = new Prescription();
        prescription.setMedicines(List.of(medicine,medicine2));
        Prescription prescription2 = new Prescription();
        prescription2.setMedicines(List.of(medicine,medicine3));

        prescriptionRepo.saveAll(List.of(prescription,prescription2));

    }
}
