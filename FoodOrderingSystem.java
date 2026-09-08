import java.util.Scanner;

public class FoodOrderingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, quantity;
        double total = 0;

        System.out.println("===== FOOD ORDERING SYSTEM =====");

        System.out.println("\nFood Menu:");
        System.out.println("1. Pizza       - Rs.250");
        System.out.println("2. Burger      - Rs.120");
        System.out.println("3. Biryani     - Rs.200");
        System.out.println("4. Fried Rice  - Rs.150");
        System.out.println("5. Ice Cream   - Rs.80");

        System.out.print("\nEnter your choice: ");
        choice = sc.nextInt();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        switch (choice) {

            case 1:
                total = 250 * quantity;
                System.out.println("You ordered Pizza");
                break;

            case 2:
                total = 120 * quantity;
                System.out.println("You ordered Burger");
                break;

            case 3:
                total = 200 * quantity;
                System.out.println("You ordered Biryani");
                break;

            case 4:
                total = 150 * quantity;
                System.out.println("You ordered Fried Rice");
                break;

            case 5:
                total = 80 * quantity;
                System.out.println("You ordered Ice Cream");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        if (choice >= 1 && choice <= 5) {
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Bill: Rs." + total);
            System.out.println("Order placed successfully!");
        }

        sc.close();
    }
}