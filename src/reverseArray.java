package src;
public class reverseArray {

    public static int[] reverseArray(int[] array) {
        int[] newArray = new int[array.length];
        int j = 0;
        for (int i = (array.length)-1 ; i >= 0  ; i--) {
            newArray[j] = array[i];
            j++;
        }
        return newArray;
    }


    public static void main(String[] args) {
        int[] array = {4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};
        int[] reversedArray = reverseArray(array);
        for (int i : reversedArray) {
            System.out.print(i + " ");
        }
    }
}
