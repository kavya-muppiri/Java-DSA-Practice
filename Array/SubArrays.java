public class SubArrays{
    public static int subArrays(int numbers[]){
        int maxSubArray=Integer.MIN_VALUE;
        for(int i=0;i<=numbers.length-1;i++){
            for(int j=i;j<=numbers.length-1;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" "); 
                    sum+=numbers[k];
                }
                if(sum>maxSubArray){
                    maxSubArray=sum;
                }
                System.out.print("SUM-->"+sum);
                System.out.println();
            }
        System.out.println();
        }
        return maxSubArray;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        subArrays(numbers);
        int result=subArrays(numbers);
        System.out.println("The max subarray value is: "+result);
    }
}
