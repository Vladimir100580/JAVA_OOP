package HW5_08_06_2023.service;

import HW5_08_06_2023.model.StudyGroup;

import java.util.List;

public class StudyGroupService extends StudyGroup {
    public StudyGroupService(Integer teacher, List<Integer> students) {
        super(teacher, students);
    }

    public void createStudyGroup(StudyGroup sg){
        System.out.println(sg);

    }
}
