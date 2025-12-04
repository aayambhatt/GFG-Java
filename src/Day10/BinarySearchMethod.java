package Day10;
import java.util.Arrays;

public class BinarySearchMethod {
    public static void main(String[] args) {
        int[] arr = {5,6,7,2,1,8,9,4};

        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int keyValue = 8;

        System.out.println(keyValue + " found at index " + Arrays.binarySearch(arr, keyValue));

    }
}
