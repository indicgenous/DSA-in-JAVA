import java.util.Arrays;
public class Cycle_sort {
        public static void main(String[]args){
                int[]arr={6,2,1,3,4,5};
                cycle(arr);

        }
        static void cycle(int[]arr){
                int i =0;
                while(i<arr.length){
                  int correct =arr[i]-1;
                  if(arr[i] != arr[correct]){
                          int temp =arr[i];
                          arr[i]=arr[correct];
                          arr[correct]=temp;
                  }else{i++;}

                }
                System.out.println(Arrays.toString(arr));
        }
}