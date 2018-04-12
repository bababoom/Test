import java.util.*;
public class Test19 {
	public static boolean judge(int[] num){
		int x = num[0] ;
		for(int i=0;i<num.length;i++){
			if(num[i]!=x) return false ;
		}
		return true ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		int count = 0 ;
		int n = input.nextInt() ;
		int[] num = new int[n] ;
		for(int i=0;i<num.length;i++) {
			num[i] = input.nextInt() ;
		}
		while(!judge(num)){
			for(int i=0;i<num.length;i++){
				int x = num[i]/2 ;
				if(i==0) {
					num[num.length-1] += x ;
					num[i] -= x ;
				}
				else{
					num[i-1] += x ;
					num[i] -= x ;
				}
			}
			for(int i=0;i<num.length;i++){
				if((num[i]%2)!=0){
					num[i]++ ;
					count++ ;
				}
			}
		}
		System.out.println(count);
		
	}

}
