import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 * 
 * @author Administrator
 *
 */
public class Quick_Sort {
	
	/**
	 * 
	 * @param temp 待排序的数组
	 * @param left 
	 * @param right
	 */
	public void Quick_sort(int[] temp,int left,int right){
		if(left<right){
			int m = Partition(temp,left,right) ;
			Quick_sort(temp,left,m-1) ;
			Quick_sort(temp,m+1,right) ;
		}
		
	}
	
	/**
	 * 获取文件中的数据
	 * @return ArrayList 对象
	 */
	public ArrayList<Integer> getData(){
		ArrayList<Integer> list = new ArrayList<Integer>() ;
		File file = new File("src/numbers.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file)) ;
			String s = null;
			while((s=br.readLine())!=null){
				list.add(Integer.valueOf(s)) ;
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list ;
		
	}
	
	/**
	 * 
	 * @param temp 待排序数组
	 * @param left
	 * @param right
	 * @return 返回那个作为基准的数字的索引
	 */
	public int Partition(int[] temp,int left,int right){
		int i = left , j = right ;
		int count = 0 ;
		boolean flag = true ;
		while(i!=j){
			if(temp[j]>=temp[i]){
				if(flag)j-- ;
				else i++ ;
			}
			else{
				int x = temp[i] ;
				temp[i] = temp[j] ;
				temp[j] = x ;
				count ++ ;
				if(count%2==0)flag = true ;
				else flag = false ;
				if(flag)j-- ;
				else i++ ;
				
			}
		}
		return i ;
	}
	public static void main(String args[]){
		long start = System.currentTimeMillis() ;
		Quick_Sort test = new Quick_Sort() ;
		ArrayList<Integer> list = test.getData() ;
		int[] temp =  new int[list.size()];
		
		for(int i=0;i<list.size();i++){
			temp[i] = list.get(i) ;
		}
		
		
		test.Quick_sort(temp, 0, temp.length-1);
		long end = System.currentTimeMillis() ;
		System.out.println("程序运行时间： "+(end-start)+"ms");
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+" ");
		}
		
	}
}
