package HW4_05_06_2023.model;
// Учебная группа

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
//@AllArgsConstructor

public class StudyGroup {

    private Integer teacher;
    private List<Integer> students;

    public StudyGroup(Integer teacher, List<Integer> students) {
        this.teacher = teacher;
        this.students = students;
    }
}

