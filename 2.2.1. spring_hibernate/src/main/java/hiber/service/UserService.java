package hiber.service;

import hiber.model.User;
import hiber.model.Car;

import java.util.List;

public interface UserService {
    void add(User user);

    List <User> getOwnCar(String model, int series);

    void add(Car car);

    List<User> listUsers();
}
