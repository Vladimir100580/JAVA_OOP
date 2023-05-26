package HW1_25_05_2023;

public class MulledWine extends HotDrink {

    public MulledWine(String kind, double price, Long id, int temperature) {
        super(kind, price, id, temperature);
    }

    @Override
    public String toString() {
        return String.format("У глинтвейна: %s, ID = %s, price = %s, t⁰C = %s ", getKind(), getId(), getPrice(), getTemperature());
    }
}

// !!!!! Очевидно, что с таким подходом принцип DRY не особо соблюдается, но поскольку на семинаре рассматривали таким образом, то оставляю так.