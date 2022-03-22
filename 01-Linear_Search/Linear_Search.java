import java.util.Arrays;

public class Linear_Search {
    public static void main(String[] args) {
        int[][]arr={{2,34,6},{4,5,43},{56,78,90,92,99}};
        int target = 34;
        int[] k =lin2d(arr,target);
        System.out.println(Arrays.toString(k));

    }
    static int lin_search(int[]arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;
            }

        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
//    Lin search in a 2d matrix
    static int[] lin2d(int[][]arr, int target){
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return new int[]{i,j};
                }

            }
        //this line will execute if none of the return statements above have executed.
        // the target not found.
        return new int[]{-1,-1};
    }
}
