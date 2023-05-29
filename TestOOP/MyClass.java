package TestOOP;

import javax.swing.*;

public class MyClass {
    int num;       //  поля
    char symb;
    String text;

    // Метод класса:
    String showText(){
        // Локальная текстовая переменная:
        String str="Значения полей объекта:\n";
        // Формирование результата (значения локальной переменной):
        str+="num="+num+"\n";
        str+="symb="+symb+"\n";
        str+="text="+text;
        // Метод возвращает значение:
        return str;
        }

    void showText1(){
        // Локальная текстовая переменная:
        String str="Значения полей объекта:\n";
        // Формирование результата (значения локальной переменной):
        str+="num="+num+"\n";
        str+="symb="+symb+"\n";
        str+="text="+text;
        // Метод отображает окно сообщения:
        JOptionPane.showMessageDialog(null,str);
    }

    // Метод класса для присваивания значений полям:
    void set(int n,char s,String str){
        // Заполнение полей:
        num=n;
        symb=s;
        text=str;}
}


