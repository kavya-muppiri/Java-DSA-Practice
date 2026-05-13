public class InvertedTriangle{
    public static void main(String args[]){
        int n=4;
        for(int line=1;line<=4;line++){
            for(int stars=1;stars<=n-line+1;stars++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
