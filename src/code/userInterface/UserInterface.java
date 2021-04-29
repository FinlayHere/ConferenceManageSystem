package code.userInterface;

import code.entity.User;

public class UserInterface {
    private static final String LINE = "******************************************************************************";
    private static final String BLANK = "*                                                                             *";
    public void displayMainPage(){
        System.out.println(LINE);
        System.out.println(BLANK);
        System.out.println("*                                      welcome to CMS                                *");
        System.out.println("*                                      input 1 to login                              *");
        System.out.println("*                                      input 2 to register                           *");
        System.out.println(BLANK);
        System.out.println(LINE);

    }

    public void displayHomePage(User user) {
        if ("admin".equals(user.getRole())){
            displayAdminPage();
        }
    }

    public void displayAdminPage() {
        System.out.println("welcome to admin page");
    }

    public void displayRegisterPage() {
        System.out.println(LINE);
        System.out.println(BLANK);
        System.out.println("*                                      welcome to CMS                                *");
        System.out.println("*                                      please give email:                             *");
        System.out.println("*                                      please give password:                           *");
        System.out.println("*                                      please give role:                              *");
        System.out.println(BLANK);
        System.out.println(LINE);
    }

    public void displayLoginPage() {
    }
}
