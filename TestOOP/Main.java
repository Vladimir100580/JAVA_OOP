package TestOOP;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        MyClass obj=new MyClass();
        // Заполнение полей объекта:
        obj.num=12;
        obj.symb='A';
        obj.text="Текстовое поле";
        // Текст для отображения в окне сообщения:
        String str="Значения полей объекта:\n";
        str+="num="+obj.num+"\n";
        str+="symb="+obj.symb+"\n";
        str+="text="+obj.text;
        // Отображение окна:
        JOptionPane.showMessageDialog(null,str);

        MyClass obj1=new MyClass();
        // Заполнение полей объекта:
        obj1.num=13;
        obj1.symb='B';
        obj1.text="Текстовое поле";
        // Отображение окна:
        JOptionPane.showMessageDialog(null,obj1.showText());


        MyClass obj2=new MyClass();
        obj2.set(200,'b',"Еще раз, привет!");
        // Отображение окон:
        obj2.showText1();
    }
}
