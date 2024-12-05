public class StockProblem {
    public static void main(String[] args) {
        int[] prices = {2, 1, 4, 5, 7, 8};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
       
        int min_Value = Integer.MAX_VALUE; 
        int max_Value = 0; 

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min_Value){
                min_Value = prices[i];
            }else if( prices[i] - min_Value > max_Value){
                max_Value = prices[i] - min_Value;
            }
        }
        return max_Value;
        

    }
}
