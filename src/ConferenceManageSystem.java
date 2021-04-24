import code.entity.Admin;
import code.entity.CmsEntity;
import code.entity.Paper;
import code.entity.User;
import code.accessor.Accessor;
import code.userInterface.UserInterface;

import java.time.LocalDate;
import java.util.List;

//Controller
public class ConferenceManageSystem {
    private static final Accessor<User> USER_ACCESSOR = new Accessor<>(CmsEntity.USER);
    private static List<User> users = USER_ACCESSOR.loadAll();
//    private static final Accessor<Paper> PAPER_ACCESSOR = new Accessor<>(CmsEntity.PAPER);
//    private static List<Paper> papers = PAPER_ACCESSOR.loadAll();

    public static void main(String[] args) {
        ConferenceManageSystem system = new ConferenceManageSystem();
        UserInterface userInterface = new UserInterface();
        String email = "123@qwe.com";
        String password = "123";

        User user = system.login(email, password);
        if (null != user) {
            System.out.println(user.toString());
        }
        if ("admin".equals(user.getRole())) {
            Admin admin = new Admin(user, users, null, null);
            userInterface.displayAdminPage();
            System.out.println(admin.Im());
            admin.retrieveUser();
        }
        if ("chair".equals(user.getRole())) {

        }

        Paper paper = new Paper(1, 1, 3, "information", "big data", LocalDate.now(), "pdf", "pending");
        LocalDate conferenceDeadline = LocalDate.of(2021, 4, 23);


        System.out.println("Paper 提交时间：" + paper.getSubmitTime());
        System.out.println("Deadline :" + conferenceDeadline);
        if (paper.getSubmitTime().isBefore(conferenceDeadline) || paper.getSubmitTime().isEqual(conferenceDeadline)) {
            System.out.println("提交成功");
        } else {
            System.out.println("提交失败");
        }
    }

    private User login(String email, String password) {
        try {
            // Java 8 lambda
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
