package sinagong;

class a {
    int a;
    int b;
}
public class Java123_05 {
    static void func1(a m) {
        m.a *= 10;
    }
    static void func2(a m) {
        m.a += m.b;
    }
    public static void main(String args[]) {
        a m = new a();
        m.a = 100;
        func1(m);
        m.b = m.a;
        func2(m);
        System.out.printf("%d", m.a);
    }
}
