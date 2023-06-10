package sinagong;

class A {
    int a;
    public A(int a) { this.a = a; }
    void display() { System.out.println("sinagong.a=" + a); }
}
class B extends A {
    public B(int a) {
        super(a);
        super.display();
    }
}
public class Java123_03 {
    public static void main(String[] args) {
        B obj = new B(10);
    }
}
