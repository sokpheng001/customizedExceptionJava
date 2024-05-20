package repository;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository{
    public static List<User> allUsers(){
        List<User> userList
                = new ArrayList<>(
                        List.of(
                                new User(1,"KoKo","Male","koko123@gmail.com","!@##@$@$%$#%@#$%"),
                                new User(2,"KaKa","Female","kaka567@gmail.com","123134#@%$^&%"))
        );
        return userList;
    }
}
