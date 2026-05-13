public class Sorting{
    public static void sortingArr(int arr[]){
        int swap=0;
        for(int turns=0;turns<arr.length-1;turns++){
            for(int j=0;j<arr.length-1-turns;j++){
                //swap
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap++;             
                }
            }
        }
        System.out.println(swap);
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,2,4};
        sortingArr(arr);
        printArr(arr);
    }
}
