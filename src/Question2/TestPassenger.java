package Question2;

import Question1.Entity.Employee;
import Question2.Entity.Passenger;

import java.util.ArrayList;
import java.util.List;

public class TestPassenger {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("Gabriel", "Granado", "Vancouver", 1234, "Canada", "Montreal", "03/03/2020");
        Passenger p2 = new Passenger("Cloe", "Tunner", "Toronto", 5678,"Ontario", "Rio de Janeiro", "04/20/2019");
        Passenger p3 = new Passenger("Simon", "Bigars", "Montreal", 9012,"Quebec", "New York", "12/01/2020");
        Passenger p4 = new Passenger("Amanda", "Dantas", "Gatineau", 3456,"Quebec", "Paris", "09/30/2019");

        List<Passenger> passengerList= new ArrayList<>();
        passengerList.add(p1);
        passengerList.add(p2);
        passengerList.add(p3);
        passengerList.add(p4);

        System.out.println("Test data: ");
        System.out.println("First Name, Last Name, Departure, Country, Zip, Departure City, Departure Date");
        for (Passenger p : passengerList) {
            System.out.println( p.getFirstName() + ",  " +
                                p.getLastName() + ",  " +
                                p.getDepartureCity() + ",  " +
                                p.getCountry() + ",  " +
                                p.getZip() + ",  " +
                                p.getDepartureCity() + ",  " +
                                p.getDepartureDate());
        }



    }
}
