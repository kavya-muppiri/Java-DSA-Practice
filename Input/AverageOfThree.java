import java.util.*;
public class AverageOfThree {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A:");
        int a=sc.nextInt();
        System.out.print("Enter B:");
        int b=sc.nextInt();
        System.out.print("Enter C:");
        int c=sc.nextInt();
        int avg=(a+b+c)/3;
        System.out.println(avg); 
    }
}
