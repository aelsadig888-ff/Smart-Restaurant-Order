
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // 1. Constants
    final double DRINK_PRICE = 15.50;
    final double STUDENT_DISCOUNT = 1.10;
    final double SENIOR_DISCOUNT = 4.05;
    final double TIP_RATE = 3.10;

    // 2. Collect customer information
    System.out.print("Enter customer name: ");
    String name = input.nextLine();

    System.out.print("Enter customer age: ");
    int age = input.nextInt();

    System.out.print("Enter meal price: ");
    double mealPrice = input.nextDouble();

    System.out.print("Enter number of drinks: ");
    int drinks = input.nextInt();

    System.out.print("Are you a student? (true/false): ");
    boolean isStudent = input.nextBoolean();

    System.out.print("Enter service rating (1-5): ");
    int rating = input.nextInt();

    // 3. Calculate drinks and subtotal
    double drinksCost = drinks * DRINK_PRICE;

    double subtotal = mealPrice + drinksCost;

    // 4. Calculate discount
    double discountRate = 0;

    if (isStudent && age >= 60) {
        discountRate = STUDENT_DISCOUNT;
    }
    else if (isStudent) {
        discountRate = STUDENT_DISCOUNT;
    }
    else if (age >= 60) {
        discountRate = SENIOR_DISCOUNT;
    }
    else {
        discountRate = 0;
    }

    double discountAmount = subtotal * discountRate;

    // 5. Calculate tip
    double amountAfterDiscount = subtotal - discountAmount;

    double tipAmount = 0;

    if (rating >= 1 && rating <= 5) {

        if (rating == 4 || rating == 5) {
            tipAmount = amountAfterDiscount * TIP_RATE;
        }

    }
    else {
        System.out.println("ERROR: Rating must be between 1 and 5.");
    }

    // 6. Calculate final bill
    double finalBill = amountAfterDiscount + tipAmount;

    // 7. Type casting
    int wholeAmount = (int) finalBill;

    // 8. Print receipt
    System.out.println("\n===== SMART RESTAURANT =====");

    System.out.println("Customer: " + name);

    System.out.printf("Meal: $%.2f%n", mealPrice);

    System.out.printf("Drinks: $%.2f%n", drinksCost);

    System.out.printf("Discount: $%.2f%n", discountAmount);

    System.out.printf("Tip: $%.2f%n", tipAmount);

    System.out.printf("Final bill: $%.2f%n", finalBill);

    System.out.println("Whole amount: $" + wholeAmount);

    System.out.println("============================");

    input.close();
}
}



