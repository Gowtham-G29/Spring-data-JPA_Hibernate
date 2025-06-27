package org.g_29.hibernatespringboot.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class PatientSummary {
    private String name;
    private int age;
}
