package HW4_05_06_2023;


import HW4_05_06_2023.controller.StudentController;
import HW4_05_06_2023.controller.TeacherController;
import HW4_05_06_2023.repository.StudentRepository;
import HW4_05_06_2023.repository.TeacherRepository;
import HW4_05_06_2023.service.StudentService;
import HW4_05_06_2023.service.TeacherService;
import HW4_05_06_2023.view.SortType;
import HW4_05_06_2023.view.StudentView;
import HW4_05_06_2023.view.TeacherView;

public class Main {
    public static void main(String[] args) {
        StudentView view = getStudentView();
//----------------------------------------------------------------------
        view.create("Петр Иванов", 21, "+79216743625");
        view.create("Светлана Матвийчук", 19, "+79114583254");
        view.create("Никита Сидоров", 21, "+79082742254");
        view.create("Дамир Мухтаров", 18, "+79501256545");
        view.create("Станислав Азаров", 20, "+79994515843");

        System.out.println("\n---- Учащиеся ----\n");
        System.out.println("---- Без сортировки ----");
        view.sendOnConsole(SortType.NONE);
        System.out.println("---- сортировка по имени ----");
        view.sendOnConsole(SortType.NAME);
        System.out.println("---- сортировка по фамилии ----");
        view.sendOnConsole(SortType.FAMILY);
        System.out.println("---- сортировка по возрасту ----");
        view.sendOnConsole(SortType.AGE);

        System.out.println("\n---- Преподаватели ----\n");

        TeacherView view1 = getTeacherView();
        view1.create("Олег Михайлович Мартынов", 47, "+7905345217");
        view1.create("Максим Евгеньевич Кузнецов", 41, "+79113840432");
        view1.create("Татьяна Владимировна Азарова", 53, "+79123462387");
        view1.create("Виктория Дмитриевна Лаушкина", 33, "+79164563421");
        view1.create("Андрей Геннадьевич Чапилев", 62, "+79222345427");

        int a = view.getMaxFullName();

        System.out.println("---- Без сортировки ----");
        view1.sendOnConsole(SortType.NONE);
        System.out.println("---- сортировка по имени ----");
        view1.sendOnConsole(SortType.NAME);
        System.out.println("---- сортировка по фамилии ----");
        view1.sendOnConsole(SortType.FAMILY);
        System.out.println("---- сортировка по возрасту ----");
        view1.sendOnConsole(SortType.AGE);
        view1.buttonClickID();
        view1.sendOnConsole(SortType.NONE);
        // В UserComparator добавлена 13 строка, указывающая на последнее слово в fullName,
        // по которому происходит сортировка, т.е. на фамилию, в обоих случаях.
    }


    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

    public static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }

}