import java.util.*;
public class ProductOfTwo{
    public static int prod(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a=sc.nextInt();
        System.out.print("Enter the number b: ");
        int b=sc.nextInt();
        int product=a*b;
        return product;
    }
    public static void main(String args[]){
        System.out.print("The product of the numbers is:"+prod());   
    }
}
