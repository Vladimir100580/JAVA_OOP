package HW5_08_06_2023.service;

import HW5_08_06_2023.model.StudyGroup;

public interface GroupService<T extends StudyGroup> {
    void createGroup(String nameGroup);
}
