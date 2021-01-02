package subject.year2020.mouth12.day1209;

/**
 * Author : zhangxiaojian
 * Date : 2020/12/9
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0)
                    dp[i][j] = 1;
                else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        
        
        
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.uniquePaths(3,4);
    }
}
