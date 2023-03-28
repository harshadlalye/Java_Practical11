
/* Q.7.  
Write  a  java  program  to  create  own  exception  for  Negative  Value  Exception  if  the  user  enter 
negative value. */
import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        try {
            if (num < 0) {
                throw new NegativeValueException();
            }
            System.out.println(num + " is a positive integer");
        } catch (NegativeValueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class NegativeValueException extends Exception {
    public NegativeValueException() {
        super("Negative value entered");
    }
}
