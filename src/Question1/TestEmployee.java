package Question1;

import Question1.Entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
    public static void main(String[] args) {
        Employee em1 = new Employee("Gabriel", "Granado", "Vancouver", 1234,"British Columbia", 2000);
        Employee em2 = new Employee("Cloe", "Tunner", "Toronto", 5678,"Ontario", 4300);
        Employee em3 = new Employee("Simon", "Bigars", "Montreal", 9012,"Quebec", 1200);
        Employee em4 = new Employee("Amanda", "Dantas", "Gatineau", 3456,"Quebec", 3800);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(em1);
        employeeList.add(em2);
        employeeList.add(em3);
        employeeList.add(em4);

        for (Employee e : employeeList) {
            System.out.println("Employee personal data: ");
            System.out.println("Name: " + e.getFirstName() + " " + e.getLastName());
            System.out.println("Location: " + e.getCity() + ", " + e.getProvince());
            System.out.println("ZIP: " + e.getZip());
            System.out.println("Salary: " + e.getSalary());
            System.out.println("**************************************");
        }
    }
}
