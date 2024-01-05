public class prblm_5_{
    public static int solve(int n,int m,int i,int j){
        if(i==n-1 && j==n-1){
            return 1;
        }
        if(i>=n || j>=m){
            return 0;
        }
        int downWays = solve(n,m,i+1,j);
        int rightWays = solve(n,m,i,j+1);
        return rightWays+downWays;
    }
    public static void main(String args[]){
        int n = 7;
        int m = 3;
        System.out.println(solve(m,n,0,0));
    }
}