package sinagong;

import java.util.Scanner;

public class Java118 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.printf("sinagong.a * 3 = %d\n",a*3);
        System.out.println("sinagong.a / 2 = " + (a/2));
        System.out.print("sinagong.a - 1 = " + (a-1));
        scan.close();
    }
}
