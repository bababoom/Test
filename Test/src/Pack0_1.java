import java.util.* ;
/*
 * 
 */
public class Pack0_1 {
	
	static int max(int a,int b){
		return a>b?a:b ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		int n = input.nextInt() ;
		int m = input.nextInt() ;
		int[] w = new int[m+1] ;
		int[] p = new int[m+1] ;
		int[][] b = new int[m+1][n+1] ;
		for(int i=1;i<w.length;i++){
			w[i] = input.nextInt() ;
		}
		for(int i=1;i<p.length;i++){
			p[i] = input.nextInt() ;
		}
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				if(i==0||j==0) b[i][j] = 0 ;
				else{
					if(j<w[i]){
						b[i][j] = b[i-1][j] ;
					}else{
						b[i][j] = max(b[i-1][j],p[i]+b[i-1][j-w[i]]) ;
					}
				}
			
		}
	}
		for(int i = 0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

}
}
