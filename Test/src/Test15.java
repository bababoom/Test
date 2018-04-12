import java.util.*;
public class Test15 {
	static char[][] map ;
	static int wall ;
	static int sx,sy,ex,ey ;
	static boolean flag ;
	static int[][] d = new int[][]{{0,1},{1,0},{0,-1},{-1,0}} ;
	static void dfs(int x,int y,int t){
		if(flag) return ;
		if(map.length*map[0].length-wall<=t||t<Math.abs(ex-x)+Math.abs(ey-y)||(t-Math.abs(ex-x)+Math.abs(ey-y))%2!=0) return ;
		else if(t==0){
			if(x==ex&&y==ey){
				flag = true ;
				return ;
			}else return ;
		}
		else{
			for(int i=0;i<4;i++){
				int nx= x+d[i][0] ;
				int ny = y+d[i][1] ;
				if(nx>=0&&nx<map.length&&ny>=0&&ny<=map[0].length&&(map[nx][ny]=='.'||map[nx][ny]=='D')){
					map[nx][ny] ='X' ;
					dfs(nx,ny,t-1) ;
					map[nx][ny] = '.' ;
				}
			}
		}
		return ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in) ;
		ArrayList<String> list = new ArrayList<String>() ;
		int n,m,t ;
		while(input.hasNext()){
			wall = 0 ;
			n = input.nextInt() ;
			m = input.nextInt() ;
			t = input.nextInt() ;
			if(n==0&&m==0&&t==0) break;
			map = new char[n][m] ;
			for(int i=0;i<n;i++){
				String s = input.next();
				map[i] = s.toCharArray() ;
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					if(map[i][j] == 'S'){
						sx = i ;
						sy = j ;
					}
					if(map[i][j]=='D'){
						ex = i ;
						ey = j ;
					}
					if(map[i][j]=='X') wall++ ;
				}
			}
			flag = false ;
			dfs(sx,sy,t) ;
			if(flag) list.add("YES") ;
			else list.add("NO") ;
		}
		for(int i=0;i<list.size();i++){
			if(i==list.size()-1) System.out.print(list.get(i));
			else System.out.println(list.get(i));
		}
	}

}
