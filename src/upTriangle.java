package src;

import java.util.Scanner;

public class upTriangle {

    public static void printStars(int space, int stars) {
        String result = "";
        for (int i = 0; i < space; i++) {
            result += " ";
        }
        for (int i = 0; i < stars; i++) {
            result += "*";
        }
        System.out.println(result);
    }

    public static void pyramid(int n){
        int stars = 1; // 星星數量從 1 開始
        int space = n-1; // 空白的數量要從 n-1 開始

        // 當space的數量還會大於等於零前，不停執行printStars
        while (space >= 0) {
            printStars(space, stars);
            space--;
            stars += 2;
        }
    }

    public static void main(String[] args) {
        pyramid(1);
        System.out.println("========================");
        pyramid(3);
        System.out.println("========================");
        pyramid(5);
    }
}
