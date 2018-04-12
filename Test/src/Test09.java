import java.util.*;
public class Test09 {
	public static int max(int a,int b){
		return a>b?a:b ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		int n = input.nextInt() ;
		int[][] num = new int[n][n] ;
		for(int i=0;i<n;i++){
			for(int t=0;t<i+1;t++){
				num[i][t] = input.nextInt() ;
			}
		}
		for(int i = n-2;i>=0;i--){
			for(int j=0;j<i+1;j++){
				num[i][j] += max(num[i+1][j],num[i+1][j+1]) ;
			}
		}
		System.out.println(num[0][0]);
	}

}
