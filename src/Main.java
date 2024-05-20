import exception.UserNotFoundException;
import model.User;
import service.UserService;
import service.UserServiceImp;


public class Main{
    private final static UserService userService = new UserServiceImp();
    public static void main(String[] args) {
        System.out.println("All Users: ");
        for(User user: userService.getAllUser()){
            System.out.println(user);
        }
        System.out.println("Find User: ");
        try{
            System.out.println(userService.findUserById(3));
        }catch (UserNotFoundException notFoundException){
            System.out.println(notFoundException.getMessage());
        }
    }
}
