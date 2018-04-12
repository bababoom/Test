import java.util.*;
public class Test04 {
	static Scanner input ;
	static Vex[] vex ;
	static class Vex{
		int[] num ;
		public Vex(){} ;
		public Vex(int m){
			num = new int[m] ;
		}
	}
	private static void init(int n,int m){
		vex = new Vex[n+1] ;
		for(int i=1;i<=n ;i++){
			vex[i] = new Vex(m+1) ;
		}
	}
	private static void change(int p,int x,int y){
		vex[x].num[p] = 1 ;
		vex[y].num[p] = -1 ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in) ;
		int n = input.nextInt() ;
		int m = input.nextInt() ;
		init(n,m) ;
		int x,y ;
		for(int i=1;i<=m;i++){
			x = input.nextInt() ;
			y = input.nextInt() ;
			change(i,x,y) ;
		}
		for(int i= 1;i<=n;i++){
			for(int j = 1;j<=m;j++){
				System.out.print(vex[i].num[j]+" ");
			}
			System.out.println();
		}
	}

}
