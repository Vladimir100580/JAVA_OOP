package Lections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Lect1 {

    public static void main(String[] args) {
        // 1. Реализовать алгоритм обратной сортировки списков компаратором.
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 12; i++) list1.add(new Random().nextInt(20));
        System.out.println("1) Исходный список1: " + list1);
        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println("Сортированный список: " + list1 + "\n");
    }
}