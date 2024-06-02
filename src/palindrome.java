package src;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String test = "how are you doing today!";
        boolean isPalindrome = true;
        for (int i = 0; i < test.length() / 2; i++) {
            if (test.charAt(i) != test.charAt(test.length() - 1 - i)) {
                isPalindrome = false;
            }
        }
        if (isPalindrome) {
            System.out.println(test + ": 是迴文");
        } else {
            System.out.println(test + ": 不是迴文");
        }
    }

}
