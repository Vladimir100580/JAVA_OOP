package HW4_05_06_2023.service;

import HW4_05_06_2023.model.Student;
import HW4_05_06_2023.model.User;
import HW4_05_06_2023.repository.StudentRepository;
import HW4_05_06_2023.repository.UserRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService implements UserService<Student> {

    private final UserRepository<Student> studentRepository;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        Long id = studentRepository.getMaxId() + 1;

        // Делаем красоту вывода, добавляя пробелы к полному имени исходя из самого длинного имени
//        int maxlengthFN = studentRepository.getMaxFullName();
//        fullName + " ".repeat(Math.max(0, maxlengthFN - fullName.length()))
        Student student = new Student(id, fullName, age, phoneNumber);
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
/*        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });*/
//        students.sort((o1, o2) -> o1.getAge().compareTo(o2.getAge()));
        students.sort(Comparator.comparing(User::getAge));

        return students;
    }

    @Override
    public void removeUser(String fullName) {
        studentRepository.remove(fullName);
    }
}
