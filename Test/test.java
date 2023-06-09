package Test;

public class test {

    public static void main(String[] args) {
        int position = 5;
        System.out.println(--position); //4

        System.out.println(position);   //4   "--position" уменьшает значение на 1

        position = 5;

        System.out.println(position-1); //4

        System.out.println(position);   //5   "position-1" не меняет значение position

    }
}