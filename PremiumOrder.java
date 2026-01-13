public class PremiumOrder extends Order {

    public PremiumOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    
    @Override
    public double calculateFinalAmount() {
        double discount = amount * 0.10; 
        return super.calculateFinalAmount() - discount;
    }
}
