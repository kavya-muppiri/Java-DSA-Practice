class MaxSubArrays{
    public static int MaxSubArrays(int numbers[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                int sum=numbers[i]+numbers[j];
                if(sum>max){
                    max=sum;
                }   
            }
        } 
        return max;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        int maximum=MaxSubArrays(numbers);
        System.out.println(maximum);
    }
}
