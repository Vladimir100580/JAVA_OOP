package HW4_05_06_2023.repository;

import lombok.Getter;
import HW4_05_06_2023.model.Student;
import HW4_05_06_2023.model.StudentGroup;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements UserRepository<Student> {
    private final List<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public void remove(String fullName) {
        for (Student student : students) {
            if (student.getFullName().equals(fullName)) {
                students.remove(student);
                return;
            }
        }
    }

    @Override
    public Long getMaxId() {
        Long maxId = 0L;
        for (Student student : students) {
            if (student.getId() > maxId) {
                maxId = student.getId();
            }
        }
        return maxId;
    }

}
