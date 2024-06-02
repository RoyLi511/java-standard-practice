package src;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入 a 值: ");
        int a = scanner.nextInt();
        System.out.println("請輸入 n 值: ");
        int n = scanner.nextInt();

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result += (a * Math.pow(10, j));
            }
        }
        System.out.println("計算結果的值 : " + result);
    }
}
