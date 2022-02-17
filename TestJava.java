import java.util.ArrayList;

public class TestJava {
    public static void main(String[] args) {
        // creando una lista vacia de orders 
        ArrayList<Order> orderList = new ArrayList<Order>();
        // creando el menu
        Item dripCoffee = new Item("Drip Coffee",2.75);
        Item cafeLatte = new Item("Cafe Latte",3.75);
        Item mocca = new Item("mocca",3);
        Item cappuchino = new Item("capuchinno",4);
        Item caramelMachiato = new Item("caramel Machiatto",5);
        System.out.println("///////////////////////////////////");
        System.out.println("Barista Menu:");
        System.out.println(dripCoffee.getItem());
        System.out.println(cafeLatte.getItem());
        System.out.println(mocca.getItem());
        System.out.println(cappuchino.getItem());
        System.out.println(caramelMachiato.getItem());
        // Creating two guest
        // System.out.println("///////////////////////////////////");
        // System.out.println("Create two order of uspecified guest");
        Order order1 =  new Order();
        Order order2 =  new Order();
        // orderList.add(order1);
        // orderList.add(order2);
        // printOrderList(orderList);
        // creating three orders with names
        // System.out.println("///////////////////////////////////");
        // System.out.println("Create three orders with names");
        Order order3 = new Order("henry");
        Order order4 = new Order("pedro");
        Order order5 = new Order("marta");
        // orderList.add(order3);
        // orderList.add(order4);
        // orderList.add(order5);
        // printOrderList(orderList);
        // creating at least 2 items to each order 
        // System.out.println("///////////////////////////////////////////////////////");
        // System.out.println("Add at least 2 items to each order using addItem method");
        order1.addItem(dripCoffee);
        order1.addItem(cafeLatte);
        order1.addItem(mocca);
        
        order2.addItem(dripCoffee);
        order2.addItem(cappuchino);
        order2.addItem(caramelMachiato);
        
        order3.addItem(dripCoffee);
        order3.addItem(cafeLatte);
        order3.addItem(caramelMachiato);

        order4.addItem(dripCoffee);
        order4.addItem(mocca);
        order4.addItem(caramelMachiato);

        order5.addItem(cafeLatte);
        order5.addItem(cappuchino);
        order5.addItem(caramelMachiato);
        // change status message
        order1.setIsReady(true);
        order5.setIsReady(true);
        // Display
        System.out.println("//////////////Display orders///////////////////");
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
        // Display orderlist
        System.out.println("//////////////Display orders///////////////////");
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        // printOrderList(orderList);
    }
    public static void printOrderList(ArrayList<Order> orderList) {
        for (int i = 0; i < orderList.size(); i++) {
            System.out.printf("order #%d ",i+1);
            orderList.get(i).display();
        }
    }
}
