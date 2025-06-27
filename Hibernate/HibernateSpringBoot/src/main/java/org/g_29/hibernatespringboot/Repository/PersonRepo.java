package org.g_29.hibernatespringboot.Repository;

import org.g_29.hibernatespringboot.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person,Long> {
}
