import java.util.*;
public class Test29 {
	static final int MOD = 1000000007 ;
	static int count = 0 ;
	static boolean[][] isv ;
	static int[][] d ={{-1,0},{1,0},{0,-1},{0,1},{-1,1},{-1,-1},{1,-1},{1,1}};
	public static void DFS(int x,int y,int n){
		
		if(n==(2*isv[0].length)){
			count++ ;
			return ;
		}
		
		for(int i=0;i<8;i++){
			int nx=x,ny=y ;
			nx += d[i][0] ;
			ny += d[i][1] ;
			if(nx>=0&&nx<isv.length&&ny>=0&&ny<2){
				if(!isv[nx][ny]){
					isv[nx][ny] = true ;
					DFS(nx,ny,n+1) ;
					isv[nx][ny] = false ;
				}
				
			}
			
		}
		return ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		int n = input.nextInt() ;
		isv = new boolean[n][n] ;
		for(int i=0;i<isv.length;i++){
			for(int j=0;j<isv[i].length;j++){
				isv[i][j] = true ;
				DFS(i,j,1) ;
				isv[i][j] = false ;
			}
		}
		System.out.println(count%MOD);
	}

}
