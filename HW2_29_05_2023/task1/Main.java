//package HW2_29_05_2023.task1;
//
//import HW2_29_05_2023.task2.Market;
//
//import javax.swing.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//    Market mark = new Market();
//    Human human1 = new Human("John", 33, "Russia");
//    Human human2 = new Human("Колян", 21, "Franc");
//    Human human3 = new Human("Ксения", 27, "Poland");
//
//        JOptionPane.showMessageDialog(null,"Ку-ку");
//        Object[] options = { "OK", "CANCEL" };
//        int size = JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
//                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
//                null, options, options[0]);
//        System.out.println(size);
//
//        Object[] possibleValues = { "First", "Second", "Third" };
//        Object selectedValue = JOptionPane.showInputDialog(null,
//                "Choose one\nqwqe", "Input",
//                JOptionPane.INFORMATION_MESSAGE, null,
//                possibleValues, possibleValues[0]);
//        System.out.println(selectedValue);
//
//    mark.acceptToMarket(human1);
//    mark.acceptToMarket(human2);
//    mark.acceptToMarket(human3);
//    //System.out.println(Market.getHuman("Колян"));
//   // System.out.println(Market.getAllHuman());
//
//    System.out.println("\n\n");
//
//    System.out.println(human1);
//    System.out.println(human1);
//    human1.setMakeOrder();
//    System.out.println(human1);
//    human1.setTakeOrder();
//    System.out.println(human1);
//
//    }
//}
