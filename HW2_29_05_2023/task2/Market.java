package HW2_29_05_2023.task2;

import HW2_29_05_2023.task1.Actor;
import HW2_29_05_2023.task1.Human;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    public static List<Human> list;

    public Market() {
        list = new ArrayList<>();
    }

    public void acceptToMarket(Human actor) {
        System.out.println("Клиент " + actor.getName() + " добавлен в магазин");
        list.add(actor);
    }


    public void releaseFromMarket(Human actor) {    // удаление клиента из магазина
        System.out.println("Клиент " + actor.getName() + " удален из магазина");
        list.removeIf(actor::equals);
    }

    @Override
    public void update() {                  // Обновляем магазин (т.е. выводим его текущее состояние)
        StringBuilder tx= new StringBuilder();
        for (Human hum : list) {
            tx.append(hum+"\n");
        }
        System.out.println("\nОбновленный список магазина:");
        System.out.println(tx);
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println("Клиент " + actor.getName() + " встал в очередь.");
        actor.setInTheQueue(true);
    }

    @Override
    public void giveOrders(Actor actor) {
        System.out.println("Клиент " + actor.getName() + " сделал заказ.");
        actor.setMakeOrder(true);
    }

    @Override
    public void takeOrders(Actor actor) {
        System.out.println("Клиент " + actor.getName() + " забрал заказ.");
        actor.setTakeOrder(true);
    }

    @Override
    public void releaseFromQueue(Actor actor) {
        System.out.println("Клиент " + actor.getName() + " вышел из очереди.");
        actor.setInTheQueue(false);
    }
}
