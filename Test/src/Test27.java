import java.util.*;
public class Test27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		int n = input.nextInt() ;
		int[][] num = new int[n][n] ;
		int[][] dp = new int[n][n] ;
		for(int i=0;i<num.length;i++){
			for(int j=0;j<=i;j++){
				num[i][j] = input.nextInt() ;
			}
		}
		for(int i=num.length-2;i>=0;i--){
			for(int j = 0;j<=i;j++){
				num[i][j] += Math.max(num[i+1][j], num[i+1][j+1]) ;
			}
		}
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num[i].length;j++){
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
	}

}
