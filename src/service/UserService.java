package service;

import exception.UserNotFoundException;
import model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User findUserById(Integer id) throws UserNotFoundException;
}
