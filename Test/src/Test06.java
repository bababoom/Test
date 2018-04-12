
public class Test06 {
public static int Index(String S,String T){
	char[] cs = S.toCharArray() ;
	char[] ct = T.toCharArray() ;
	int i=0,j=0;
	while(i<cs.length&&j<ct.length){
		if(cs[i]==ct[j]){
			++i;
			++j;
		}else{
			i = i-j+1 ;
			j=1 ;
		}
	}
	if(j>ct.length-1) return i-ct.length+1 ;
	else return 0 ;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=0;i++){
			System.out.println(i);
		}
		System.out.println(6);
	}

}
