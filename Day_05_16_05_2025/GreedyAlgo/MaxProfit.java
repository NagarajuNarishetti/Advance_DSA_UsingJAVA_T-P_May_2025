package GreedyAlgo;
public class MaxProfit{
    public static int goldMaxProfit(int []arr){
        int sell=0;
        int profit=0;
        int  buy=arr[0];
        for(int i=1;i<arr.length;i++){//i=4 buy=2  sell=5
            if(arr[i]<buy){
                buy=arr[i];
            }
            if(arr[i]-buy>profit){
                sell=arr[i];
                profit=Math.max(profit,sell-buy);
            }
        }
        return profit;
    }
    public static void main(String[] args) throws Exception {
        // int [] arr={2,4,1,5,8,6,4,7};
        int [] arr= {13,14,2,5,8,1,4,7};
        System.out.println(goldMaxProfit(arr));
    }
}