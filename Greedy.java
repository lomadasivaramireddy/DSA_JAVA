import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class Greedy{
        public static void findContentChildren(int[] greed, int[] cookieSize) {
            int n = greed.length;
            int m = cookieSize.length;
            Arrays.sort(greed);
            Arrays.sort(cookieSize);
            int l = 0;
            int r = 0;
            while (l < m && r < n) {
                if (greed[r] <= cookieSize[l]) {
                    r++;
                }
                l++;
            }
            System.out.println(r);                       
        }
        public static void lemonadeChange(int[] bills) {
            int five=0;
            int ten=0;
            for(int i=0;i<bills.length;i++){
                if(bills[i]==5) five++;
                else if(bills[i]==10){
                    if(five== 0) System.out.println(false);
                    five=five-1;
                    ten++;
                }
                else if(bills[i]==20){
                    if(ten > 0 && five > 0){
                        ten=ten-1;
                        five=five-1;
                    }
                    else if(five >= 3){
                        five=five-3;
                    }
                    else System.out.println(false);
                }
            }
            System.out.println(true);
        }
        public static void Shortest_Job_first(int bt[]){
            int t=0;
            int wt=0;
            Arrays.sort(bt);
            for(int i=0;i<bt.length;i++){
                wt+=t;
                t+=bt[i];
            }
        System.out.println((wt/bt.length));
          }
          public static void canJump(int[] nums) {
            int maxindex=0;
            for(int i=0;i<nums.length;i++){
                if(i>maxindex){
                    System.out.println(false);
                }
                maxindex=Math.max(maxindex,i+nums[i]);
            }
            System.out.println(true);
        }
        public static class Job{
            int id,deadline,profit;
            Job(int x,int y,int z){
                this.id=x;
                this.deadline=y;
                this.profit=z;
            }
        }
        public static void JobScheduling(Job arr[], int n){
            Arrays.sort(arr,(a,b) -> (b.profit-a.profit));
            int max_deadline=0;
            int jobs_count=0;
            int max_profit=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i].deadline>max_deadline){
                    max_deadline=arr[i].deadline;
                }
            }
            int job_allot_arr[]=new int[max_deadline+1];
            for(int i=0;i<=max_deadline;i++){
                job_allot_arr[i]=-1;
            }
            for(int i=0;i<arr.length;i++){
                for(int j=arr[i].deadline;j>0;j--){
                    if(job_allot_arr[j]==-1){
                        job_allot_arr[j]=i;
                        jobs_count++;
                        max_profit=arr[i].profit;
                        break;
                    }
                }
            }
            System.out.println("Total jods done :"+jobs_count);
            System.out.println("Total max profit :"+max_profit);
        }
            public static class Meet {
                int start, end, pos;
        
                Meet(int start, int end, int pos) {
                    this.start = start;
                    this.end = end;
                    this.pos = pos;
                }
            }
        
            public static void MeetingScheduler (int n, int start[], int end[]) {
                Meet[] meeting = new Meet[n];
                for (int i = 0; i < n; i++) {
                    meeting[i] = new Meet(start[i], end[i], i + 1);
                }
                Arrays.sort(meeting, Comparator.comparingInt(m -> m.end));
                int[] meetingPos = new int[n];
                int count = 1;
                int lastSelectedMeetingEndTime = meeting[0].end;
                meetingPos[0] = meeting[0].pos;
                int index = 1;        
                for (int i = 1; i < n; i++) {
                    if (meeting[i].start > lastSelectedMeetingEndTime) {
                        meetingPos[index++] = meeting[i].pos;
                        count++;
                        lastSelectedMeetingEndTime = meeting[i].end;
                    }
                }
                System.out.println("The total number of meetings: " + count);
                System.out.print("Meeting positions: ");
                for (int i = 0; i < index; i++) {
                    System.out.print(meetingPos[i] + " ");
                }
                System.out.println();
            }
            public static void eraseOverlapIntervals(int[][] intervals){
                if(intervals.length == 0) System.out.println("Removing intervals :" +0);
                Arrays.sort(intervals,(a,b) ->  Integer.compare(a[1], b[1]));
                int count=0;
                int end_interval=intervals[0][1];
                for(int i=1;i<intervals.length;i++){
                if(intervals[i][0]<end_interval){
                    count++;
                }
                else{
                    end_interval=intervals[i][1];
                }
            }
            System.out.println("Removing intervals :"+count);
            }
            public static void insert(int[][] intervals, int[] newInterval){
                List<int[]> result=new ArrayList<>();
                int i=0;
                int n=intervals.length;
                while (i<n && intervals[i][1] < newInterval[0]) {
                    result.add(intervals[i]);
                    i++;
                }
                while(i<n && intervals[i][1]<= newInterval[1]){
                    newInterval[0]=Math.min(newInterval[0], intervals[i][0]);
                    newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
                    i++;
                }
                result.add(newInterval);
                while (i < n) {
                    result.add(intervals[i]);
                    i++;
                }
                for (int[] interval : result) {
                    System.out.println("[" + interval[0] + ", " + interval[1] + "]");
                }
            }
            
        public static void main(String[] args) {
            //int[] greed = {1, 5, 3, 3, 4};
            //int[] cookieSize = {4, 2, 1, 2, 1, 3};
            //findContentChildren(greed, cookieSize);
            //int[] bills={5,5,5,10,20};
            //lemonadeChange(bills);
            //int [] bt={4,3,7,1,2};
            //int [] bt={1,2,3,4};
            //Shortest_Job_first(bt);
            //int[] nums={2,3,1,1,4};
            //int[] nums={3,2,1,0,4};
            //canJump(nums);
            // Job[] arr = new Job[4];
            // arr[0] = new Job(1, 4, 20);
            // arr[1] = new Job(2, 1, 10);
            // arr[2] = new Job(3, 2, 40);
            // arr[3] = new Job(4, 2, 30);
            /*Job[] arr = {
                new Job(1, 2, 100),  
                new Job(2, 1, 19),   
                new Job(3, 2, 27),  
                new Job(4, 1, 25),
                new Job(5, 1, 15)};
            JobScheduling(arr, 5);*/
        /* int n = 6, start[] = {1, 3, 0, 5, 8, 5}, end[] = {2, 4, 6, 7, 9, 9};
        int n = 3, start[] = {10, 12, 20}, end[] = {20, 25, 30};
        MeetingScheduler(n, start, end); */
        /* int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int[][] intervals = {{1, 2}, {1,2}, {1,2}};
        eraseOverlapIntervals(intervals); */
        /* int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}}; 
        int[] newInterval = {4,8};
        insert(intervals, newInterval); */
    }
}