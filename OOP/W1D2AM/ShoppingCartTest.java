public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        ShoppingCart walmart = new ShoppingCart("Walmart");

        ShoppingCart offBrand = new ShoppingCart();

        ShoppingCart nordstrom = new ShoppingCart("Nordys", 10000.0);

        ShoppingCart nords = new ShoppingCart("Nordys", 10000.0, ["purse"]);

        // cart.store = "HMart";

        cart.setStore("HMart");
        System.out.println(cart.getStore());


    }
}
