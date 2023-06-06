class Class1 {
    Class1() {
        System.out.print('A');
        this.prn();
    }
    void prn() {
        System.out.print('B');
    }
}
class Class2 extends Class1  {
    Class2() {
        super();
        System.out.print('D');
    }
    void prn() {
        System.out.print('E');
    }
    void prn(int x) {
        System.out.print(x);
    }
}
public class Java123의2 {
    public static void main(String[] args) {
        int x = 7;
        Class2 cal = new Class2();
    }
}
