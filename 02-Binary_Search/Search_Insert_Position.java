//https://leetcode.com/problems/search-insert-position/
class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int k=insert(nums,target);
        return (k);
    }
    static int insert(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        if (target>arr[end]){
            return end+1;
        }
        if(target<=arr[0]){
            return 0;
        }
        while(start<=end){
            int mid =start+((end-start)/2);
            if(target<arr[mid]){
                end=mid-1;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            if(target==arr[mid]){
                return mid;
            }
            if(arr[mid]<target && target<=arr[mid+1]) {
                return mid+1;
            }
        }
        return -1 ;
    }
}

