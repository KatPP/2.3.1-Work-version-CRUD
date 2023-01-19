package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void removeUserById(Long id);

    void editUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();
}