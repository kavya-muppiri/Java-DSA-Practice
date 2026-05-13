class ReverseArray{
    public static int[] reverse(int numbers[]){
        int start=0;
        int last=numbers.length-1;
        while(start<last){
            int temp=numbers[start];
            numbers[start]=numbers[last];
            numbers[last]=temp;
            start++;
            last--;
        }
        return numbers;
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,8,9,10};
        int result[]=reverse(numbers);
        for( int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" , ");
        }
    }
}
