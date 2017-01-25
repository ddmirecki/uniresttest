package pl.sda;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by RENT on 2017-01-25.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {

    String firstName;
    String lastName;
    int birthYear;
    double height;
    String id;

    public Customer(){

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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", height=" + height +
                ", id='" + id + '\'' +
                '}';
    }
}
