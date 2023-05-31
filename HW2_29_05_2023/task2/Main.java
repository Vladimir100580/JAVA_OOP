package HW2_29_05_2023.task2;

import HW2_29_05_2023.task1.Human;


public class Main {
    public static void main(String[] args) {

        Market mark = new Market();
        Human human1 = new Human("John", 33, "Russia");
        Human human2 = new Human("Колян", 21, "Franc");
        Human human3 = new Human("Ксения", 27, "Poland");

        mark.acceptToMarket(human1);        // добавили в магазин 3 клиентов
        mark.acceptToMarket(human2);
        mark.acceptToMarket(human3);

        mark.update();                     // Обновляем магазин (т.е. выводим его текущее состояние)

        mark.releaseFromMarket(human2);      //второй клиет вышел из магазина
        mark.update();

        mark.takeInQueue(human3);           // Третий встал в очередь
        mark.update();

        mark.giveOrders(human3);           // Третий сделал заказ
        mark.acceptToMarket(human2);      // Второй вернулся в магазин
        mark.takeInQueue(human1);         // Первый встал в очередь
        mark.update();

        mark.giveOrders(human1);           // Первый сделал заказ
        mark.takeOrders(human3);          //Третий получил заказ
        mark.releaseFromQueue(human3);    // и вышел из очереди    (Конечно, действия: взятие заказа и выход из очереди, можно было совместить)
        mark.update();


        mark.takeOrders(human1);            // Первый получил заказ
        mark.releaseFromQueue(human1);      // и вышел из очереди
        mark.releaseFromMarket(human3);    // третий покидает магазин
        mark.update();
    }
}
