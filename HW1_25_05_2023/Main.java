// 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
// 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
// перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени,
// объёму и температуре
// 3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику,
// заложенную в программе
// 4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре



package HW1_25_05_2023;

public class Main {
    public static void main(String[] args) {

        Vending vending = new FruitVending();

        Product product1 = new Apple("Apple", 20, 1L);
        Product product2 = new Orange("Orange", 30, 2L);
        Product product3 = new Banana("Banana", 25, 3L);

        vending.addProduct(product1);
        vending.addProduct(product2);
        vending.addProduct(product3);


        System.out.println(vending.getProduct("Apple"));
        System.out.println(vending.getProduct("Orange"));
        System.out.println(vending.getProduct("Banana"));

        System.out.println();
        System.out.println(vending.getProduct(1L));
        System.out.println(vending.getProduct(2L));
        System.out.println(vending.getProduct(5L));

        System.out.println("\nДалее домашняя работа\n");
        VendingDrink vendDrink = new VendingDrink();
        HotDrink drink1 = new TeaBlack("Black Tea", 8,10L, 80);
        HotDrink drink2 = new TeaGreen("Green Tea", 10,11L, 70);
        HotDrink drink3 = new Coffee("Coffee", 15,12L, 65);
        HotDrink drink4 = new MulledWine("Mulled Wine", 8,13L, 80);

        vendDrink.addHotDrink(drink1);
        vendDrink.addHotDrink(drink2);
        vendDrink.addHotDrink(drink3);
        vendDrink.addHotDrink(drink4);

        System.out.println(vendDrink.getHotDrink("Green Tea"));
        System.out.println(vendDrink.getHotDrink("Mulled Wine"));
        System.out.println(vendDrink.getHotDrink("Coffee"));

        System.out.println();
        System.out.println(vendDrink.getHotDrink(11L));
        System.out.println(vendDrink.getHotDrink(13L));
        System.out.println(vendDrink.getHotDrink(15L));

        System.out.println();
        System.out.println(vendDrink.getHotDrink(65));
        System.out.println(vendDrink.getHotDrink(40));
        System.out.println(vendDrink.getHotDrink(80));

        System.out.println();
        System.out.println(vendDrink.getHotDrink1("Green Tea",10, 70));
        System.out.println(vendDrink.getHotDrink1("Mulled Wine",10, 70));
        System.out.println(vendDrink.getHotDrink1("Mulled Wine"));
        System.out.println(vendDrink.getHotDrink1("Coffee", 15));
        System.out.println(vendDrink.getHotDrink1("Coffee", 16));
    }
}
