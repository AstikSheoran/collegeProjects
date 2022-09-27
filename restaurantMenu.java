
import java.util.Scanner;
public class restaurantMenu{
    public double subTotal;
    public static double runningTotal;
    private static double itemPrice;
    static boolean ordering = true;
    static Scanner input = new Scanner(System.in);
    static double j=0.0;

    public static void menu() {
        System.out.println("Welcome To Coffee Fox \n1. Burger (Rs.59.00) \n2. Fries (Rs.89.00) \n3. Cold Coffee (Rs.99.00) \n4. White Sauce Pasta (Rs.159.00) \n5. mexican wrap (Rs.129.00) \n6. Done");
    }

    public static double itemPrice(int foodItem) {
        if (foodItem == 1) {
            // burger= ₹59
            System.out.println("You've ordered a burger");
            itemPrice = 59.00;
        }
        if (foodItem == 2) {
            // fries = ₹89
            System.out.println("You've ordered fries");
            itemPrice = 89.00;
        }
        if (foodItem == 3) {
            // cold coffee = ₹99
            System.out.println("You've ordered a cold coffee");
            itemPrice = 99.00;
        }
        if (foodItem == 4) {
            // white sauce pasta = ₹159
            System.out.println("You've ordered a white sauce pasta");
            itemPrice = 159.00;
        }
        if (foodItem == 5) {
            // mexican wrap = ₹129
            System.out.println("You've ordered a mexican wrap");
            itemPrice = 129.00;
        }
        quantity();
        return j;
    }

    public static double quantity() {
        System.out.println("Enter quantity");
        double quantity = input.nextDouble();
        subTotal(quantity, itemPrice);
        return quantity;
    }

    public static double subTotal(double quantity, double itemPrice) {
        double subTotal = quantity * itemPrice;
        System.out.println("Subtotal: Rs." + subTotal);
        j=subTotal;
        return subTotal;
    }

    public static void done(double runningTotal) {
        ordering = false;
        System.out.println("Enjoy your meal");
    }

    public static void main(String[] args) {
        int menuOption;
        int foodItem = 0;
        input = new Scanner(System.in);
        double runningTotal = 0;
        while(ordering){
            menu();
            menuOption = input.nextInt();
            switch (menuOption) {
            case 1:
                foodItem = 1;
                runningTotal += itemPrice(foodItem);
                break;
            case 2:
                foodItem = 2;
                runningTotal += itemPrice(foodItem);
                break;
            case 3:
                foodItem = 3;
                runningTotal += itemPrice(foodItem);
                break;
            case 4:
                foodItem = 4;
                runningTotal += itemPrice(foodItem);
                break;
            case 5:
                foodItem = 5;
                runningTotal += itemPrice(foodItem);
                break;
            case 6:
                done(runningTotal);
                break;
            default:
                System.out.println("Invalid option.");
            }
            }
            System.out.println("Total amount: Rs." + runningTotal);
}
}