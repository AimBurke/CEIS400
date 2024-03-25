package main.java.com.yourapp.model;

public class equipmentcondition {
    private Long id;
    private String roleName;

    // Constructors
    public equipmentcondition() {}

    public equipmentcondition(Long id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getRoleName() {
        return roleName;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
