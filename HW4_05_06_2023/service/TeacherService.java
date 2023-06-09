package HW4_05_06_2023.service;


import HW4_05_06_2023.model.User;
import HW4_05_06_2023.model.Teacher;
import HW4_05_06_2023.repository.TeacherRepository;
import HW4_05_06_2023.repository.UserRepository;

import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class TeacherService implements UserService<Teacher>{

    private final UserRepository<Teacher> teacherRepository;


    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        Long id = teacherRepository.getMaxId() + 1;
        Teacher teacher = new Teacher(id, fullName, age, phoneNumber);
        teacherRepository.add(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.getAll();
    }

    @Override
    public List<Teacher> getAllSortUsers() {
        List<Teacher> teachers = teacherRepository.getAll();
        Collections.sort(teachers);
        return teachers;
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(new UserComparator<>());
        return teachers;
    }


    @Override
    public List<Teacher> getAllSortUsersByAge() {
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(Comparator.comparing(User::getAge));
        return teachers;
    }

    @Override
    public void removeUser(String fullName) {
        teacherRepository.remove(fullName);
    }
}
