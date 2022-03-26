import java.util.Arrays;
public class insrtion {
    public static void main(String[]args){
        int[] arr={5,6,7,4,2,3,1};
        int sorted=arr[0];
        for(int i = 0;i<arr.length;i++){
            var current = arr[i];
            var j =i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=current;


        }
        System.out.println(Arrays.toString(arr));
    }
}
