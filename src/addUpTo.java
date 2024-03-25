package src;

public class addUpTo {

    // 方法一 : 公式解
    public static int addUpToWithFormula(int n) {
        return  ((n+1) * n) / 2;
    }

    // 方法二 : 遞迴
    public static int addUpToWithRecusive(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + addUpToWithRecusive(n-1);
        }
    }

    // 方法三 : ForLoop
    public static int addUpToWithForLoop(int n) {
        int result = 0;
        for (int i = 1; i <=n; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(addUpToWithFormula(10));
        System.out.println(addUpToWithFormula(100));
        System.out.println(addUpToWithFormula(1000));
        System.out.println(addUpToWithFormula(10000));
        long end = System.currentTimeMillis();
        System.out.println("With formula, the time difference is " + (end - start));

        start = System.currentTimeMillis();
        System.out.println(addUpToWithForLoop(10));
        System.out.println(addUpToWithForLoop(100));
        System.out.println(addUpToWithForLoop(1000));
        System.out.println(addUpToWithForLoop(10000));
        end = System.currentTimeMillis();
        System.out.println("With for loop, the time difference is " + (end - start));


        start = System.currentTimeMillis();
        System.out.println(addUpToWithRecusive(10));
        System.out.println(addUpToWithRecusive(100));
        System.out.println(addUpToWithRecusive(1000));
        System.out.println(addUpToWithRecusive(10000));
        end = System.currentTimeMillis();
        System.out.println("With recursive, the time difference is " + (end - start));
    }
}
