interface chessPlayer{
    void move();
}
class Queen implements chessPlayer{
    public void move(){
        System.out.println("queen moves");
    }
}
class Rooks implements chessPlayer{
    public void move(){
        System.out.println("rooks moves");
    }
}
class king implements chessPlayer{
    public void move(){
        System.out.println("king moves");
    }
}

public class Interface {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.move();    
    }
}
