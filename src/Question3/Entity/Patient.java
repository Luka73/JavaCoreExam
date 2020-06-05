package Question3.Entity;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String firstName;
    private String lastName;
    private String city;
    private String province;

    public Patient() {

    }

    public Patient(String firstName, String lastName, String city, String province) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.province = province;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
