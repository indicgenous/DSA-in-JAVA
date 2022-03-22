import java.util.Arrays;

public class sort {
    public static void main(String[]args){
        int[]arr={3,4,5,7,8,2,8,-2,99,56,-56,45};
        selection(arr);

    }

    static void bubble(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        System.out.print(Arrays.toString(arr));;
    }


    static void selection(int[]arr){
        for (int start = 0; start < arr.length; start++) {
           int minpos=start;
            for (int i = start; i < arr.length; i++) {
                if(arr[minpos]>arr[i]){
                    int temp=arr[minpos];
                    arr[minpos]=arr[i];
                    arr[i]=temp;
                }

            }

        }
        System.out.print(Arrays.toString(arr));
    }

}
