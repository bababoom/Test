
import java.util.*;
public class Test01{
	static int[] id  ;
	private static byte[] rank ;
	public static int min(int[] num){
		int x = num[0] ;
		for(int i=0;i<num.length;i++){
			if(x>num[i]) x = num[i] ;
		}
		return x ;
	}
	public static void fast_sort(int[][] num,int l,int r){
		if(l<r){
			int i = l, j = r ,x = num[l][2] ;
			int[] X = num[l];
			while(i<j){
				while(i<j&&num[j][2]>=x){
					j-- ;
				}
				if(i<j) {
					num[i] = num[j] ;
					i++ ;
				}
				while(i<j&&num[i][2]<x){
					i++ ;
				} 
				if(i<j){
					num[j]=num[i] ;
					j--;
				}
			}
			num[i] = X;
			fast_sort(num,l,i-1) ;
			fast_sort(num,i+1,r) ;
		}
	}
	public static int find(int x){
		while(x!=id[x]){
			id[x] = id[id[x]] ;
			x = id[x] ;
		}
		return x ;
	}
	public static void union(int q,int p) {
		int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) return;
        if      (rank[rootP] < rank[rootQ]) id[rootP] = rootQ;
        else if (rank[rootP] > rank[rootQ]) id[rootQ] = rootP;
        else {
            id[rootQ] = rootP;
            rank[rootP]++;
        }
	}
	public static int[][] kruskal(int[][] num,int n ){
		int[][] e = new int[n-1][3] ;
		int x = 0 ;
		for(int i=0;i<num.length;i++){
			if(find(num[i][0])!=find(num[i][1])){
				union(num[i][0],num[i][1]) ;
				e[x] = num[i] ;
				x++ ;
			}
		}
		return e ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		int n = input.nextInt() ;
		int p = input.nextInt() ;
		int[] VT = new int[n] ;

		for(int i=0;i<n;i++){
			VT[i] = input.nextInt() ;
		}
		int[][] e = new int[p][3] ;
		for(int i = 0;i<p;i++){
			for(int j=0;j<3;j++) e[i][j] = input.nextInt() ;
		}
		for(int i=0;i<p;i++){
			e[i][2] = e[i][2]*2+VT[e[i][0]-1]+VT[e[i][1]-1] ;
		}
		fast_sort(e,0,e.length-1) ;
		
		id = new int[n+1] ;
		rank = new byte[n+1] ;
		for(int i=0;i<n+1;i++) {
			id[i]=i;
			rank[i] = 0 ;
		}
		e = kruskal(e,n) ;
		long sum = 0 ;
		for(int i=0;i<e.length;i++){
			sum += e[i][2] ;
		}
		sum += min(VT) ;
		System.out.println(sum);
		input.close(); 
		
	}

}
