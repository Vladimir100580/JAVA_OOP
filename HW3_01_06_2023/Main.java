package HW3_01_06_2023;

// - Модифицировать класс УчебнаяГруппаСервис, добавив в него метод сортировки списка студентов по имени
// - Модифицировать класс Контроллер, добавив в него метод сортировки списка студентов по имени и вызывать в нем созданный метод из УчебнаяГруппаСервис
// - Создать класс СтудентКомпаратор реализующий интерфейс Comparator
// - Реализовать контракт compare () со сравнением по фамилии
// - Модифицировать класс УчебнаяГруппаСервис, добавив в него метод сортировки списка студентов по фамилии
// - Модифицировать класс Контроллер, добавив в него метод сортировки списка студентов по фамилии и вызывать в нем созданный метод из УчебнаяГруппаСервис

public class Main {
    public static void main(String[] args) {
        StudentGroup group = new StudentGroup();
        StudentRepository repository = new StudentRepository(group);
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);

        System.out.println("Список без сортировки:");
        controller.addStudent(new Student(4L, "Петр    Иванов"));   // компаратор учитывает любое количество пробелов
        controller.addStudent(new Student(6L, "Светлана Матвийчук"));
        controller.addStudent(new Student(2L, "Никита Сидоров"));
        controller.addStudent(new Student(1L, "Дамир Мухтаров"));
        controller.addStudent(new Student(8L, "Анжела Попова"));
        controller.addStudent(new Student(3L, "Станислав Азаров"));
        controller.printAll();

        controller.deleteStudent("Никита Сидоров");
        System.out.println("Удалили Никиту Сидорова");
        controller.printAll();

        System.out.println("Сортировка по имени:");
        controller.sortFirstName();
        controller.printAll();

        System.out.println("Сортировка по фамилии:");
        controller.sortLastName();
        controller.printAll();

    }
}
