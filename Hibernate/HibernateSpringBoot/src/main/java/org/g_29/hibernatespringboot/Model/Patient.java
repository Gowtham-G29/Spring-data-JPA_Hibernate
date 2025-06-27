package org.g_29.hibernatespringboot.Model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString

@NamedQuery(
        name = "Patient.olderThanAge",
        query = "select p from Patient p where p.age> :minAge"
)
public class Patient extends Person {

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Transient
    private String ageGroup;

    @Embedded
    private Address address;

    @Lob
    private byte[] profileImage;

    @OneToOne
    @JoinColumn(name = "medical_record")
    private MedicalRecord medicalRecord;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    private String calculateAgeGroup(int age) {
        if(age >= 0 && age <= 12) {
            return "Child";
        }else if(age >= 12 && age <= 18) {
            return "Teenager";
        }else if(age >= 18 && age <= 25) {
            return "Adult";
        }else{
            return "Normal person";
        }
    }

//
//    public void setAge(int age) {
////        this.age = age;
//        this.ageGroup = calculateAgeGroup(age);
//    }
}
