package HW4_05_06_2023.service;

import HW4_05_06_2023.model.Student;
import HW4_05_06_2023.model.Teacher;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;


public class TeacherGroupIterator implements Iterator<Teacher> {

    private final List<Teacher> teacherList;
    private int position;

    public TeacherGroupIterator(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public boolean hasNext() {
        return position < teacherList.size();
    }

    @Override
    public Teacher next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return teacherList.get(position++);
    }

    @Override
    public void remove() {
        teacherList.remove(position-1);
    }
}
