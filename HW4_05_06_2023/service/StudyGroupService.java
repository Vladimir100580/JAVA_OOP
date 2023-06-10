package HW4_05_06_2023.service;

import HW4_05_06_2023.model.StudyGroup;
import HW4_05_06_2023.model.Teacher;
import Sem3.StudentGroup;

import java.util.List;

public class StudyGroupService extends StudyGroup {
    public StudyGroupService(Integer teacher, List<Integer> students) {
        super(teacher, students);
    }

    public void createStudyGroup(StudyGroup sg){
        System.out.println(sg);

    }
}
