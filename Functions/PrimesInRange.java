import java.util.*;
public class PrimesInRange{
    public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int range=sc.nextInt();
        for(int i=2;i<=range;i++){
            if(isPrime(i)){
                System.out.print(i+",");
            }
        }
    }
}
