import java.util.*;
public class LecInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float book = sc.nextFloat();
        float bill=(pen+pencil+book);
        System.out.println("Your total bill is: "+bill);
        float newBill=bill+(bill*0.18f);
        System.out.println("Your total bill with added tax is: "+newBill);
        System.out.println("Do you need a bag:");
        String bag=sc.next();
        float totalbill=(bag.equalsIgnoreCase("yes"))?(newBill+5f):newBill;
        System.out.println("Total Amount to be paid:"+totalbill);
    }
}
