package org.g_29.hibernatespringboot.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "person_type")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Person {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   private String name;
   private int age;
   private String email;
}
