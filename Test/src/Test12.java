import java.util.*;
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		int n = input.nextInt() ;
		String s = input.next();
		char[] str = s.toCharArray() ;
		int[] num = new int[n] ;
		int temp=-1 ,count=0;
		int t = 0;
		for(int i=0;i<str.length;i++){
			if(str[i]=='B'&&i==str.length-1&&temp!=-1) {
				count++ ;
				num[t] = i-temp+1 ;
			}
			else if(str[i]=='B'&&i==str.length-1&&str[i-1]=='W'){
				count++ ;
				num[t]= 1;
			}
			else if(str[i]=='B'&&temp==-1)temp=i ;
			else if(str[i] == 'W'&&temp!=-1){
				count++ ;
				num[t] = i-temp ;
				t++ ;
				temp=-1 ;
			}
			
			
		}
		System.out.println(count);
		for(int i=0;i<count;i++){
			System.out.print(num[i]+" ");
		}
	}

}
