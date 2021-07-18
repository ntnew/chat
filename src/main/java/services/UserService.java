package services;

import entities.User;
import java.util.List;
import java.util.UUID;
import dao.UserDao;

public class UserService {

  private UserDao usersDao = new UserDao();

  public UserService() {
  }

  public User findUser(UUID id) {
    return usersDao.findById(id);
  }

  public void saveUser(User user) {
    usersDao.save(user);
  }

  public void deleteUser(User user) {
    usersDao.delete(user);
  }

  public void updateUser(User user) {
    usersDao.update(user);
  }

  public List<User> findAllUsers() {
    return usersDao.findAll();
  }
}
