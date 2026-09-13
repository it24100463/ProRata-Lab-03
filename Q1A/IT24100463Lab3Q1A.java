import java.util.Scanner;

public class IT24100463Lab3Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double price = sc.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double kg = sc.nextDouble();

        double totalAmount = price * kg;

        System.out.println();
        System.out.println("The total amount is: " + totalAmount);

        sc.close();
    }
}