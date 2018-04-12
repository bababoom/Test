import java.util.*;
public class Test22 {
	static int[][] d = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
	static int sx,sy,ex,ey ;
	static int n,m,t ,step = 0;
	static ArrayList<String> list = new ArrayList<String>() ;
	static boolean flag ;
	static char[][] str ;
	static void dfs(int x,int y){
		if(flag) return ;
		else if(step>t) return ;
		else if(x==ex&&y==ey){
			if(step==t){
				flag =true ;
			}
			
			return ;
		}
		for(int i=0;i<4;i++){
			int nx,ny ;
			nx = x+d[i][0] ;
			ny = y+d[i][1] ;
			if(nx>=0&&nx<str.length&&ny>0&&ny<str[0].length&&(str[nx][ny]=='.'||str[nx][ny]=='D')){
				step++ ;
				str[x][y] = 'X' ;
				dfs(nx,ny) ;
				step-- ;
				str[x][y] = '.' ;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in) ;
		
		while(input.hasNext()){
			n = input.nextInt() ;
			m = input.nextInt() ;
			t = input.nextInt() ;
			if(n==0&&m==0&&t==0) break ;
			str = new char[n][m] ;
			for(int i=0;i<n;i++){
				str[i] = input.next().toCharArray();
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					
					if(str[i][j] == 'S'){
						sx = i ;
						sy = j ;
					}
					if(str[i][j]=='D'){
						ex = i ;
						ey = j ;
					}
					
				}
			}
			
			int temp = Math.abs(ex-sx)+Math.abs(ey-sy) ;
			if(t<temp||(t-temp%2)==0){
				list.add("NO") ;
			}else{
				dfs(sx,sy) ;
				if(flag){
					list.add("YES") ;
				}else list.add("NO") ;
				flag = false ;
				step = 0 ;
			}
			
		}
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
