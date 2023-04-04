package L3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class CandyMachine {
    private static final double[] coinValues = {0.05, 0.10, 0.25, 1.00};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the products
        Product candies = new Product("Candies", 1.25, 10);
        Product chips = new Product("Chips", 1.50, 15);
        Product gum = new Product("Gum", 0.75, 20);
        Product cookies = new Product("Cookies", 2.00, 5);

        // Store the products in a bag
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(candies);
        products.add(chips);
        products.add(gum);
        products.add(cookies);

        System.out.println("Welcome to the Candy Machine!");
        System.out.println("Products available:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i+1 + ". " + products.get(i).getName() + " - $" + products.get(i).getPrice());
        }

        System.out.print("\nPlease make a selection (1-4): ");
        int selection = scanner.nextInt() - 1;
        if (selection < 0 || selection >= products.size()) {
            System.out.println("Invalid selection.");
            System.exit(0);
        }

        Product selectedProduct = products.get(selection);
        System.out.println("You have selected: " + selectedProduct.getName());
        System.out.println("Price: $" + selectedProduct.getPrice());

        double total = selectedProduct.getPrice();
        double inserted = 0;
        while (inserted < total) {
            System.out.print("Please insert coins (5 cents, 10 cents, 25 cents, 1 dollar): ");
            double coin = scanner.nextDouble();
            if (isValidCoin(coin)) {
                inserted += coin;
            } else {
                System.out.println("Invalid coin.");
            }
        }

        double change = inserted - total;
        System.out.println("Change: $" + change);

        selectedProduct.sellOne();
        System.out.println("Here's your " + selectedProduct.getName() + "!");

        scanner.close();
    }

    private static boolean isValidCoin(double coin) {
        for (double value : coinValues) {
            if (value == coin) {
                return true;
            }
        }
        return false;
    }
}

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void sellOne() {
        quantity--;
    }
}