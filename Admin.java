package d4;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the admin who manages users.
 */
public class Admin {
    private List<User> users;

    public Admin() {
        this.users = new ArrayList<>();
    }

    // Method to manage users
    public void manageUsers() {
        System.out.println("Managing users:");
        for (User user : users) {
            System.out.println(user.toString());
        }
    }

    // Method to add a user
    public void addUser(User user) {
        users.add(user);
        System.out.println("Added user: " + user.toString());
    }
}
