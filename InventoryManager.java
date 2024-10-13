import java.util.HashMap;
import java.util.Map;

class InventoryManager {
    private Map<String, Integer> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
        inventory.put("Laptop", 10);
        inventory.put("Smartphone", 20);
        inventory.put("Tablet", 15);
    }

    public boolean checkStock(String productName) {
        return inventory.getOrDefault(productName, 0) > 0;
    }

    public void updateStock(String productName) {
        if (checkStock(productName)) {
            inventory.put(productName, inventory.get(productName) - 1);
        }
    }
}
