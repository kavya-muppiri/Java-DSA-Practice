import java.util.*;
public class Factorial{
    public static int fact(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        return result;
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number:");
      int n=sc.nextInt();
      if(n<2){
        System.out.print("The factorial of number is:0");
      }
      else{
        System.out.print("The factorial of the number is:"+fact(n));
      }
    }
}
