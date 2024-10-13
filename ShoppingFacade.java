class ShoppingFacade {
    private ProductCatalog productCatalog;
    private PaymentProcessor paymentProcessor;
    private InventoryManager inventoryManager;
    private ShippingService shippingService;

    public ShoppingFacade() {
        productCatalog = new ProductCatalog();
        paymentProcessor = new PaymentProcessor();
        inventoryManager = new InventoryManager();
        shippingService = new ShippingService();
    }

    public void placeOrder(String productName) {
        if (!productCatalog.isProductAvailable(productName)) {
            System.out.println("Product not available.");
            return;
        }

        double price = productCatalog.getProductPrice(productName);
        if (!inventoryManager.checkStock(productName)) {
            System.out.println("Insufficient stock for " + productName);
            return;
        }

        double shippingCost = shippingService.calculateShipping(productName);
        double totalAmount = price + shippingCost;

        if (paymentProcessor.processPayment(totalAmount)) {
            inventoryManager.updateStock(productName);
            shippingService.shipOrder(productName);
            System.out.println("Order placed successfully for " + productName);
        } else {
            System.out.println("Payment failed. Order not placed.");
        }
    }
}
