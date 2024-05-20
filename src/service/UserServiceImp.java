package service;

import exception.UserNotFoundException;
import model.User;
import repository.UserRepository;

import java.util.List;

public class UserServiceImp implements UserService{
    @Override
    public List<User> getAllUsers() {
        return UserRepository.allUsers();
    }

    @Override
    public User findUserById(Integer id) throws UserNotFoundException {
        User user1 = null;
        for(User user: UserRepository.allUsers()){
            if(user.getId().equals(id)){
                user1 = user;
            }
        }
        if(!(user1 ==null)){
            return user1;
        }
        throw new UserNotFoundException("User not found with id: " + id);
//        return UserRepository.allUsers().stream()
//                .filter(e->e.getId().equals(id)).toList()
//                .getFirst();
    }
}
