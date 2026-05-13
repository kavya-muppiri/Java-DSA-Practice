public class GetAllPairs{
    public static void pair(int numbers[]){
        for(int i=0;i<=numbers.length-1;i++){
            int next=0;
            while(next<=numbers.length-1){
                System.out.print("("+numbers[i]+","+numbers[next]+")");
                next++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        pair(numbers);
    }
}
