import java.lang.reflect.*;
public class example_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example e = new example(18,"���Ʊ�") ;
		Constructor[] test = e.getClass().getDeclaredConstructors() ;
		for(int i=0;i<test.length;i++){
			Constructor c = test[i] ;
			System.out.println("�鿴�Ƿ��пɱ������Ĳ����� "+c.isVarArgs());
			System.out.println("�ù��췽������ڲ�������Ϊ�� ");
			Class[] p = c.getParameterTypes() ;
			for(int j=0;j<p.length;j++){
				System.out.println(" "+p[j]);
			}
			example e1 = null ;
			
		}
	}

}
