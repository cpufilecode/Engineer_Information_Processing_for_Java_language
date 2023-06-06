public class Java123_04 {

}

class cond {
    int a;
    public cond(int a) {
        this.a = a;
    }
    public int func( ) {
        int b = 1;
        for (int i = 1; i < a; i++)
            b += a * i;
        return a + b;
    }
}