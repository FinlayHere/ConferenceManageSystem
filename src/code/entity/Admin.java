package code.entity;

import java.util.List;

public class Admin extends User{
    private List<User> users;

    public Admin(String id, String email, String password, String role, List<User> users) {
        super(id, email, password, role);
        this.users = users;
    }

    public Admin(List<User> users) {
        this.users = users;
    }

    public String Im() {
        return "admin";
    }

    public void retrieveUser() {
        users.forEach(
                user ->{
                    System.out.println(user.getUserLine());
                }
        );
    }
}
