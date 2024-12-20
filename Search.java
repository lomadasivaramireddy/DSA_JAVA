public class Search {
    public static int binary_search(int []nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                 System.out.println(mid);
                 break;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;

    }
    public static void recursion_binary_search(int nums[],int low,int high,int target) {
        if (low > high) {
            System.out.println(-1);
            return;
        }
        int mid = (low + high) / 2;
        if (nums[mid] == target) {
            System.out.println(mid);  
            return;
        } else if (nums[mid] > target) {
            recursion_binary_search(nums, low, mid - 1, target);  
        } else{
            recursion_binary_search(nums, mid + 1, high, target);  
        }
    }
        public static void lowerBound(int []nums, int n, int x) {
            int low=0;
            int high=nums.length-1;
            int index=nums.length;
            while(low<=high){
                int mid=(low+high)/2;
                if(nums[mid]>=x){
                    index=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            System.out.println(index);
        }
        public static void upperBound(int []nums, int n, int x) {
            int low=0;
            int high=nums.length-1;
            int index=nums.length;
            while(low<=high){
                int mid=(low+high)/2;
                if(nums[mid]>x){
                    index=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            System.out.println(index);
        }
            public static void searchInsert(int [] arr, int m){
                int low=0;
                int high=arr.length-1;
                int index=arr.length;
                while(low<=high){
                    int mid=(low+high)/2;
                    if(arr[mid]>=m){
                        index=mid;
                        high=mid-1;
                    }
                    else{
                        low=mid+1;
                    }
                }
                System.out.println(index);
            }
    public static void main(String[] args) {
        //int nums[]={1,11,21,31,41,51,61,71,81,91};
        //binary_search(nums, 21);
        //recursion_binary_search(nums, 0, nums.length-1,91);
        //lowerBound(nums, nums.length, 51);
        //upperBound(nums, nums.length, 51);
        //int arr[]={1,12,21,31,53};
        //searchInsert(arr, 45);

    }
}
