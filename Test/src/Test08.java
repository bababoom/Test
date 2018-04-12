import java.util.*;
public class Test08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new  Scanner(System.in) ;
		int m,n ;
		m = input.nextInt() ;
		n = input.nextInt() ;
		B_Tree tree = new B_Tree() ;
		tree.create_Tree(m-1, n, tree.root);
		System.out.println(tree.count);
	}

}
class B_Tree{
	class Node{
		Node left ;
		Node right ;
		Node parents ;
		int a=0,b=0 ;
		String name ;
		public Node(String name){
			this.name = name ;
			if(name.equals("A")) a++ ;
			else if(name.equals("B")) b++ ;
		}
		
	}
	Node root ;
	int count = 0 ;
	public B_Tree(){
		root = new Node("B") ;
	}
	public void create_Tree(int m,int n,Node root){
		if(m==0&&n==0){
			count++ ;
			return ;
		}
		if(m!=0){
			root.left = new Node("B") ;
			root.left.parents = root ;
			root.left.a = root.left.a+root.left.parents.a ;
			root.left.b = root.left.b+root.left.parents.b ;
			create_Tree(m-1,n,root.left) ;
		}
		if(n!=0&&root.a<root.b){
			root.right = new Node("A") ;
			root.right.parents = root ;
			root.right.a = root.right.a+root.right.parents.a ;
			root.right.b = root.right.parents.b+root.right.b ;
			create_Tree(m,n-1,root.right) ;
		}
	}
	
}