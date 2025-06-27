package org.g_29.hibernatespringboot.Repository;

import org.g_29.hibernatespringboot.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor,Long> {

    int countDoctorBySpecialization(String specialization);
}
