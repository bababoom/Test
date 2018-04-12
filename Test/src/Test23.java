import java.util.Scanner;


public class Test23 {
	static char[][] str ;
	static int[] d ;
	static int count = 0,n ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		n = input.nextInt() ;
		d = new int[]{n,n} ;
		str = new char[n][n] ;
		for(int i=0;i<n;i++){
			for(int j= 0;j<n;j++){
				str[i][j] = input.next().charAt(0) ;
			}
		}
		
	}

}
