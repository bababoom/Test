import java.util.* ;
public class Test28 {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0 ;
        ArrayList<Integer> list = new ArrayList<>() ;
        if(nums1.length!=0){
            for(int i=0;i<nums1.length;i++){
                list.add(nums1[i]) ;
            }
            for(int i=0;i<nums2.length;i++){
                for(int j=0;j<list.size();j++){
                    if(nums2[i]<=list.get(j)){
                        list.add(j,nums2[i]) ;
                        break ;
                    }
                    if(j==list.size()-1){
                    	list.add(nums2[i]) ;
                    	break ;
                    }
                  
                }
            }
        }else {
            for(int i=0;i<nums2.length;i++){
                list.add(nums2[i]) ;
            }
        }
        for(int i=0;i<list.size();i++){
        	System.out.print(list.get(i)+" ");
        }
        System.out.println();
        int x = list.size()/2 ;
        if(list.size()%2==0){
            median = (list.get(x-1)+list.get(x))/2.0 ;
        }else{
            median = list.get(x) ;
        }
        return median ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 987654321 ;
		double p = (double)x*10 ;
		x =x*10 ;
		System.out.println(p);
		
		System.out.println(x);
	}

}
