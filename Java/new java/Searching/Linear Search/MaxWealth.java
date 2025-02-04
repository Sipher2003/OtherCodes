//leetcode 1672:Richest Customer Wealth

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        System.out.println(sum(arr));
    }

    static int sum(int[][] accounts) {
       
        int max = 0;
        for (int rows = 0; rows < accounts.length; rows++) {
            int sum = 0;
            for (int cols = 0; cols < accounts[rows].length; cols++) {
                sum += accounts[rows][cols];

            }
            if (sum>max) {
                max = sum;
            }
            
        }
        return max;
       

    }
}
