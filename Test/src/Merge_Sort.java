import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author 
 * @name 合并排序
 * 
 *
 */
public class Merge_Sort {
	
	/**
	 * 
	 * @param a 待排序数组
	 * @param left
	 * @param right
	 */
	public void sort(int[] a,int left ,int right){
		if(left<right){
			int i = (left+right)/2 ;
			sort(a,left,i) ;
			sort(a,i+1,right) ;
			copy(a,merge(a,left,right,i),left,right) ;
			
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
	 * @param t 带排序的数组  
	 * @param left 
	 * @param right
	 * @param i 中点
	 * @return 返回一个数组，内容是数组t的left 到 right 从小到大有序的一个数组
	 */
	public int[] merge(int[] t,int left,int right,int i){
		int[] temp = new int[right-left+1] ;
		int a = left ,b = i+1 ;
		int k = 0;
		while(a<=i&&b<=right){
			if(t[a]>=t[b]){
				temp[k] = t[b] ;
				b++ ;
				k++ ;
			}else{
				temp[k] = t[a] ;
				a++ ;
				k++ ;
			}
		}
		if(a<=i){
			for(int x = a;x<=i;x++){
				temp[k] = t[x] ;
				k++ ;
			}
		}
		if(b<=right){
			for(int x = b;x<=right;x++){
				temp[k] = t[x] ;
				k++ ;
			}
		}
		
		return temp ;
	}
	
	/**
	 * 
	 * @param a 带排序数组
	 * @param b 一个临时的数组，存放left 到 right 这段距离的从小到大
	 * @param left
	 * @param right
	 * @for 为了将b数组内的数字复制到a数组的left - right 
	 */
	public void copy(int[] a,int[] b,int left, int right){
		int k = 0; 
		for(int i=left;i<=right;i++){
			a[i] = b[k] ;
			k++ ;
		}
	}
	//1-5  1-3 1-2 3 4-5 
	
	public static void main(String[] args){
		long start = System.currentTimeMillis() ;
		Merge_Sort test = new Merge_Sort() ;
		ArrayList<Integer> list = test.getData() ;
		int[] temp =  new int[list.size()];
		
		for(int i=0;i<list.size();i++){
			temp[i] = list.get(i) ;
		}
		
		test.sort(temp, 0, temp.length-1);
		long end = System.currentTimeMillis() ;
		System.out.println("程序运行时间： "+(end-start)+"ms");
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+" ");
		}
	}
}
