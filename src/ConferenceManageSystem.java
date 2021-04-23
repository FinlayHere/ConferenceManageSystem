import code.entity.Admin;
import code.entity.CmsEntity;
import code.entity.User;
import code.loader.Accessor;
import code.userInterface.UserInterface;

import java.util.List;

public class ConferenceManageSystem {
    private static final Accessor<User> USER_ACCESSOR = new Accessor<>(CmsEntity.USER);
    private static List<User> users = USER_ACCESSOR.loadAll();

    public static void main(String[] args) {
        ConferenceManageSystem system = new ConferenceManageSystem();
        UserInterface userInterface = new UserInterface();
        String email = "123@qwe.com";
        String password = "123";

        User user = system.login(email, password);
        if (null != user) {
            System.out.println(user.toString());
        }
        if ("admin".equals(user.getRole())){
            Admin admin = new Admin(users);
            userInterface.displayAdminPage();
            System.out.println(admin.Im());
            admin.retrieveUser();
        }
        if ("chair".equals(user.getRole())){

        }
    }

    private User login(String email, String password) {
        try {
            User targetUser = users.stream()
                    .filter(user -> email.equals(user.getEmail()))
                    .findFirst()
                    .orElseThrow(() -> new Exception("user not exist!"));
            if (!targetUser.passwordEqualTo(password)) {
                throw new Exception("password wrong!");
            }
            return targetUser;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}
