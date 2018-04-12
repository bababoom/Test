import java.util.*;
public class Test25 {
	
	static int[][] num ;
	static int step = 0 ;
	static int count = 0 ;
	
	public static void DFS(int x,int y,int t){
		
		if(t==step){
			int b=0,w=0 ;
			for(int i=0;i<num.length;i++){
				for(int j=0;j<num.length;j++){
					if(num[i][j]==2)b++ ;
					else if(num[i][j]==3)w++ ;
				}
			}
			if(b!=num.length||w!=num.length)return ;
			for(int i=0;i<num.length;i++){
				for(int j=0;j<num.length;j++){
					if(num[i][j]!=0&&num[i][j]!=1){
						if(!judge(i,j)) return ;
					}
				}
			}
			count++ ;
		
			return ;
		}
		int tx=x,ty=y ;
		if(ty<num.length-1)ty++ ;
		else if(ty==num.length-1&&tx<num.length-1){
			tx++ ;
			ty=0 ;
		}
		if(num[x][y]!=0){
			for(int i=0;i<3;i++){
				t++ ;
				num[x][y] += i ;
				DFS(tx,ty,t) ;
				t-- ;
				num[x][y] -= i ;
			}
		}
	}
	public static boolean judge(int x,int y){
		int tx=x,ty=y ;
		while(tx>=0&&ty>=0&&tx<(num.length-1)&&ty<(num.length-1)){
			tx++;ty++ ;
			if(num[tx][ty]==num[x][y])return false ;
			
		}
		tx=x;ty=y ;
		while(tx>0&&ty>=0&&tx<(num.length)&&ty<(num.length-1)){
			tx--;ty++ ;
			if(num[tx][ty]==num[x][y])return false ;
			
		}
		tx=x;ty=y ;
		while(tx>=0&&ty>0&&tx<(num.length-1)&&ty<(num.length)){
			tx++;ty-- ;
			if(num[tx][ty]==num[x][y])return false ;
			
		}
		tx=x;ty=y ;
		while(tx>0&&ty>0&&tx<(num.length)&&ty<(num.length)){
			tx--;ty-- ;
			if(num[tx][ty]==num[x][y])return false ;
			
		}
		tx=x;ty=y ;
		while(ty>=0&&ty<num.length-1){
			ty++ ;
			if(num[tx][ty]==num[x][y])return false ;
			
		}
		tx=x;ty=y ;
		while(ty>0&&ty<num.length){
			ty-- ;
			if(num[tx][ty]==num[x][y])return false ;
			
		}
		tx=x;ty=y ;
		while(tx>0&&tx<num.length){
			tx-- ;
			if(num[tx][ty]==num[x][y])return false ;
			
		}
		tx=x;ty=y ;
		while(tx>=0&&tx<num.length-1){
			tx++ ;
			if(num[tx][ty]==num[x][y])return false ;
			
		}
		return true ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		int n = input.nextInt() ;
		num = new int[n][n] ;
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num.length;j++){
				num[i][j] = input.nextInt() ;
				if(num[i][j]==1)step++;
			}
		}
		if(step>=(num.length*num.length)){
		DFS(0,0,0) ;
		}
		System.out.println(count);
		
	}

}
