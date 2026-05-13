import java.util.*;
public class PrimeCheck{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        if(n==2){
            System.out.println("PRIME");
        }
        else{
            boolean isPrime=true;
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    isPrime=false;
                }
            if(isPrime==true){
                System.out.println("PRIME");
            }
            else{
                System.out.println("NOT PRIME");
            }
            }
        }
    }
}
