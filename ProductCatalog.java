import java.util.HashMap;
import java.util.Map;

class ProductCatalog {
    private Map<String, Double> products;

    public ProductCatalog() {
        products = new HashMap<>();
        products.put("Laptop", 800.00);
        products.put("Smartphone", 500.00);
        products.put("Tablet", 300.00);
    }

    public double getProductPrice(String productName) {
        return products.getOrDefault(productName, -1.0);
    }

    public boolean isProductAvailable(String productName) {
        return products.containsKey(productName);
    }
}
