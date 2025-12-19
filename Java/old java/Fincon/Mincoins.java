// import java.util.Arrays;
// public class MinCoins {
// 	/**
//      * Given a list of allowed denominations of Indian currency { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 }
// 	 * and a target value N of the currency,
//      * <p>
//      * find the minimum number of coins and/or notes needed to make the change for N.
//      * <p>
//      * You must return the list containing the value of coins required.
//      * <p>
//      * e.g. For the target value Rs. 58, it should return an array containing 1, 2, 5, 50
//      * <p>
//      * You must implement a function with the following signature:
//      * <p>
//      * static int[] minCoins(int[] allowedDenominations, int n)
//      * <p>
//      * <pre>
//      * Constraints:
//      *      allowedDenominations:
//      *          Will be an array of no more than 15 elements, with each element between 1 and 2000, and no duplicates.
//      *      n:
//      *          Will be any value between 1 and 50000
//      * </pre>
//      * <p>
//      * <p>
//      * Time Complexity - O(N)
//      *
//      * @param args
//      */
//     public static void main(String[] args) {
//         int[] allowedDenominations = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
//         int[] inputs = {89, 1200, 253, 790};
//         int[][] expectedOutputs = {{50, 20, 10, 5, 2, 2}, {500, 500, 200}, {200, 50, 2, 1}, {500, 200, 50, 20, 20}};
//         for (int i = 0; i < inputs.length; i++) {
//             System.out.print("Input : " + inputs[i] + ", Result: ");
//             int[] result = minCoins(allowedDenominations, inputs[i]);
//             System.out.println(Arrays.toString(result));
//             System.out.println("Matches expected output - " + Arrays.equals(expectedOutputs[i], result));
//         }
//     }
// 	private static int[] minCoins(int[] allowedDenominations, int n) {
// 		// TODO : Implement
// 		return null;
// 	}
// }

import java.util.ArrayList;

public class Mincoins {

    public static void main(String[] args) {
        int[] inputs = {89, 1200, 253, 790};
        int[] allowedDenominations = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        System.out.println(ans(inputs,allowedDenominations));
    }

    static ArrayList<ArrayList<Integer>> ans(int[] num,int[] allowed){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
          ArrayList<Integer> ans2=new ArrayList<>();
          int amount=num[i];
            for (int j = allowed.length-1; j >=0; j--) {
              // if(allowed[j]>num[i]){
              //   continue;
              // }
              // num[i]=num[i]-allowed[j];
              // ans2.add(allowed[j]);
              while(allowed[j]<=amount){
           amount-=allowed[j];
           ans2.add(allowed[j]);
              }
            }
            ans.add(ans2);
        }
        return ans;
    }
}
