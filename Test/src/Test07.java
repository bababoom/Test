import java.util.Scanner;
public class Test07 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[]=new int[120];
        long sum[]=new long[120];     //sum[i]��ʾǰi����֮��
        long f[][]=new long[120][120]; //dp[i][j]��ʾǰi��������j���˺�ʱ���������ֵ
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
            for(int j=1;j<=t;j++){ //���Ƴ˵�����
                for(int k=2;k<=i;k++){
                    long s=sum[i]-sum[k-1]; //���� i-(k-1)���ĺͣ�kҪ<=i
                    f[i][j]=Math.max(f[k-1][j-1]*s, f[i][j]);//j��ʾ�˻�����f[k-1][j-1] Ҫ�ٳ���һ������j���˺ţ�k����
                }
            }
        }
        System.out.println(f[n][K]);

    }

}
