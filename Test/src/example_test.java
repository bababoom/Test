import java.lang.reflect.*;
public class example_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example e = new example(18,"艾云宝") ;
		Constructor[] test = e.getClass().getDeclaredConstructors() ;
		for(int i=0;i<test.length;i++){
			Constructor c = test[i] ;
			System.out.println("查看是否有可变数量的参数： "+c.isVarArgs());
			System.out.println("该构造方法的入口参数依次为： ");
			Class[] p = c.getParameterTypes() ;
			for(int j=0;j<p.length;j++){
				System.out.println(" "+p[j]);
			}
			example e1 = null ;
			
		}
	}

}
