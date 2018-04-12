import java.util.*;
public class Test05 {
	static class Node{
		String name ;
		boolean know = false ;
		Node left ;
		Node right ;
		public Node(){} ;
		public Node(String name){
			this.name = name ;
		}
	}
	static void createTree(Node root){
		root.left = new Node("v2") ;
		root.right = new Node("v3") ;
		root.left.left = new Node("v4") ;
		root.left.right = new Node("v5") ;
		root.right.left = new Node("v6") ;
		root.right.right = new Node("v7") ;
		root.right.right.left = new Node("v8") ;
	}
	static void dfs(Node root){
		root.know = true ;
		if(root.left!=null) dfs(root.left) ;
		else if(root.left!=null) dfs(root.right) ;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node("v1") ;
		createTree(root) ;
	}

}
