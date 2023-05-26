package HW1_25_05_2023;

public class Coffee extends HotDrink {

    public Coffee(String kind, double price, Long id, int temperature) {
        super(kind, price, id, temperature);
    }

    @Override
    public String toString() {
        return String.format("У кофе: %s, ID = %s, price = %s, t⁰C = %s ", getKind(), getId(), getPrice(), getTemperature());
    }
}

// !!!!! Очевидно, что с таким подходом принцип DRY не особо соблюдается, но поскольку на семинаре рассматривали таким образом, то оставляю так.