package HW4_05_06_2023.model;

import lombok.*;


@Getter
@EqualsAndHashCode(callSuper = true)
public class Teacher extends User implements Comparable<Teacher> {
    public Teacher(Long id, String fullName, Integer age, String phoneNumber) {
        super(id, fullName, age, phoneNumber);
    }

    private Integer experience; // стаж
    private String academicDegree; // ученая степень

    @Override
    public int compareTo(Teacher o) {
        return getFullName().compareTo(o.getFullName()); } // сортируем по имени

    public String toString() {
        return String.format("Учитель: %s\t%s\t%s\t%s", getId(), getFullName(), getAge(), getPhoneNumber());
    }

}
