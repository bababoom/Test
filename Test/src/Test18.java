import java.util.*;
public class Test18 {
	static StringBuffer sb = new StringBuffer() ;
	static ArrayList<String> list = new ArrayList<String> () ;
	static void dfs(int n){
		if(n>8){
			if(sb.length()==8){
				char[] temp = sb.toString().toCharArray() ;
				int a1=-100,a2=-100 ,b1 = -100,b2=-100,c1=-100,c2=-100,d1=-100,d2=-100;
				for(int i=0;i<temp.length;i++){
					if(temp[i]=='1'&&a1<0) a1 = i ;
					else if(temp[i]=='1') a2 = i ;
					if(temp[i]=='2'&&b1<0) b1 = i ;
					else if(temp[i]=='2') b2 = i ;
					if(temp[i]=='3'&&a1<0) c1 = i ;
					else if(temp[i]=='3') c2 = i ;
					if(temp[i]=='4'&&a1<0) d1 = i ;
					else if(temp[i]=='4') d2 = i ;
				}
				if(a2-a1==2&&b2-b1==3&&c2-c1==4&&d2-d1==5) list.add(sb.toString()) ;
			}
			return ;
		}
		if(sb.length()>8){
			return ;
		}
		for(int i=1;i<=4;i++){
			sb.append(String.valueOf(i)) ;
			dfs(n+1) ;
			if(sb.length()!=0){
				sb.deleteCharAt(sb.length()-1) ;
			}
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dfs(1) ;
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
