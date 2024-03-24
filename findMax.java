public class findMax {

    public static int findMax(int[] array) {
        int result = 0;
        int max = -1;
        for (int i = 0; i <= (array.length)-1; i++) {
            if (max < array[i]) {
                max = array[i];
                result = max;
            } else if (max > array[i]) {
                result = max;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};
        System.out.println(findMax(array));
    }
}

