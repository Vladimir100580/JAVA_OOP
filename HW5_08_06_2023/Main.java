package HW5_08_06_2023;

import HW5_08_06_2023.controller.StudentController;
import HW5_08_06_2023.controller.TeacherController;
import HW5_08_06_2023.model.Student;
import HW5_08_06_2023.model.StudyGroup;
import HW5_08_06_2023.repository.StudentRepository;
import HW5_08_06_2023.repository.TeacherRepository;
import HW5_08_06_2023.service.StudentService;
import HW5_08_06_2023.service.StudyGroupService;
import HW5_08_06_2023.service.TeacherService;
import HW5_08_06_2023.view.SortType;
import HW5_08_06_2023.view.StudentView;
import HW5_08_06_2023.view.StudyGroupView;
import HW5_08_06_2023.view.TeacherView;

import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentView view = getStudentView();
//----------------------------------------------------------------------
        view.create("Петр Иванов", 21, "+79216743625", "2МехМат");
        view.create("Светлана Матвийчук", 19, "+79114583254", "3ЭКО");
        view.create("Никита Сидоров", 21, "+79082742254", "4ИнфоТех");
        view.create("Дамир Мухтаров", 18, "+79501256545", "2МехМат");
        view.create("Станислав Азаров", 22, "+79994515843", "4ИнфоТех");
        view.create("Илья Кузьмин", 23, "+79902135493", "2МехМат");
        view.create("Полина Севастьянова", 18, "+79743725498", "3ЭКО");
        view.create("Георгий Шнайдер", 21, "+79324352756", "4ИнфоТех");

        System.out.println("\n---- Учащиеся ----\n");
        System.out.println("---- Без сортировки ----");
        view.sendOnConsole(SortType.NONE);
//        System.out.println("---- сортировка по имени ----");
//        view.sendOnConsole(SortType.NAME);
//        System.out.println("---- сортировка по фамилии ----");
//        view.sendOnConsole(SortType.FAMILY);
//        System.out.println("---- сортировка по возрасту ----");
//        view.sendOnConsole(SortType.AGE);

        System.out.println("\n---- Преподаватели ----\n");

        TeacherView view1 = getTeacherView();
        view1.create("Олег Михайлович Мартынов", 47, "+7905345217", "4ИнфоТех");
        view1.create("Максим Евгеньевич Кузнецов", 41, "+79113840432", "2МехМат");
        view1.create("Татьяна Владимировна Азарова", 53, "+79123462387", "3ЭКО");
        view1.create("Виктория Дмитриевна Лаушкина", 33, "+79164563421", "1Био");
        view1.create("Андрей Геннадьевич Чапилев", 62, "+79222345427", "4ИнфоТех");

        int a = view.getMaxFullName();

        System.out.println("---- Без сортировки ----");
        view1.sendOnConsole(SortType.NONE);
//        System.out.println("---- сортировка по имени ----");
//        view1.sendOnConsole(SortType.NAME);
//        System.out.println("---- сортировка по фамилии ----");
//        view1.sendOnConsole(SortType.FAMILY);
//        System.out.println("---- сортировка по возрасту ----");
//        view1.sendOnConsole(SortType.AGE);
//        view1.buttonClickID();
//        view1.sendOnConsole(SortType.NONE);


        // В UserComparator добавлена 13 строка, указывающая на последнее слово в fullName,
        // по которому происходит сортировка, т.е. на фамилию, в обоих случаях.

//        List<Integer> ll = new ArrayList<>();
//        ll.add(65);
//        ll.add(2);
//        System.out.println(ll);
//        StudyGroup df = new StudyGroup(3, ll);
//        StudyGroupService obj = new StudyGroupService(5, ll);
//        obj.createStudyGroup(df);
//        StudyGroupView io1 = new StudyGroupView();
//        String er = io1.getValue("Ввод: ");
//        System.out.printf("%s", er);

        StudyGroupView studyGroupView = new StudyGroupView();

        view1.viewTeacher(view1.getById(4));   // определение студента и преподавателя по ID (и вывод через вьюшку)
        view.viewStudent(view.getById(3));
        view.viewStudent(view.getById(9));


        String nameGr = studyGroupView.getValue("\nВведите группу: ");
        // поскольку на последнем практическом поступили обновленные вводные о названии группы у преподавателя и студента,
        // решил пробежаться по всем преподавателям
        StudyGroupService studService = new StudyGroupService(view1.getAll(), view.getAll());
        view1.viewGroupTeachers(studService.createTeacherGroup(nameGr));
        view.viewGroupStudents(studService.createStudentGroup(nameGr));

        //StudyGroup jk = new StudyGroup(view1.getById(4), view.getAll());
        //System.out.println(etr.getStudentsGroup());

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

