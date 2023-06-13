package HW5_08_06_2023.controller;

import HW5_08_06_2023.model.Student;
import HW5_08_06_2023.service.StudentService;
import HW5_08_06_2023.service.UserService;

import java.util.List;

public class StudentController implements UserController<Student> {

    public UserService<Student> studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String nameGroup) {
        studentService.create(fullName, age, phoneNumber, nameGroup);
    }

    @Override
    public List<Student> getAllSortUsers() {
        return studentService.getAllSortUsers();
    }

    @Override
    public List<Student> getAllSortUsersByFamilyName() {
        return studentService.getAllSortUsersByFamilyName();
    }

    @Override
    public boolean removeUser(String fullName) {
        studentService.removeUser(fullName);
        return true;
    }

    @Override
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @Override
    public List<Student> getAllSortUsersByAge() {
        return studentService.getAllSortUsersByAge();
    }

    @Override
    public int getMaxFullName() {
        return studentService.getMaxFullName();
    }

    @Override
    public void buttonClickID() {    }

    public Student getById(int hum) { return studentService.getById(hum);}
}
