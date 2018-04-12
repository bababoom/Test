import java.util.*;
public class Stone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		int n = input.nextInt() ;
		int[][] dp = new int[n+1][n+1] ;
		int[] w = new int[n+1] ;
		int[] sum = new int[n+1] ;
		for(int i=1;i<=n;i++){
			w[i] = input.nextInt() ;
			sum[i] = sum[i-1]+w[i] ;
		}
		for(int len = 1;len<=n;len++){
			for(int l=1,r;(r=l+len)<=n;l++){
				dp[l][r] = Integer.MAX_VALUE ;
				for(int i=l;i<r;i++){
					dp[l][r] = Math.min(dp[l][r], dp[l][i]+dp[i+1][r]+sum[r]-sum[l-1]) ;
				}
			}
		}
		System.out.println(dp[1][n]);
	}

}
