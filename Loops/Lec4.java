import java.util.*;
public class Lec4{
    public static void main(String args[]){
        int sum=0;
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
