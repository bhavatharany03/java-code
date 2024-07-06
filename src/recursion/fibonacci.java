package recursion;

public class fibonacci {
//    int[] strg = new int[];
    public static void main(String[] args) {
        int n = 43;
        int[] strg = new int[n+1];
        int res = Fibo(100,strg);
        System.out.print(res);
    }
  /// Recursion
//    public static int fibo(int n) {
//        if (n == 0 || n == 1) {
//            return n;
//        }
//        return fibo(n - 1) + fibo(n - 2);
//    }


    ////// Top downapproach

    public static  int Fibo(int n,int[] strg){
        if(n==0 || n==1){
            return n;
        }
        int fnm1 = Fibo(n-1,strg);
        int fnm2 = Fibo(n-2,strg);
        strg[n] = fnm1 + fnm2;
        return strg[n];
    }

    /// bottomup approach
    public static int Fib(int n){
        int[] strg = new int[n+1];
        strg[0]=0;
        strg[1]=1;
        for(int i=0;i<=n;i++){
            strg[i]=strg[i-1]+strg[i-2];
        }
        return strg[n];
    }
}



