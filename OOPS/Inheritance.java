class Animals {
    void eat() {
        System.out.println("Eats");
    }
}

class Fish extends Animals {
    void swims() {
        System.out.println("swims");
    }
}

class Bird extends Animals {
    void fly() {
        System.out.println("fly");
    }
}

class Tuna extends Fish {
    void expence() {
        System.out.println("is expensive");
    }
}

class Shark extends Fish {
    void danger() {
        System.out.println("is dangerous");
    }
}

class Peacock extends Bird {
    void rare() {
        System.out.println("Rare");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animals a = new Animals();
        a.eat();
        Tuna t = new Tuna();
        t.eat();
        t.swims();
        Peacock p = new Peacock();
        p.fly();
    }
}
