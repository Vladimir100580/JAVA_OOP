package HW4_05_06_2023.repository;

import HW4_05_06_2023.model.User;

import java.util.List;

public interface UserRepository<T extends User> {
    List<T> getAll();
    void add(T t);
    void remove(String name);
    Long getMaxId();
}
