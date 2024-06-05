package src;

import java.util.Scanner;

public class maxMinNum {
    public static int GCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static int LCM(int a, int b) {
        return (a * b) / GCD(a,b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入第一個整數: ");
        Integer a = scanner.nextInt();
        System.out.println("請輸入第二個整數: ");
        Integer b = scanner.nextInt();

        System.out.println(a + ", " + b + "最大公因數為 " + GCD(a,b));
        System.out.println(a + ", " + b + "最小公倍數為 " + LCM(a,b));

    }
}
