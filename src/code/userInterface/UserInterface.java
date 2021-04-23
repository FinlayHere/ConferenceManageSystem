package code.userInterface;

import code.entity.User;

public class UserInterface {
    public void displayHomePage(User user) {
        if ("admin".equals(user.getRole())){
            displayAdminPage();
        }
    }

    public void displayAdminPage() {
        System.out.println("welcome to admin page");
    }
}
