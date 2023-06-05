package HW3_01_06_2023;

import java.util.Comparator;
import java.util.Iterator;

public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public void printAll() {
        for (Student student : studentRepository.getStudentGroup()) {
            System.out.printf("ID: %s, Имя, Фамилия: %s\n", student.getId(), student.getFullName());
        }
        System.out.println();
    }

    public void deleteStudent(String fullName) {
        Iterator<Student> iterator = studentRepository.getStudentGroup().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getFullName().equals(fullName)) {
                iterator.remove();
            }
        }
    }

    public void sortFirstName() {
        Comparator<Student> comparator = Comparator.comparing(o -> o.getFullName().split("\\s+")[0]);
        studentRepository.getStudentGroup().getStudentsList().sort(comparator);
    }

    public void sortLastName() {
        studentRepository.getStudentGroup().getStudentsList().sort(new StudentComparator());
    }

}
