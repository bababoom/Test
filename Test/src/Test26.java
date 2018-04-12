import java.util.*;
public class Test26 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		int n = input.nextInt() ;
		int[] num = new int[n] ;
		for(int i=0;i<num.length;i++) num[i] = input.nextInt() ;
		int sum = 0,max = 0 ;
		for(int i=0;i<num.length;i++){
			sum += num[i] ;
			if(sum>max){
				max = sum ;
			}
			if(sum<0){
				sum = 0 ;
			}
		}
		System.out.println(max);
	}

}
