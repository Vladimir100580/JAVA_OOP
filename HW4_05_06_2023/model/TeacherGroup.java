package HW4_05_06_2023.model;

import HW4_05_06_2023.service.TeacherGroupIterator;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
@ToString
//@Data
public class TeacherGroup implements Iterable<Teacher> {

    private final List<Teacher> teachersList;

    public TeacherGroup() {
        teachersList = new ArrayList<>();
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(teachersList);
    }

    public void addStudent(Teacher teacher) {
        teachersList.add(teacher);
    }
}
