public class OrderApp {
    public static void main(String[] args) {

        NormalOrder normalOrder =
                new NormalOrder(101, "Abishek", 40000);

        PremiumOrder premiumOrder =
                new PremiumOrder(102, "Patel", 8000);

        System.out.println("=== NORMAL ORDER INVOICE ===");
        System.out.println(normalOrder);
        System.out.println("Final Amount: " +
                normalOrder.calculateFinalAmount());

        System.out.println("\n=== PREMIUM ORDER INVOICE ===");
        System.out.println(premiumOrder);
        System.out.println("Final Amount: " +
                premiumOrder.calculateFinalAmount());

        System.out.println("\n=== PREMIUM ORDER WITH EXTRA DISCOUNT ===");
        System.out.println("Final Amount: " +
                premiumOrder.calculateFinalAmount(500));
    }
}
