package HW1_25_05_2023;

public class Orange extends Product {
    public Orange(String kind, double price, Long id) {
        super(kind, price, id);
    }

    @Override
    public String toString() {
        return String.format("У апельсина: %s, %s, %s", getKind(), getPrice(), getId());
    }

}