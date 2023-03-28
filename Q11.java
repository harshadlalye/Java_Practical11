
/* Q.11. 
Write a Java Program which stores the username and password in two variables. If username and 
password are not same, then raise “Invalid Password” with appropriate message. */
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        try {
            validatePassword(username, password);
            System.out.println("Valid username and password.");
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid password: " + e.getMessage());
        }
    }

    public static void validatePassword(String username, String password) throws InvalidPasswordException {
        if (!username.equals(password)) {
            throw new InvalidPasswordException("The username and password do not match.");
        }
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
