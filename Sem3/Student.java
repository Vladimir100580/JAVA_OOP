package Sem3;

import lombok.*;

//@Getter
//@AllArgsConstructor
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Student{   // implements Comparable<Student> {

    private final Long id;
    private final String fullName;


//    @Override
//    public int compareTo(Student o) {
//        if (this.id > o.id)
//            return 1;
//        else if (this.id < o.id)
//            return -1;
//        else
//            return 0;
//    }



}
