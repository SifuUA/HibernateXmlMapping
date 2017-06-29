package entity;

import java.util.Date;
import java.util.Set;

/**
 * Created by Alex on 29.06.2017.
 */
public class Employee {

    private Long id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private Address address;
    private Set<Project> projects;

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Address getAddress() {
        return address;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", address=" + address +
                '}';
    }
}
