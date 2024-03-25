package main.java.com.yourapp.application;

import main.java.com.yourapp.data.UserDao;

public class UserService {
    @SuppressWarnings("rawtypes")
    private UserDao userDao;

    // Assuming UserDao is injected or instantiated elsewhere and passed to the UserService
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUserById(int id) {
        // Use UserDao to retrieve user from the database
        return userDao.getUserById(id);
    }

    public void createUser(User user) {
        // Validate user details (you can add more validations as needed)
        if (user.getName() == null || user.getName().isEmpty()) {
            throw new IllegalArgumentException("User name cannot be empty");
        }
        // Use UserDao to save the user to the database
        userDao.saveUser(user);
    }
}
