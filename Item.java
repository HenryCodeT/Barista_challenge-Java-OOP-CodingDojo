/**
 * Item
 */
public class Item {
    // Constructor
    private String name;
    private double price;

    public Item(String name, double price){
        this.name=name;
        this.price=price;
    }
    // Getters and Setters
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Double getPrice(){
        return this.price;
    }
    public void setPrice( Double price ){
        this.price = price;
    }
    public String getItem() {
        return String.format("Item: %s | price: $%.2f", this.name, this.price);
    }

}