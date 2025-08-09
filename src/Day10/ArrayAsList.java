package Day10;

import java.util.Arrays;

public class ArrayAsList {
    public static void main(String[] args) {
        // Initialize a primitive int array
        int[] intArr = { 10, 20, 15, 22, 35 };

        // Attempt to convert the primitive int array to a List using Arrays.asList
        // Note: This will treat the entire intArr as a single element, not as individual integers.
        System.out.println("Integer Array as List: " + Arrays.asList(intArr));

        // Printing the array object directly, which uses the default Object.toString method,
        // resulting in a string like [I@hexcode (type + hashcode)
        System.out.println("Default toString method: " + intArr);
    }
}
