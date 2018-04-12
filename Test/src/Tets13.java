import java.util.*;
public class Tets13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		int n = input.nextInt() ;
		int[] num = new int[n] ;
		for(int i=0;i<n;i++){
			num[i] = input.nextInt() ;
		}
		int m = input.nextInt() ;
		for(int i=0;i<n;i++){
			if(num[i] == m){
				System.out.println(++i);
				System.exit(0);
			}
		}
		System.out.println(-1);
	}

}
