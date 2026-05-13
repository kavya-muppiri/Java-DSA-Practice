public class PrefixSum{
    public static void prefixSum(int numbers[]){
        int prefix[]=new int[numbers.length];
        int currSum=0;
        int maxSubArray=Integer.MIN_VALUE;
        prefix[0]=numbers[0];
        for(int p=1;p<=prefix.length-1;p++){
            prefix[p]=prefix[p-1]+numbers[p];
        }
        for(int i=0;i<=numbers.length-1;i++){
            int start=i;
            System.out.println(prefix[i]+",");
            for(int j=i;j<=numbers.length-1;j++){
                int end=j;
                currSum= start==0 ? prefix[end]:prefix[end]-prefix[start-1];
                if(currSum>maxSubArray){
                    maxSubArray=currSum;
                }
            }
        }
        System.out.println("The max sum is: "+maxSubArray);
    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        prefixSum(numbers);
    }
}
