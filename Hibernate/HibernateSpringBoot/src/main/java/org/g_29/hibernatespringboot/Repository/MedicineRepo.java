package org.g_29.hibernatespringboot.Repository;

import org.g_29.hibernatespringboot.Model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRepo extends JpaRepository<Medicine,Long> {
}
