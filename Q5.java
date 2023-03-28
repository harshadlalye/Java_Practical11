/* Q.5. 
Write an application which will accept a number from command line. If number is not 
divisible by 7, then throw “notDivisibleBy7” user defined Exception. */
public class Q5 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a number as command line argument");
            return;
        }
        int number = Integer.parseInt(args[0]);
        try {
            if (number % 7 != 0) {
                throw new Exception("notDivisibleBy7");
            }
            System.out.println(number + " is divisible by 7");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
