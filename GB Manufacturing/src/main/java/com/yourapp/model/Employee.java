package main.java.com.yourapp.model;

public class Employee {
    private Long id;
    private String name;
    private String department;
    private String position;
    private String email;
    private String phone;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor for all fields
    public Employee(Long id, String name, String department, String position, String email, String phone) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.position = position;
        this.email = email;
        this.phone = phone;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    // Optionally, override toString for easier printing/debugging
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
