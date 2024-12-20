class Arrays {
    public static void reverse(int a[],int low,int high){
        while(low < high){
            int temp=a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;
        }
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    }
    public static void minmax(int[] a){
        int min=a[0];
        int max=a[0];
        for(int i=0;i<a.length-1;i++){
            if(a[i] < min){
                min=a[i];
            }
            else if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Minimum number in an Array:"+min);
        System.out.println("Maximum number in an Array:"+max);
    }
    public static void maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxi = Math.max(sum, maxi);
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxi);
    }
    public static void sortColors(int[] nums) {
        int temp;
        int low = 0;
        int mid = 0;
        int high =nums.length- 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        for (int i = 0; i <nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static void secondlargest(int a[]){
        int largest=a[0];
        int slargest=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                slargest=largest;
                largest=a[i];
            }
            else if(a[i] > slargest && a[i] < largest){
                slargest=a[i];
            }
        }
        System.out.println("First largest :"+largest);
        System.out.println("Second largest :"+slargest);
    }
    public static void secondsamllest(int a[]){
        int smallest=a[0];
        int ssmallest=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]<smallest){
                ssmallest=smallest;
                smallest=a[i];
            }
            else if(a[i] < ssmallest && a[i] != smallest){
                ssmallest=a[i];
            }
        }
        System.out.println("First smallest :"+smallest);
        System.out.println("Second smallest :"+ssmallest);
    }
        public static void getSecondOrderElements(int a[]){
            int largest = a[0];
            int secondLargest =Integer.MIN_VALUE;
            int smallest = a[0];
            int secondSmallest =Integer.MAX_VALUE;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > largest) {
                    secondLargest = largest;
                    largest = a[i];
                } else if (a[i] > secondLargest && a[i] < largest) {
                    secondLargest = a[i];
                }
            }
            for (int i = 0; i < a.length; i++) {
                if (a[i] < smallest) {
                    secondSmallest = smallest;
                    smallest = a[i];
                } else if (a[i] < secondSmallest && a[i] > smallest) {
                    secondSmallest = a[i];
                }
            }
            System.out.println("Second Largest :"+secondLargest);
            System.out.println("Second Smallest :"+secondSmallest);
        }
        public static void isSorted(int n, int []a) {
            for(int i=1;i<n;i++){
                if(a[i]>=a[i-1]){}
                else System.out.println("not sorted");
            }System.out.println("sorted");
        }
        public static void no_of_removeDuplicates(int[] arr,int n) {
            int i=0;
            for(int j=1;j<n;j++){
                if(arr[i]!=arr[j]){
                    arr[i+1]=arr[j];
                    i++;
                }
            }
            System.out.println(i+1);
        }
        static void rotateArray(int[] arr, int n) {
            int temp=arr[0];
            for(int i=1;i<n;i++){
                arr[i-1]=arr[i];
            }
            arr[n-1]=temp;
            for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        }
        public static void moveZeros(int n, int []a) {
            int j=-1;
            for(int i=0;i<n;i++){
                if(a[i]==0){
                    j=i;
                    break;
                }
            }
            if(j==-1) {
                for(int v=0;v<n;v++){
                    System.out.println(a[v]);}}
            for(int i=j+1;i<n;i++){
                if(a[i] !=0){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    j++;
                }
            }
            for(int v=0;v<n;v++){
                System.out.print(a[v]+" ");}
        }
        public static void l_search_array(int a[],int ele){
            for(int i=0;i<a.length;i++){
                if(a[i]==ele) System.out.println("Element at index :"+i);
            }System.out.println("Element not found");
        }
    public static void main(String[] args) {
        //int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //maxSubArray(nums);
        //int nums[] = {0,1,2,0,1,2,0,0,0,1,1,1,2,2};
        //sortColors(nums);
        //int a[]={12,2,21,24,45,21,36,59};
        //reverse(a,0,a.length-1);
        //minmax(a);
        //secondlargest(a);
        //secondsamllest(a);
        //getSecondOrderElements(a);
        //int a[]={12,1,2,3,4,5,6,7,9,21};
        //isSorted(a.length,a);
        //int arr[]={1,1,1,2,2,2,3,3,4,5,5};
        //no_of_removeDuplicates(arr,arr.length);
        //int arr[]={12,28,31,45,55};
        //rotateArray(arr, arr.length);
        //int a[]={1,0,2,0,3,0,4,0,5,0,6,7,8,9,0};
        //moveZeros(a.length,a);
        int a[]={12,34,56,11,32,89,65,43};
        l_search_array(a, 100);
    }
}
