package HW5_08_06_2023.service;

import HW5_08_06_2023.model.Student;
import HW5_08_06_2023.model.Teacher;
import HW5_08_06_2023.model.User;
import HW5_08_06_2023.repository.StudentRepository;
import HW5_08_06_2023.repository.UserRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService implements UserService<Student> {

    private final UserRepository<Student> studentRepository;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String nameGroup) {
        Long id = studentRepository.getMaxId() + 1;
        Student student = new Student(id, fullName, age, phoneNumber, nameGroup);
        studentRepository.add(student);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    @Override
    public List<Student> getAllSortUsers() {
        List<Student> students = studentRepository.getAll();
        Collections.sort(students);
        return students;
    }

    @Override
    public List<Student> getAllSortUsersByFamilyName() {
        List<Student> students = studentRepository.getAll();
        students.sort(new UserComparator<>());

        return students;
    }

    @Override
    public List<Student> getAllSortUsersByAge() {
        List<Student> students = studentRepository.getAll();
        students.sort(Comparator.comparing(User::getAge));

        return students;
    }

    @Override
    public void removeUser(String fullName) {
        studentRepository.remove(fullName);
    }


    public int getMaxFullName() {             // !! Для красоты вывода в консоли (в разработке))
        List<Student> students = studentRepository.getAll();
        int maxFN = 0;
        for (Student student : students) {
            if (student.getFullName().length() > maxFN) {
                maxFN = student.getFullName().length();
            }
        }
        return maxFN;
    }

    @Override
    public void buttonClickID() {    }

    public Student getById(int stud) {
        List<Student> students = studentRepository.getAll();
        Student s = null;
        for (Student student : students) {
            if (student.getId() == stud) {
                s = student;
            }
        }
        return s;
    }

    public List<Student> getByNameGroup(String nameGroup){
        List<Student> students = studentRepository.getAll();
        List<Student> lS = new ArrayList<Student>();
        for (Student student : students) {
            if (student.getNameGroup().equals(nameGroup)) {
                lS.add(student);
            }
        }
        return lS;
    }
}
