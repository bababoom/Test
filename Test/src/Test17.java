
public class Test17 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = new char[2015] ;
		String s = "abcdefghijklmnopqrs" ;
		StringBuffer sb = new StringBuffer() ;
		for(int i=0;i<106;i++){
			sb.append(s) ;
		}
		String temp = sb.toString() ;
		String val ;
		while(temp.length()!=1){
			val = "" ;
			for(int i=0;i<temp.length();i++){
				if((i+1)%2==0) val += temp.charAt(i) ;
			}
			temp = val ;
		}
		System.out.println(temp);
	}
	

}
