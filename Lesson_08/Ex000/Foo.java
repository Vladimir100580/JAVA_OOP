package Lesson_08.Ex000;

public class Foo {
    public Integer value;

    //public static Integer count;
    private static Integer count;

    public static Integer getCount(){
        return count;
    }
    public static void setCount(Integer abc){
        count=abc;
    }



    static {
        count = 0;
    }

    public Foo() {
        count++;
    }
    public void PrintCount(){
        System.out.println(String.format("count=%s, value=%s", count, value));
    }

    @Override
    public String toString(){
        return value.toString();
    }
}
