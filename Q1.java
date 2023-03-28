
/* Q1. Write a java program to accept the details of product as productcode, productname and 
weight. If weight > 100 then throw an exception as InvalidProduct Exception and give 
the  proper  message.  Otherwise  display  the  product  details.  Define  required  exception 
class. */
import java.util.Scanner;

// Define InvalidProductException class
class InvalidProductException extends Exception {
    InvalidProductException(String message) {
        super(message);
    }
}

// Define Product class
class Product {
    int productCode;
    String productName;
    float weight;

    // Constructor to initialize product details
    Product(int code, String name, float weight) {
        this.productCode = code;
        this.productName = name;
        this.weight = weight;
    }

    // Method to display product details
    void display() {
        System.out.println("Product Code: " + productCode);
        System.out.println("Product Name: " + productName);
        System.out.println("Weight: " + weight + " grams");
    }
}

// Main class to accept product details and handle exceptions
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code;
        String name;
        float weight;

        // Accept product details
        System.out.print("Enter Product Code: ");
        code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        name = sc.nextLine();
        System.out.print("Enter Product Weight (in grams): ");
        weight = sc.nextFloat();

        // Create Product object
        Product p = new Product(code, name, weight);

        // Handle InvalidProductException
        try {
            if (p.weight > 100) {
                throw new InvalidProductException("Invalid Product: Weight cannot be greater than 100 grams");
            } else {
                p.display();
            }
        } catch (InvalidProductException e) {
            System.out.println(e.getMessage());
        }
    }
}
