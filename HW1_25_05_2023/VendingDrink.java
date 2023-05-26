package HW1_25_05_2023;

import java.util.ArrayList;
import java.util.List;

public class VendingDrink {

    private final List<HotDrink> list;

    public VendingDrink() {
        list = new ArrayList<>();
    }

    void addHotDrink(HotDrink drink) {
        list.add(drink);
    }

    HotDrink getHotDrink(String kind) {
        for (HotDrink drink : list) {
            if (kind.equals(drink.getKind())) {
                return drink;
            }
        }
        return null;
    }

    HotDrink getHotDrink(Long id) {
        for (HotDrink drink : list) {
            if (id.equals(drink.getId())) {
                return drink;
            }
        }
        return null;
    }

    HotDrink getHotDrink(int temperature) {
        for (HotDrink drink : list) {
            if (temperature == drink.getTemperature()) {
                return drink;
            }
        }
        return null;
    }
}
