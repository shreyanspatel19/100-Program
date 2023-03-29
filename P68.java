import java.util.Scanner;
 class P68{
  public static void main(String[] age){
  int n = 6665;
  int ans = 0;
  int dp[] = new int[n+1];
  dp[0] = 0;
  for(int i = 1; i <= n; i++){
    dp[i] = i;
    for(int j = 1; j * j <= i; j++ ){
       dp[i] =  Math.min(dp[i], 1 + dp[i-(j*j)]);
    }
  }
  System.out.println(dp[n]);
  }
}