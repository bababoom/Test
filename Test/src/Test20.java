import java.util.*; 
public class Test20 {
	static int n,m,k ,t = 0,price=-1;
	static int[][] map ;
	static int[][] d = new int[][]{{0,1},{1,0}} ;
	static long count = 0 ;
	static void dfs(int x,int y){
		
		if(x==map.length-1&&y==map[0].length-1){
			if(t==k){
				count++ ;
			}
			return ;
		}
		if(t>k) return ;
		if(price<map[x][y]){
			for(int i=0;i<2;i++){
				int nx = x ,ny = y ;
				nx += d[i][0] ;
				ny += d[i][1] ;
				if(nx<n&&ny<m){
					dfs(nx,ny) ;
				}
			}
			price = map[x][y] ; 
			t++ ;
			for(int i=0;i<2;i++){
				int nx = x ,ny = y ;
				nx += d[i][0] ;
				ny += d[i][1] ;
				if(nx<n&&ny<m){
					dfs(nx,ny) ;
				}
			}
			
			
			
			
		}
		else{ 
			for(int i=0;i<2;i++){
			int nx = x ,ny = y ;
			nx += d[i][0] ;
			ny += d[i][1] ;
			if(nx<n&&ny<m){
				dfs(nx,ny) ;
			}
			}
		}
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in) ;
		n = input.nextInt() ;
		m = input.nextInt() ;
		k = input.nextInt() ;
		map = new int[n][m] ;
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[0].length;j++){
				map[i][j] = input.nextInt() ;
			}
		}
		dfs(0,0) ;
		System.out.println(count%1000000007);
		
	}
}
