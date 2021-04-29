import code.entity.Admin;
import code.entity.CmsEntity;
import code.entity.Paper;
import code.entity.User;
import code.accessor.Accessor;
import code.repo.PaperRepository;
import code.repo.UserRepository;
import code.userInterface.UserInterface;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

//Controller
public class ConferenceManageSystem {
    private static final UserRepository userRepository = UserRepository.getInstance();

    public static void main(String[] args) {
        User user = null;
        ConferenceManageSystem conferenceManageSystem = new ConferenceManageSystem();

        try {
            user = conferenceManageSystem.begin();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private User begin() throws Exception {
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface();
        ui.displayMainPage();
        Integer userOption = null;
        User systemUser = null;
        try {
            userOption = scanner.nextInt();
        } catch (Exception e) {
            throw new Exception("Wrong format");
        }
        if (userOption == 1) {
            ui.displayRegisterPage();
            System.out.println("please give you email:");
            String email = scanner.nextLine();
            System.out.println("please give you password:");
            String password = scanner.nextLine();
            System.out.println("please give you role");
            String role = scanner.nextLine();
            systemUser = new User();
        } else if (userOption == 2) {
            ui.displayLoginPage();
        } else {
            throw new Exception("invalid input");
        }
    }

//    private User login(String email, String password) {
//        try {
//            // Java 8 lambda
//            User targetUser = users.stream()
//                    .filter(user -> email.equals(user.getEmail()))
//                    .findFirst()
//                    .orElseThrow(() -> new Exception("user not exist!"));
//            if (!targetUser.passwordEqualTo(password)) {
//                throw new Exception("password wrong!");
//            }
//            return targetUser;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//        return null;
//    }
}
