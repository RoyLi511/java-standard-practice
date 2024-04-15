package src;

public class pyramid {

    public static void pyramid(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        pyramid(1);
        System.out.println("====================");
        pyramid(3);
        System.out.println("====================");
        pyramid(5);
    }
}
