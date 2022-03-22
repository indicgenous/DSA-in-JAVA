package src;

public class Binsearch {
    public static void main(String[] args){
        int[]arr={-5,1,2,3,44,55,67,68,77,78,79,89,90,99};
        int target = -5;
        int k=binsearch(arr,target);
        System.out.println(k);
    }
    static int binsearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            // mid element
            int mid = (start+((end-start)/2));

            if(target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return  -1;

    }
    static int celing(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = start + ((end - start) / 2);
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{return mid;}
            if(arr[mid-1]<target && target<=arr[mid]) {
                return mid;
            }
        }
        return -1;

    }
    static int floor(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = start + ((end - start) / 2);
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{return mid;}
            if(arr[mid-1]<target && target<=arr[mid]) {
                return mid-1;
            }
        }
        return -1;


    }


}

