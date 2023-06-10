package sinagong;

class Parent {
    void show() { System.out.println("sinagong.parent"); }
}
class Child extends Parent {
    void show() {System.out.println("sinagong.child"); }
}
public class Java124_1 {
    public static void main(String[ ] args) {
        Parent pa = new Child();
        pa.show();
    }
}
