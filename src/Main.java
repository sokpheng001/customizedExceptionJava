import exception.EmailValidatorException;
import exception.UserNotFoundException;
import model.User;
import repository.UserRepository;
import service.UserService;
import service.UserServiceImp;

public class Main{
    private static final UserService userService = new UserServiceImp();
    public static void main(String[] args) {
        System.out.println("List all users: ");
        for(User user: UserRepository.allUsers()){
            System.out.println(user);
        }
        try{
            System.out.println("User founded: ");
            System.out.println(userService.findUserById(3));
        }catch (UserNotFoundException exception){
            System.out.println(exception.getMessage());
        }
    }
}
