//ÅÆĞÍÖÖÊı
public class Test16 {
	static int sum = 0 ,ans = 0 ;
	static void dfs(int n){
		if(n>13){
			if(sum==13){
				ans += 1 ;
			}
			return ;
		}
		if(sum>13)return ;
		else{
			for(int i=0;i<=4;i++){
				sum += i ;
				dfs(n+1) ;
				sum -= i ;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 dfs(1) ;
		 System.out.println(ans);
	}

}
