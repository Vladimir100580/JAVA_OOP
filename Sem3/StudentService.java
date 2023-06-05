package Sem3;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentService extends StudentGroup {


    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student){
        studentRepository.addStudent(student);
    }

//    public StudentService(List<Student> list) {
//        this.list = list;
//    }

    //List<Student> list = StudentGroup.getStudentsList();

    public void sort1All(List<Student> studentsList) {           // Как обратиться к studentsList здесь с помощью того же Collections.sort
        System.out.println(studentsList);



        Iterator<Student> iterator = studentRepository.getStudentGroup().iterator();
        //Collections.sort(studentRepository.getStudentGroup());
        System.out.println(studentRepository.getStudentGroup());
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getFullName());
        }
        //Collections.sort(studentsList);
    }



    public void printAll() {
        for (Student student : studentRepository.getStudentGroup()) {
            System.out.printf("ID: %s, Имя, Фамилия: %s\n", student.getId(), student.getFullName());
        }
//        System.out.println(studentRepository);
//        System.out.println(studentRepository.getStudentGroup());
//        System.out.println(studentRepository.getStudentGroup().getStudentsList());
    }

    public void deleteStudent(String fullName) {
        Iterator<Student> iterator = studentRepository.getStudentGroup().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getFullName().equals(fullName)) {
                iterator.remove();
            }
        }
    }

}




