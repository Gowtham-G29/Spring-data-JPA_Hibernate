package org.g_29.hibernatespringboot.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Doctor extends Person {

    private String specialization;

    @OneToMany(mappedBy ="doctor" , cascade = CascadeType.REMOVE )
    private List<Patient> patients;




}
