package Question3;

import Question3.Dao.PatientDaoImpl;
import Question3.Entity.Patient;

import java.util.List;
import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        System.out.println("Welcome!");

        while(option != 3) {
            System.out.println("Choose an option: ");
            System.out.println("1. Create Patient");
            System.out.println("2. List all Patients");
            System.out.println("3. Exit");
            option = sc.nextInt();

            PatientDaoImpl dao = new PatientDaoImpl();

            switch (option) {
                case 1:
                    Patient p = new Patient();
                    System.out.println("1. Create Patient: ");
                    System.out.println("First Name: ");
                    p.setFirstName(sc.next());
                    System.out.println("Last Name: ");
                    p.setLastName(sc.next());
                    System.out.println("City: ");
                    p.setCity(sc.next());
                    System.out.println("Province: ");
                    p.setProvince(sc.next());
                    dao.create(p);
                    System.out.println("Patient created!");
                    break;
                case 2:
                    System.out.println("2. List all Patients: ");
                    List<Patient> patientList = dao.findAll();
                    for (Patient pt : patientList) {
                        System.out.println("Patient personal data: ");
                        System.out.println("Name: " + pt.getFirstName() + " " + pt.getLastName());
                        System.out.println("Location: " + pt.getCity() + ", " + pt.getProvince());
                        System.out.println("*******************************************************");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Please, choose a valid option!");
                    break;
            }
        }
    }
}
