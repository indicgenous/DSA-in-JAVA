public class Linear_Search {
    public static void main(String[] args) {
        int[]arr={2,34,6,3,1,7,8,-1};
        int target=3;
        int k =lin_search(arr,target);
        System.out.println(k);

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
}
