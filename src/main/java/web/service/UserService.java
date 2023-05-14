package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    public void saveUser(User user);
    public List<User> getAllUsers();

    public User getUser(int id);

    public void updateUser(User user);

    public void deleteUser(int id);

}
