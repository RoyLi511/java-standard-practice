package src;

import java.util.Scanner;

public class countDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入年分 : ");
        int year = scanner.nextInt();
        System.out.println("請輸入月分 : ");
        int month = scanner.nextInt();
        System.out.println("請輸入日期 : ");
        int day = scanner.nextInt();

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (leapYear == true) {
            days[1] = 29;
        }

        int result = 0;
        for (int i = 1; i < month; i++) {
            result += days[i];
        }
        System.out.println(result + day);

    }
}
