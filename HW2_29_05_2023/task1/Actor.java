package HW2_29_05_2023.task1;

public abstract class Actor implements ActorBehavior {

    protected String name;
    protected boolean isMakeOrder;  // заказ сделан/не сделан
    protected boolean isTakeOrder;  // заказ получен/не получен
    protected boolean inTheQueue;   // в очереди/вне очереди

    //   ОЧЕНЬ хотелось сделать одно int поле - статус клиента (и не мучиться с кучей булевых), но был бы потерян смысл самого задания
    //    protected int clientStatus;   // Здесь хранится статус клиента в магазине: 0 - клиент вне магазина, 1 - клиент пришел в магазин (вне очереди)
    //                                  // 2 - клинет в очереди, 3 - клинт сделал заказ, 4 - клиент получил заказ (еще в магазине), 5 - клиент покинул магазин

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }

    public boolean isInTheQueue() {
        return inTheQueue;
    }

    public void setInTheQueue(boolean inTheQueue) {
        this.inTheQueue = inTheQueue;
    }

    @Override
    public boolean InTheQueue() { return inTheQueue; }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
