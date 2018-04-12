import java.util.Scanner;
/**
 * 最长公共子序列
 * @author Administrator
 *
 */

public class ZXL {
	
	static int max(int a,int b){
		return a>b?a:b ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m;
		int  a,b ;
		
		char[] x,y ;
		a  = 7 ;
		b =  6 ;
		m = new int[a][b] ;
		
		x = new char[]{'A','B','C','B','D','A','B'} ;
		y = new char[]{'B','D','C','A','B','A'} ;
		
		for(int i=0;i<x.length;i++){
			for(int j = 0; j<y.length;j++){
				if((i==0||j==0)&&x[i]!=y[j]){
					m[i][j] = 0 ;
				}else if((i==0||j==0)&&x[i]==y[j]) m[i][j]=1 ;
				else if(x[i]==y[j])m[i][j] = m[i-1][j-1]+1 ;
				else if(x[i]!=y[j])m[i][j]=max(m[i][j-1],m[i-1][j]) ;
			}
		}
		System.out.println(m[a-1][b-1]);
		
	}

}
