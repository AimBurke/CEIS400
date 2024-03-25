package main.java.com.yourapp.data;

import java.com.yourapp.dao.UserDao;
import java.com.yourapp.model.User;

public class UserDao<User> {
    private UserDao userDao;

    // Assuming UserDao is injected or instantiated elsewhere and passed to the UserService
    public UserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUserById(int id) {
        // Use UserDao to retrieve user from the database
        return userDao.getUserById(id).orElseThrow(() -> new RuntimeException("User not found for ID: " + id));
    }

    public void createUser(User user) {
        // Validate user details (you can add more validations as needed)
        if (user.getName() == null || user.getName().isEmpty()) {
            throw new IllegalArgumentException("User name cannot be empty");
        }
        
        // Additional validation checks can be added here
        // e.g., checking for unique username or email, if applicable

        // Use UserDao to save the user to the database
        userDao.saveUser(user);
    }
}
