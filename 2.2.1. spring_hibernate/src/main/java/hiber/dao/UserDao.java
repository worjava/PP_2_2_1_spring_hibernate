package hiber.dao;

import hiber.model.User;
import hiber.model.Car;

import java.util.List;

public interface UserDao {
   void add(User user);
   void add(Car car);

   List <User> getOwnCar(String model, int series);
   List<User> listUsers();
}
