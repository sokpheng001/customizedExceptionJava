package service;

import exception.UserNotFoundException;
import model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User findUserById(Integer id) throws UserNotFoundException;
}
