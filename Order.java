import java.util.ArrayList;

public class Order {
    // ////////// VARIABLES ////////////
    private String name;
    private boolean isReady;
    private ArrayList<Item> items;
    
    // //////////////   Methods /////////////////
    // *************  Constructors  ***************
    // -------------  Constructor ------------------
    public Order(){
        this.name = "guest";
        this.isReady = false;
        this.items = new ArrayList<Item>();
    }
    // -------------  Constructor ------------------
    public Order(String name){
        this.name = name;
        this.isReady = false;
        this.items = new ArrayList<Item>();
    }
    // ************* Get Methods *******************
    public String getName() {
        return this.name;
    }
    public boolean getIsReady() {
        return this.isReady;
    }
    public ArrayList<Item> getItems() {
        return this.items;
    }
    // ************* Set Methods *******************
    public void setName(String name){
        this.name = name;
    }
    public void setIsReady(boolean isReady){
        this.isReady = isReady;
    }
    // ************* Add Item *********************
    public void addItem(Item item){
        this.items.add(item);
    }
    // ************* Get status message *********************
    // @return: string status message
    public String getStatusMessage() {
        if (this.isReady) {
            return "Your order is ready";
        }else{
            return "Thank for waiting. Your order will be ready at soon.";
        }
    }
    // ************* Display *****************************
    // Prints to console the order infomation
    public void display() {
        System.out.println("Customer name: " + this.name);
        double total = 0;
        for (Item item : this.items) {
            System.out.printf("%s - $%.2f\n",item.getName(),item.getPrice());
            total += item.getPrice();
        }
        System.out.printf("Total: $%.2f\n",total);
        System.out.println(this.getStatusMessage());
    }
}
