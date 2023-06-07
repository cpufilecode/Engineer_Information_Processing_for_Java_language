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
        System.out.println("Chicken" + a);
    }
    void display() {

    }
}
public class Java124 {
}
