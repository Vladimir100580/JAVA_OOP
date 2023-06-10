package HW4_05_06_2023.view;

import HW4_05_06_2023.controller.UserController;
import HW4_05_06_2023.model.Teacher;
import java.util.List;
import java.util.Scanner;


public class TeacherView implements UserView<Teacher> {
    UserController<Teacher> controller;

    public TeacherView(UserController<Teacher> controller) {
        this.controller = controller;
    }

    @Override
    public void sendOnConsole(String sortType) {
        List<Teacher> teachers = switch (sortType) {
            case SortType.NONE -> controller.getAll();
            case SortType.NAME -> controller.getAllSortUsers();
            case SortType.FAMILY -> controller.getAllSortUsersByFamilyName();
            case SortType.AGE -> controller.getAllSortUsersByAge();
            default -> null;
        };
        if (teachers == null)  {
            System.out.println("Учителя в списке отсутствуют");
            return;
        }
        System.out.println("====================================");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        System.out.println("====================================");
    }


    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        controller.create(fullName, age, phoneNumber);
    }

    @Override
    public int getMaxFullName() {
        return controller.getMaxFullName();
    }

    @Override
    public void removeUser(String fullName) {
        controller.removeUser(fullName);
    }

    Scanner in = new Scanner(System.in);       // На будущее
    public String getValue(String title) {
        System.out.printf("%s", title);
        return in.nextLine();
    }

    public void buttonClickID() {
        controller.buttonClickID();
    }

}
