import java.util.ArrayList;

public class ShoppingCart {
    // attributes
    private String store;
    public String brand;
    public double total;
    public ArrayList<String> items = new ArrayList<String>();

    public ShoppingCart() {

    }

    public ShoppingCart(String store) {
        this.store = store;
    }

    // public ShoppingCart(String store, String brand) {
    //     this.brand = brand;
    // }

    public ShoppingCart(String store, double total) {
        this.store = store;
        this.total = total;
    }

    // methods
    public void addItem(String item, double price){
        this.items.add(item);
        this.total += price;
    }

    // getters & setters
    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

}
