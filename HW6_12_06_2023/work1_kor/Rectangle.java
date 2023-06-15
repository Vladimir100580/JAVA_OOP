package HW6_12_06_2023.work1_kor;


// Принцип подстановки Лисков    Классический пример, описан в книге "Чистая архитектура" Мартин Р.
// Наследник не должен "ломать" поведение
// Наследник не должен делать меньше чем родитель

abstract class AbstractFigure {  // Высоту определяем только у прямоугольника, для квадрата достаточно ширины (width)
    int width;
    public String getType() {
        return "Геометрическая фигура";
    }
}

interface Heigth {                // Например - для площади, в каких-то фигурах может использоваться, а в каких-то нет
    int setSquare();
}

class Rectangle extends AbstractFigure implements Heigth {
    int heigth;
    public String getType() {
        return "Прямоугольник";
    }
    public void setWidth(int width) { this.width = width; }
    public void setHeigth(int heigth) { this.heigth = heigth; }
    @Override
    public int setSquare() { return width*heigth; }
}

class Square extends AbstractFigure {
    public String getType() {
        return "Квадрат";
    }
    public void setWidth(int width) { this.width = width; }
    public int setSquare() { return width*width; }

}