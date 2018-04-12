import java.util.Scanner;
public class Test02 {
	static int[] tre ;
	static int[] tremax ;
	static Scanner input   ;
	private static void build(int l,int r, int num){
		if(r==l){
			tre[num] = input.nextInt() ;
			tremax[num] = tre[num] ;
			return ;
		}
		int mid = (r+l)/2 ;
		build(l,mid,2*num) ;
		build(mid+1,r,2*num+1) ;
		tre[num] = tre[2*num] + tre[2*num+1];
		tremax[num] = tremax[2*num]>tremax[2*num+1]? tremax[2*num]:tremax[num*2+1] ;
				
	}
	
	private static void update(int num,int l,int r,int x,int y){
		if(r==l){
			tre[num] = y ;
			tremax[num] = y ;
			return ;
		}
		int mid = (r+l)/2 ;
		if(x<=mid){
			update(2*num,l,mid,x,y) ;
		}else{
			update(2*num+1,mid+1,r,x,y) ;
		}
		tre[num] = tre[num*2] + tre[num*2+1] ;
		tremax[num] = tremax[2*num]>tremax[2*num+1]? tremax[2*num]:tremax[num*2+1] ;
	}
	private static int query(int num,int l,int r,int x,int y){
		if(x<=l&&y>=r){
			return tre[num] ;
		}
		int mid = (r+l)/2 ;
		int ans = 0 ;
		if(x<=mid){
			ans += query(num*2,l,mid,x,y) ;
		}
		if(y>mid){
			ans += query(num*2+1,mid+1,r,x,y) ;
		}
		return ans ;
	}
	private static int querymax(int num,int l,int r,int x,int y){
		if(x<=l&&y>=r){
			return tremax[num] ;
		}
		int mid = (r+l)/2 ;
		int temp = 0 ;
		int max = 0 ;
		if(x<=mid){
			 temp = querymax(num*2,l,mid,x,y) ;
		}
		if(y>mid){
			 max = querymax(num*2+1,mid+1,r,x,y) ;
		}
		return max>temp?max:temp  ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in) ;
		int n = input.nextInt() ;
		int m = input.nextInt() ;
		tre = new int[(n+1)*4] ;
		tremax = new int[(n+1)*4] ;
		build(1,n,1) ;
		int[][] temp = new int[m][3] ;
		for(int i=0;i<m;i++){
			temp[i][0] = input.nextInt() ;
			temp[i][1] = input.nextInt() ;
			temp[i][2] = input.nextInt() ;
		}
		for(int i = 0 ;i<m;i++){
			if(temp[i][0] == 1){
				update(1,1,n,temp[i][1],temp[i][2]) ;
			}else if(temp[i][0] == 2){
				System.out.println(query(1,1,n,temp[i][1],temp[i][2]));
			}else if(temp[i][0] == 3){
				System.out.println(querymax(1,1,n,temp[i][1],temp[i][2]));
			}
		}
		
	}

}
