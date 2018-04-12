import java.util.*; 
public class Test14 {
	
	static int ans,n,k ;
	static int[] a,input ;
	static boolean check(int x){
		if(x<2) return false ;
		else for(int i=2;i<Math.sqrt(x)&&x!=2;i++){
			if(x%i==0)return false ;
		}
		return true ;
	}
	 static void dfs(int input[],int pos,int m) //f(被操作数组，所在位置，选m个数)    
	 {    
		    if(m==0)    
		    {    
		        int j,sum=0;    
		        for(j=0;j<n;j++)    
		            if(input[j]==1)    
		                sum+=a[j];    
		        if(check(sum))    
		            ans++;    
		        return;    
		    }    
		    else    
		    {    
		        int i;    
		        for(i=pos;i<n;i++)    
		        {    
		            if(input[i]==0)    
		                input[i]=1;    
		                dfs(input,i+1,m-1);    
		                input[i]=0;    
		        }    
		    }    
		    return;    
		}    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		n = sc.nextInt() ;
		n = sc.nextInt() ;
		a = new int[n] ;
		input = new int[n] ;
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt() ;
		}
		dfs(input,0,k) ;
		System.out.println(ans) ;
	}

}
