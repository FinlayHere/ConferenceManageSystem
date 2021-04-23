package code.entity;

import java.util.ArrayList;
import java.util.List;

public class Author extends User{
    public void submitPaper(){
        System.out.println("submit Paper");
    }

    public List<Notification> checkNotifications(){
        return new ArrayList<>();
    }
}
