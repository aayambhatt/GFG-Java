package Day3;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        String[] nameArr = {"Aayam", "Aaryan", "Anamika", "Sunil"};

        System.out.println(nums[0]);
        System.out.println(nameArr[2]);

        // to print the array, we need to use Arrays.toString
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString((nameArr)));
    }
}
