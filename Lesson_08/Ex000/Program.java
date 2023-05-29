package Lesson_08.Ex000;

public class Program {

    static void A(){
        System.out.println("A()!!");
    }

    void B(){
        System.out.println("B()!!");
    }
    public static void main(String[] args) {
        Foo f1 = new Foo();
        f1.value = 123;
        f1.PrintCount();

        A();
        Program prog = new Program();       //static
        prog.B();                           //заменяет эти две строки

        System.out.println(Foo.getCount());
        Foo.setCount(15);

        Foo f2 = new Foo();
        f2.value = 444;
        f2.PrintCount();

        Foo f3 = new Foo();
        f3.value = 555;
        f3.PrintCount();
    }

}
