package HW4_05_06_2023.service;

import HW4_05_06_2023.model.Student;
import HW4_05_06_2023.model.User;

import java.util.List;

public interface UserService<T extends User> {
    void create(String fullName, Integer age, String phoneNumber);
    List<T> getAll();
    List<T> getAllSortUsers();
    List<T> getAllSortUsersByFamilyName();
    List<T> getAllSortUsersByAge();
    void removeUser(String fullName);
    int getMaxFullName();
    void buttonClickID();

}
