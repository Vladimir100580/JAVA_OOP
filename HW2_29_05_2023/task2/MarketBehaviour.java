package HW2_29_05_2023.task2;

import HW2_29_05_2023.task1.Human;


public interface MarketBehaviour {

    void acceptToMarket(Human actor);  // добавляем в человека в магазин
    void releaseFromMarket(Human actor);   // Удаляем из магазина человека (ПРОСТИТЕ ЗА СВОЕВОЛИЕ ... мы должны как-то понять, какого человека удаляем)
    void update();

}
