package org.g_29.hibernatespringboot.Repository;

import org.g_29.hibernatespringboot.Model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepo extends JpaRepository<Prescription,Long> {
}
