/*
 * 第八届蓝桥杯省赛Java B组填空题 数字1-9共九个数，填到等边三角形，第一层一个数第二层两个数，第三层两个数，第四层四个数，
 * 要求：每个边的数字相加之和相等   通过旋转或对称相同的算是一种  求有几种方式
 */

public class Test21 {
	static int[] num = new int[9] ;
	static int count = 0 ;
	static void dfs(int n){
		if(n>8){
			int x = 1 ;
			while(x<10){
				for(int i=0;i<9;i++){
					if(x == num[i]){
						 break ;
					}
					if(i==8){
						return ;
					}
				}
				x++ ;
			}
			if(((num[0]+num[2]+num[4]+num[8])==(num[5]+num[6]+num[7]+num[8]))&&((num[5]+num[6]+num[7]+num[8])==(num[0]+num[1]+num[3]+num[5]))){
				count++ ;
			}
			return ;
		}
		else{
			for(int i=1;i<10;i++){
				num[n] = i ;
				dfs(n+1) ;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dfs(0) ;
		System.out.println(count/6);
	}

}
