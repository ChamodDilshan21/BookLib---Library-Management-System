package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Employee {

    public Employee(String name, String email, String contact, String password, String role) {
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.password = password;
        this.role = role;
    }

    String empId;
    String name;
    String email;
    String contact;
    String password;
    String role;
}
