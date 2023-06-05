package HW3_01_06_2023;

import lombok.Data;

//@Getter
//@AllArgsConstructor
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Student implements Comparable<Student> {

    private final Long id;
    private final String fullName;

    @Override
    public int compareTo(Student o) {
        return fullName.compareTo(o.fullName);
    }
}
