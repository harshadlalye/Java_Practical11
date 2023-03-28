/* Q.6. 
Accept a string from command line, if the string is in uppercase then throw user defined 
exception. */
public class Q6 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a string as command line argument");
            return;
        }
        String str = args[0];
        try {
            if (str.equals(str.toUpperCase())) {
                throw new UpperCaseException();
            }
            System.out.println(str + " is not in uppercase");
        } catch (UpperCaseException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class UpperCaseException extends Exception {
    public UpperCaseException() {
        super("Input string is in uppercase");
    }
}
