package HW4_05_06_2023.service;


import HW4_05_06_2023.model.Student;
import HW4_05_06_2023.model.User;
import HW4_05_06_2023.model.Teacher;
import HW4_05_06_2023.repository.TeacherRepository;
import HW4_05_06_2023.repository.UserRepository;

import java.util.*;

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


    public void buttonClickID(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ID учителя для корректировки: ");
        List<Teacher> teachers = teacherRepository.getAll();
        String id = in.nextLine();
        for (Teacher teacher : teachers) {
            if (teacher.getId()==Long.parseLong(id, 10)) {
                System.out.println(teacher);
                System.out.print("Введите ИОФ (Если в данном поле нет изменений, оставьте поле пустым: ");
                String iof = in.nextLine();
                if (Objects.equals(iof, "")) {iof = teacher.getFullName();}
                System.out.print("Введите возраст: ");
                String ag = in.nextLine();
                Integer ag1;
                if (Objects.equals(ag, "")) {ag1 = teacher.getAge();}
                else {ag1 = Integer.parseInt(ag);}
                System.out.print("Введите номер телефона: ");
                String tel = in.nextLine();
                if (Objects.equals(tel, "")) {tel = teacher.getPhoneNumber();}
                teacher.setFullName(iof);
                teacher.setAge(ag1);
                teacher.setPhoneNumber(tel);
                return;
            }
        }
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


    public int getMaxFullName() {
        List<Teacher> teachers = teacherRepository.getAll();
        int maxFN = 0;
        for (Teacher teacher : teachers) {
            if (teacher.getFullName().length() > maxFN) {
                maxFN = teacher.getFullName().length();
            }
        }
        return maxFN;
    }
}

