package Day9;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        String s;
        int n = arr.length;
        System.out.println("Length of Array: " + n);
        // traversing the array
        for(int i = 0 ; i<n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
