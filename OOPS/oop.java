public class oop {
    public static void main(String[] args) {
        Points p1=new Points(4,5);
        Points p2=new Points(5,6); 
        p1.add(p2);
        p1.substract(p2);
        p1.product(p2);
    }
}
class Points{
    int p1;
    int p2;
    
    Points(int x,int y){
        p1=x;
        p2=y;
    }

    void add(Points p){
        int x=this.p1+p.p1;
        int y=this.p2+p.p2; 
        System.out.println("(" + x + "," + y + ")");
    }
    void substract(Points p){
        int x=this.p1-p.p1;
        int y=this.p2-p.p2; 
        System.out.println("(" + x + "," + y + ")");
    }
    void product(Points p){
        int x=this.p1*p.p1;
        int y=this.p2*p.p2; 
        System.out.println("(" + x + "," + y + ")");
    }
}
