class parent {
    int compute(int num) {
        if(num <= 1) return num;
        return compute(num - 1) + compute(num - 2);
    }
}
class child extends parent {
    int compute(int num) {
        if(num <= 1) return num;
        return compute(num - 1) + compute(num - 3);
    }
}
public class Java124_3 {
    public static void main(String[] args) {
        parent obj = new child();
        System.out.print(obj.compute(4));
    }
}
