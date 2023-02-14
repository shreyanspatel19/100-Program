import java.util.*;
 class P42{
  public static void main(String[] age){
  int ar[] = {1, -1} ;
  int k = 1;
  // time limited exted 😶😶😶😶😶
  System.out.println(Arrays.toString(ar));
  int ans[] = new int[ar.length - k +1];
    int max = Integer.MIN_VALUE;
    for(int i =0; i<ar.length; i++){
        if(i<k){
            max = max < ar[i] ? ar[i] : max; 
            continue;
        }
        ans[i-k] = max;
        if(max == ar[i-k]){
            max = Integer.MIN_VALUE;
                for (int j = i - k + 1; j <= i; j++) {
                    max = max < ar[i] ? ar[i] : max; 
            }
        }else{
        max = max < ar[i] ? ar[i] : max; 
        }
    }
    ans[ans.length-1] = max;

System.out.println(Arrays.toString(ans));

// otimized
 public class Pair implements Comparable<Pair>{
        int idx;
        int val;
        Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
        @Override 
        public int compareTo(Pair p2){
            return p2.val - this.val;
        }

    }
    public int[] maxSlidingWindow(int[] nums, int k) {
    int ans[] = new int[nums.length - k +1];
    int max = Integer.MIN_VALUE;
    PriorityQueue<Pair> pq = new PriorityQueue<Pair>();

    for(int i = 0; i<k; i++){
        pq.add(new Pair(nums[i], i));
    }

    ans[0] = pq.peek().val;

    for(int i = k; i<nums.length; i++){
        while(pq.size() > 0 && pq.peek().idx <= i-k)
            pq.remove();
        
        pq.add(new Pair(nums[i], i));
        ans[i-k+1] = pq.peek().val;

    }
    System.out.println(Arrays.toString(ans));
  }
}