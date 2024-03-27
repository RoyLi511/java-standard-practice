package src;

public class letterCaseSensitivity {

    public static void position(String s) {
        // 設一個布林值判斷有沒有找到，出值先設false
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 比對自己跟自己的大寫有沒有一樣，如果一樣表示本身就是大寫，就印出
            if (Character.toUpperCase(c) == c) {
                System.out.println(c + " " + i);
                found = true;
                return;
            }
        }

        if (!found) {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        position("abcd"); // prints -1
        position("AbcD"); // prints A 0
        position("abCD"); // prints C 2
    }
}
