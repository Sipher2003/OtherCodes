public class BuySellStock {
    public static void main(String[] args) {

        int [] arr={7,6,4,3,1};

       System.out.println( MaxProfit2(arr));;
    }

   // fails hidden testcase as time limit exceeds because of O(n2)
    static int MaxProfit(int[] prices) {

        int maxp=0;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i+1; j < prices.length; j++) {
              maxp=Math.max(maxp, prices[j]-prices[i]);        
            }
        }

        return maxp;
    }

    static int MaxProfit2(int[] prices){
        int min=Integer.MAX_VALUE;
        int max=0;

        //for each loop
        for(int price:prices){
            if(price<min){
                min=price;
            }
            else{
                max=Math.max(max, price-min);
            }
        }

        return max;
    }

}
