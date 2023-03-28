
/* Q.3.  
Write  an  application  that  will  accept  details  of  items  such  as  items  such  as  itemcode, 
description, quantity and rate.   
Accept details of 4 different items in an array of objects. 
Fire user defined exception if quantity or price is less than or equal to zero. 
Display the accepted 4 different items details on console. */
import java.util.Scanner;

class Item {
    String itemCode, description;
    int quantity;
    double rate;

    public Item(String itemCode, String description, int quantity, double rate) throws Exception {
        if (quantity <= 0) {
            throw new Exception("Quantity cannot be less than or equal to zero");
        }
        if (rate <= 0) {
            throw new Exception("Rate cannot be less than or equal to zero");
        }
        this.itemCode = itemCode;
        this.description = description;
        this.quantity = quantity;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Item [itemCode=" + itemCode + ", description=" + description + ", quantity=" + quantity + ", rate="
                + rate + "]";
    }
}

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[4];
        for (int i = 0; i < items.length; i++) {
            try {
                System.out.println("Enter details of item " + (i + 1));
                System.out.print("Item code: ");
                String itemCode = sc.next();
                System.out.print("Description: ");
                String description = sc.next();
                System.out.print("Quantity: ");
                int quantity = sc.nextInt();
                System.out.print("Rate: ");
                double rate = sc.nextDouble();
                items[i] = new Item(itemCode, description, quantity, rate);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                i--; // decrement i to repeat the same item again
            }
        }
        System.out.println("Details of accepted items:");
        for (Item item : items) {
            System.out.println(item);
        }
    }
}