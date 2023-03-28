
/* Q.4. 
Write a java program which stores the username and password in two variables. 
If username and password are not same, then raise exception “Invalid Password ” 
With appropriate message.  */
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.next();
        System.out.print("Enter password: ");
        String password = sc.next();
        try {
            if (!username.equals(password)) {
                throw new Exception("Invalid Password");
            }
            System.out.println("Login successful!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
