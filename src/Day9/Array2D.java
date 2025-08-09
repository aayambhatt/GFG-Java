package Day9;

class Array2D {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        for(int[] row : arr){
            int total = 0;
            for(int elem : row){
                total = total+elem;
                System.out.print(elem + " ");
            }
            System.out.print(" Sum: " + total);
            System.out.println();
        }

    }
}