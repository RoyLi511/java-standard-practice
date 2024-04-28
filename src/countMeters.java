package src;

import java.util.Scanner;

public class countMeters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入小球的高度 : ");
        int h = scanner.nextInt();
        System.out.println("請輸入小球落地的次數 : ");
        int n = scanner.nextInt();

        double result = h;
        for (int i = 2; i <= n; i++) {
            result += 2 * (h / Math.pow(2, i-1));
        }
        System.out.println("在 " + h + " 公尺處落下，第 " + n +" 次落地時，小球經過的總距離為 " + result + " 公尺。");
    }

}
