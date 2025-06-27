package org.g_29.hibernatespringboot.Repository;

import jakarta.transaction.Transactional;
import org.g_29.hibernatespringboot.Model.Gender;
import org.g_29.hibernatespringboot.Model.Patient;
import org.g_29.hibernatespringboot.Model.PatientSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Long> {

    @Query(value = "SELECT p FROM Patient p WHERE p.gender=:gender")
    List<Patient>findAllPatients(Gender gender);

    List<Patient>findByNameAndGender(String name,Gender gender);

    @Query("select p from Patient p where p.age> :minAge")
    List<Patient>findOlderThan(@Param("minAge") int age);

    List<Patient> findByAgeGreaterThan(@Param("minAge") int age);

    List<Patient>findByNameStartsWith(String nameStartsWith);

    //SORTING RESULTS

    @Query("select p from Patient p order by p.age")
    List<Patient>sortByAge();

    List<Patient> findByGenderOrderByAge(Gender gender);


    int countPatientsByNameStartingWith(String name);


    @Query("SELECT AVG(p.age) FROM Patient p WHERE p.gender = :gender")
    Double avgPatientsAgeByGender(@Param("gender") Gender gender);


    //BULK UPDATE /DELETE


    @Modifying
    @Transactional
    @Query("UPDATE Patient p set p.age=p.age+1")
    int bulkIncreaseAge();

    @Modifying
    @Transactional
    @Query("DELETE from Patient p where p.age < ?1")
    int bulkDeleteByAge(int age);

    @Query("SELECT NEW " +
            "org.g_29.hibernatespringboot.Model.PatientSummary( p.name,p.age)" +
            " from Patient p")
    List<PatientSummary>getPatientsSummary();


    //Named Queries
    List<Patient>olderThanAge(@Param("minAge")int age);


}
