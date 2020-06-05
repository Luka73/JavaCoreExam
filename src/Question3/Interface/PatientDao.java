package Question3.Interface;

import Question3.Entity.Patient;

import java.util.List;

public interface PatientDao {
    void create(Patient p);
    List<Patient> findAll();
}
