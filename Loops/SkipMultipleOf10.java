import java.util.*;
public class SkipMultipleOf10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i;
        do { 
            System.out.print("Enter the number:");
            i=sc.nextInt();
            if(i%10==0){
                System.out.println("The loop SKIPS!!");
                continue;
            }       
        } while (true);
    }
}
