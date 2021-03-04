import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new LinkedList<>();
        users.add(new User(1,"Mykyta"));
        users.add(new User(2,"Ruslan"));
        users.add(new User(3,"Yewgen"));
        users.add(new User(4,"Stepan"));
        users.add(new User(5,"Danylo"));
        System.out.println(users);
    }
}
