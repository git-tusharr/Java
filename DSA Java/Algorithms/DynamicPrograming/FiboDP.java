class FiboDP{
    static int fibo(int n,int dp[]){
        if(n<=1) return n;

        if(dp[n]!=-1) return dp[n];

        dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
        return dp[n];

    }

    public static void main (String args[]){
        int n=6;
        int dp[]=new int[n+1];
        for(int i=0;i<dp.length;++i){
            dp[i]=-1;
        }
        System.out.println(fibo(n,dp));
    }
}