public class BitManipulation{
    public static void oddOrEven(int n){
        int bitMask=1;
        if(n==0){
            System.out.println("The given number is Zero");  
        }

        else if((n & bitMask)==0){
            System.out.println("Even Number");
        }
        else{ // if n&1 is 1 then:
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args){
        oddOrEven(0);//The given number is a zero
        oddOrEven(1);//odd number
        oddOrEven(-2);//even number
        oddOrEven(3);//odd number
        oddOrEven(4);//even number
        oddOrEven(5);//odd number
    }
}
