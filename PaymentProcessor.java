class PaymentProcessor {
    public boolean processPayment(double amount) {
        if (amount > 0) {
            System.out.println("Payment of $" + amount + " processed successfully.");
            return true;
        }
        System.out.println("Payment processing failed.");
        return false;
    }
}
