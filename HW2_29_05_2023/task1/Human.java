package HW2_29_05_2023.task1;

public class Human extends Actor {

    private int age;
    private String address;

    public Human(String name, int age, String address) {
        super(name);
        this.age = age;
        this.address = address;
    }


    public String orderStatus() {         // Три булевых поля, при использовании хоть какой-то смысловой связи, подразумевают небольшое дерево
        String txt="";
        if (inTheQueue) { txt += "В очереди, "; }
        else {txt += "Не в очереди, ";}
        if (isTakeOrder) { txt += "заказ был получен!"; }
        else { txt += "заказ не получен, ";
            if (isMakeOrder) { txt += "но был сделан. ";}
            else {txt += "и не был сделан.";}
        }
        return txt;
    }


    @Override
    public String toString() {
        return String.format("Клиент: %s возраст %s адрес: %s (%s)"
                , name, age, address, orderStatus());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setMakeOrder() {

    }

    @Override
    public void setTakeOrder() {

    }

    @Override
    public void setInTheQueue() {

    }
}
