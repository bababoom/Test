/*
 * �ڰ˽����ű�ʡ��Java B������� ����1-9���Ÿ�������ȱ������Σ���һ��һ�����ڶ����������������������������Ĳ��ĸ�����
 * Ҫ��ÿ���ߵ��������֮�����   ͨ����ת��Գ���ͬ������һ��  ���м��ַ�ʽ
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
