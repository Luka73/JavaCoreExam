package Question3.Dao;

import Question3.Entity.Patient;
import Question3.Interface.PatientDao;

import java.util.ArrayList;
import java.util.List;

public class PatientDaoImpl implements PatientDao {

    static List<Patient> patientList = new ArrayList<>();

    @Override
    public void create(Patient p) {
        patientList.add(p);
    }

    @Override
    public List<Patient> findAll() {
        return patientList;
    }
}
