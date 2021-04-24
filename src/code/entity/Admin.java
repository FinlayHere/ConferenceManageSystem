package code.entity;

import java.util.List;

public class Admin extends User{
    private List<User> users;
    private List<Conference> conferences;
    private List<Paper> papers;

    public Admin(User user, List<User> users) {
        super(user.getId(), user.getEmail(), user.getPassword(), user.getRole());
        this.users = users;
    }

    public Admin(User user, List<User> users, List<Conference> conferences, List<Paper> papers) {
        super(user.getId(), user.getEmail(), user.getPassword(), user.getRole());
        this.users = users;
        this.papers = papers;
        this.conferences = conferences;
    }

    public String Im() {
        return "admin:" + getEmail();
    }

    public void retrieveUser() {
        users.forEach(
                user ->{
                    System.out.println(user.getEntityLine());
                }
        );
    }
}
