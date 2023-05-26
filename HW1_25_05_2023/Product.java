package HW1_25_05_2023;


public abstract class Product {

    protected String kind;
    protected double price;
    protected Long id;

    public Product(String kind, double price, Long id) {
        this.kind = kind;
        this.price = price;
        this.id = id;

    }



    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
