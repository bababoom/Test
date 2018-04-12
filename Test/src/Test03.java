import java.util.*;
public class Test03 {
	static Scanner input ;
	static Node root ;
	static class Node{
		Node left ;
		Node right ;
		int sum ;
		int max ;
		
		
	}
	private static void build(int l,int r,Node root){
		if(l==r){
			root.sum = input.nextInt() ;
			root.max = root.sum ;
			return  ;
		}
		Node a = new Node() ;
		Node b = new Node() ;
		root.left = a ;
		root.right = b ;
		int mid = (r+l)/2 ;
		build(l,mid,a) ;
		build(mid+1,r,b) ;
		root.sum = root.left.sum+root.right.sum ;
		root.max = root.left.max>root.right.max? root.left.max:root.right.max ;
		
	}
	private static void update(int l,int r,int n,int y,Node root){
		if(r==l){
			root.sum = y ;
			root.max = y ;
			return ;
		}
		int mid = (r+l)/2 ;
		if(n<=mid){
			update(l,mid,n,y,root.left) ;
		}else{
			update(mid+1,r,n,y,root.right) ;
		}
		root.sum = root.left.sum+root.right.sum ;
		root.max = root.left.max>root.right.max? root.left.max:root.right.max ;
	}
	private static int querysum(int l,int r,int x,int y,Node root){
		if(x<=l&&y>=r){
			return root.sum ;
		}
		int mid  = (r+l)/2 ;
		int ans = 0 ;
		if(x<=mid){
			ans += querysum(l,mid,x,y,root.left) ;
		}
		if(y>mid){
			ans += querysum(mid+1,r,x,y,root.right) ;
		}
		return ans ;
	}
	private static int querymax(int l,int r,int x,int y,Node root){
		if(x<=l&&y>=r){
			return root.max ;
		}
		int mid = (r+l)/2 ;
		int temp = 0 ;
		int max = 0 ;
		if(x<=mid){
			 temp = querymax(l,mid,x,y,root.left) ;
		}
		if(y>mid){
			 max = querymax(mid+1,r,x,y,root.right) ;
		}
		return max>temp?max:temp  ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in) ;
		int n = input.nextInt() ;
		int m = input.nextInt() ;
		root = new Node() ;
		build(1,n,root) ;
		int[][] temp = new int[m][3] ;
		for(int i=0;i<m;i++){
			temp[i][0] = input.nextInt() ;
			temp[i][1] = input.nextInt() ;
			temp[i][2] = input.nextInt() ;
		}
		for(int i = 0 ;i<m;i++){
			if(temp[i][0] == 1){
				update(1,n,temp[i][1],temp[i][2],root) ;
			}else if(temp[i][0] == 2){
				System.out.println(querysum(1,n,temp[i][1],temp[i][2], root));
			}else if(temp[i][0] == 3){
				System.out.println(querymax(1,n,temp[i][1],temp[i][2],root));
			}
		}
	}

}
