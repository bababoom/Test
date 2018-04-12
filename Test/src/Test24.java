import java.util.*;
public class Test24 {
	static int[][] num ;
	static int[][] temp ;
	static int[][] x ;
	static int q,r;
	public static void test(){
		int w= 0 ,y;
		while(w<=(num.length-x.length)){
			y=0;
			while(y<=(num.length-x.length)){
				int r = 0 ;
				r = dfs(w,y) ;
				if(sum(x)<r){
					q = w ;
					r = y ;
					copy(temp,x) ;
				}
				y++ ;
			}
			w++ ;
			
		}
		
	}
	
	public static void copy(int[][] num,int[][] x){
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num.length;j++){
				x[i][j] = num[i][j] ;
			}
		}
	}
	public static void copy(int[][] num,int[][] x,int r,int y){
		int p=0,q=0 ;
		for(int i=r;i<r+num.length;i++,p++){
			 
			for(int j=y;j<y+num.length;j++,q++){
				x[i][j] = num[p][q] ;
			}
		}
	}
	public static int sum(int[][] num){
		int sum=0;
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num[i].length;j++){
				sum += num[i][j] ;
			}
		}
		return sum ;
	}
	public static int dfs(int x,int y){
		int t = 0,w = 0 ;
		int sum = 0;
		for(int i=x;i<x+temp.length;i++,t++){
			
			for(int j=y;j<y+temp.length;j++,w++){
				temp[t][w] = num[i][j]*(-1) ;
				sum += temp[t][w] ; 
			}
		}
		return sum ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		int n = input.nextInt() ;
		int b = (n+1)/2 ;
		num = new int[n][n] ;
		temp = new int[b][b] ;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				num[i][j] = input.nextInt() ;
			}
		}
		int sum = sum(num) ;
		test() ;
		copy(x,num,q,r);
		while(sum(num)>sum)
		{
			test() ;
			copy(x,num,q,r);
		}
		
	}

}
