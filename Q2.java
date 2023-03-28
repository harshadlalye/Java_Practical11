
/* Q.2. 
Write a Java program to accept email address of a user and throw a user defined exception 
InvalidEmailException if it starts with digit or does not contain @ symbol. */
import java.util.Scanner;

// Define InvalidEmailException class
class InvalidEmailException extends Exception {
    InvalidEmailException(String message) {
        super(message);
    }
}

// Main class to accept email address and handle exceptions
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email;

        // Accept email address
        System.out.print("Enter Email Address: ");
        email = sc.nextLine();

        // Handle InvalidEmailException
        try {
            if (email.matches("^[0-9].*")) {
                throw new InvalidEmailException("Invalid Email: Email address cannot start with a digit");
            } else if (!email.contains("@")) {
                throw new InvalidEmailException("Invalid Email: Email address must contain @ symbol");
            } else {
                System.out.println("Valid Email Address: " + email);
            }
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}
