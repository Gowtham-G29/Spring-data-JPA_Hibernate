package org.g_29.hibernatespringboot.Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
public class PrescriptionId implements Serializable {

    private Long doctorId;
    private Long patientId;

    @Override
    public int hashCode() {
        return Objects.hash(doctorId, patientId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(o instanceof PrescriptionId) {
            return Objects.equals(this.doctorId, ((PrescriptionId) o).doctorId)
                    &&Objects.equals(this.patientId, ((PrescriptionId) o).patientId);
        }

        return false;
    }
}
