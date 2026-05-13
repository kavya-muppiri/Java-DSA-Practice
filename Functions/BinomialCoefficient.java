import java.util.*;
public class BinomialCoefficient{
    public static int fact(int f){
        int result=1;
        for(int i=1;i<=f;i++){
            result=result*i;
        }
        return result;
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the value of n: ");
      int n=sc.nextInt();
      System.out.print("Enter the value of r: ");
      int r=sc.nextInt();
      int a=n-r;
      int factN=fact(n);
      int factR=fact(r);
      int factA=fact(a);
      int bFactor=factN/(factR*factA);
      System.out.print("The Binomial Factor: "+bFactor);
    }
}
