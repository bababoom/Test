import java.util.Scanner;
public class Test07 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[]=new int[120];
        long sum[]=new long[120];     //sum[i]表示前i个数之和
        long f[][]=new long[120][120]; //dp[i][j]表示前i个数中有j个乘号时，所得最大值
        int n,K;
        sum[0]=0; 
        Scanner sc=new  Scanner(System.in);
        n=sc.nextInt();
        K=sc.nextInt();
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
            sum[i]=sum[i-1]+a[i];
        }
        for(int i=1;i<=n;i++)
            f[i][0]=sum[i];
        for(int i=2;i<=n;i++){
             int t = Math.min(i - 1, K);
            for(int j=1;j<=t;j++){ //控制乘的数量
                for(int k=2;k<=i;k++){
                    long s=sum[i]-sum[k-1]; //后面 i-(k-1)数的和，k要<=i
                    f[i][j]=Math.max(f[k-1][j-1]*s, f[i][j]);//j表示乘积数，f[k-1][j-1] 要再乘上一个才是j个乘号，k个数
                }
            }
        }
        System.out.println(f[n][K]);

    }

}
