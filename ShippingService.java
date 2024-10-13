class ShippingService {
    public double calculateShipping(String productName) {
        switch (productName) {
            case "Laptop":
                return 20.00;
            case "Smartphone":
                return 10.00;
            case "Tablet":
                return 5.00;
            default:
                return 0.00;
        }
    }

    public void shipOrder(String productName) {
        System.out.println("Shipping order for: " + productName);
    }
}
