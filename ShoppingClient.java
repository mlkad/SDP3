public class ShoppingClient {
    public static void main(String[] args) {
        ShoppingFacade shoppingFacade = new ShoppingFacade();
        String productName = "Laptop";
        System.out.println("Searching for product: " + productName);
        shoppingFacade.placeOrder(productName);

        System.out.println("\nTrying to order an unavailable product:");
        shoppingFacade.placeOrder("Desktop Computer");
    }
}
