import java.util.*;
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		int n = input.nextInt() ;
		String s = input.next();
		int[] num = new int[n] ;
		for(int i=0;i<n;i++) num[i] = input.nextInt() ;
		char[] cha = s.toCharArray() ;
		int temp = -1 ,count=Integer.MAX_VALUE;
		for(int i=0;i<cha.length;i++){
			if(cha[i]=='R'){
				temp=i ;
			}
			if(cha[i]=='L'&&temp!=-1){
				count = Math.min(count, num[i]-num[temp]) ;
			}
		}
		if(count==Integer.MAX_VALUE)System.out.println(-1);
		else System.out.println(count/2);
	}

}
