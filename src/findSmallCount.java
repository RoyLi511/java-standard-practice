package src;

public class findSmallCount {

    public static int findSmallCount(int[] arr, int n) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < n) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findSmallCount(new int[] {1, 2, 3}, 2));
        System.out.println(findSmallCount(new int[] {1, 2, 3, 4, 5}, 0));
    }
}
