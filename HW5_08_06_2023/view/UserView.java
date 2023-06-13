package HW5_08_06_2023.view;

import HW5_08_06_2023.model.User;

public interface UserView<T extends User> {
    void sendOnConsole(String sortType); //GET
    void create(String fullName, Integer age, String phoneNumber, String nameGroup); //POST
    void removeUser(String fullName); //DELETE
    int getMaxFullName();
    void buttonClickID();
    T getById(int hum);
}
