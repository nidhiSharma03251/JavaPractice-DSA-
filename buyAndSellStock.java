public class buyAndSellStock {

    public static int maximumProfit(int prices[]){
        int bestBuy = prices[0];
        int maxPro = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i] > bestBuy){
                maxPro = Math.max(maxPro, prices[i]-bestBuy);
                // maxPro =  prices[i]-bestBuy;
            }else{
                bestBuy = Math.min(bestBuy, prices[i]);
            }
        }
        return maxPro;
    }
    public static void main(String args[]){
        int prices[] = {7,6,8,2,5,9};

        System.out.println("MAx profit = " + maximumProfit(prices)); 
    }
}
