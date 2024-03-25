package main.java.com.yourapp.model;

public class userrole {
    private Long id;
    private String roleName;

    // Constructors
    public userrole() {}

    public userrole(Long id, String roleName) {
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

