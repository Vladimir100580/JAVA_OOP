package HW5_08_06_2023.view;

import java.util.Scanner;

public class StudyGroupView {

    Scanner in = new Scanner(System.in);

    public String getValue(String title) {
        System.out.printf("%s", title);
        return in.nextLine().trim();           //Удаляем пробелы в начале и в конце строки
    }


}
