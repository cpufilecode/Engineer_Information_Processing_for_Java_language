package sinagong;

abstract class Animal {
    String a = " is animal";
    abstract void look();
    void show() {
        System.out.println("Zoo");
    }
}
class Chicken extends Animal {
    Chicken() {
        look();
    }
    void look() {
        System.out.println("sinagong.Chicken" + a);
    }
    void display() {
        System.out.println("two wings");
    }
}
public class Java124 {
    public static void main(String[] args) {
        Animal a = new Chicken();
        a.show();
    }
}
