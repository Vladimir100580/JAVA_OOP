package HW1_25_05_2023;

public class HotDrink extends Product {

    protected int temperature;
    public HotDrink(String kind, double price, Long id, int temperature) {
        super(kind, price, id);
        this.temperature = temperature;
    }

    public int getTemperature() { return temperature; }
}
