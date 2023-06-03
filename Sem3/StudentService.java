package Sem3;

import java.util.Iterator;
import java.util.List;


public class StudentService implements Comparable<Student> {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student){
        studentRepository.addStudent(student);
    }

    public void printAll() {
        for (Student student : studentRepository.getStudentGroup()) {
            System.out.printf("ID: %s, Имя, Фамилия: %s\n", student.getId(), student.getFullName());
        }
        System.out.println();
    }

    public void sort1All() {           // Как обратиться к studentsList здесь с помощью того же Collections.sort
        System.out.println();
//            Collections.sort(studentRepository.getStudentGroup());
//            System.out.printf("ID: %s, Имя, Фамилия: %s\n", student.getId(), student.getFullName());
        Iterator<Student> iterator = studentRepository.getStudentGroup().iterator();
        System.out.println(iterator);
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getFullName());
        }
        //Collections.sort(studentsList);
    }

    public void deleteStudent(String fullName) {
        Iterator<Student> iterator = studentRepository.getStudentGroup().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getFullName().equals(fullName)) {
                iterator.remove();
            }
        }
    }



    public void sortStudent(String fullName) {

        System.out.println();
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }


    //    public int compareTo(Student o) {
//        if (this.id > o.id)
//            return 1;
//        else if (this.id < o.id)
//            return -1;
//        else
//            return 0;
//    }



}
