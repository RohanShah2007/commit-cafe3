public class CommitCafe {

    private static String barista = "Rohan";
    private static String title = "Lead Barista";

    private static int cups = 0;

    public static void brew(String drink) {
        
        cups++;
        System.out.println(barista + " brewed " + drink);
        System.out.println("Drink is ready. Enjoy!"); 
        
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}