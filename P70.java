import java.util.Scanner;
 class P70{
    static int dp[];
  public static void main(String[] age){
    int n = 12;
    int ans = helper(n,dp);
    System.out.println(n-ans+1);
  }
    public static int helper(int n, int dp[]){
        double pow = Math.log(n) / Math.log(2) ;
        if(pow == (int) pow){
            return dp[(int)pow];
        }

        pow = Math.floor(pow);
        int ans = dp[(int) pow];

        int lowast = (int)Math.pow(2, (int)pow);
        int left = n - lowast;
        if(left >= lowast/2){
            ans += dp[(int) pow-1] + (left - lowast/2 +  1); 
        }else{
            ans += helper(left, dp);
        }
        return ans;
    }
  static{
    dp = new int[33];
    dp[0] = 0;
    dp[1] = 0;
    int val = 1;
    for(int i = 2; i < dp.length; i++){
        dp[i] = dp[i-1] + dp[i-2] + val; // val = 2 ^ i - 2 i = 3 =  2 ^2 - 2 = 2 ^ 0 = 1 , 0001 = 1 , 1 << 1, 0010 2 ^ 2 = 4 
        val = val << 1;
    }
  }

}