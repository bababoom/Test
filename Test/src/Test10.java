import java.util.*;
public class Test10 {
	static class Node{
		int data ;
		boolean isVisited ;
		public Node(int data){
			this.data = data ;
			if(data==0) this.isVisited = true ;
			else this.isVisited = false ;
		}
	}
	public static int dfs(int m,int n,Node[][] num){
		int count = 0 ;
		if(num[m][n].isVisited==true) return 0 ;
		else {
			num[m][n].isVisited = true ;
			count ++ ;
			if(m!=num.length-1) count += dfs(m+1,n,num) ;
			if(n!=0){
				count += dfs(m,n-1,num) ;
			}
			if(n!=num[0].length-1)count+= dfs(m,n+1,num) ;
			if(m!=0) count += dfs(m-1,n,num) ;
		}
		return count ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		int m,n ,x;
		Node[][] num ;
		ArrayList<Integer> list = new ArrayList<Integer>() ;
		while(input.hasNext()){
			m = input.nextInt() ;
			n = input.nextInt() ;
			num = new Node[m][n] ;
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					num[i][j] = new Node(input.nextInt()) ;
				}
			}
			int count = 0 ;
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					int temp = dfs(i,j,num) ;
					count = count<temp? temp:count ;
				}
			}
			list.add(count) ;
			
		}
		 int i = 0 ;
		 input.close();
		while(i<list.size()){
			System.out.println(list.get(i));
			i++ ;
		}
		
	}

}
