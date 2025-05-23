public class ShopKeeper {
     public static boolean lemonadeChange(int[] bills) {
        int c5=0,c10=0;
        for(int i=0;i<bills.length;i++){
           if(bills[i]==5){
            c5++;
           }
           else if(bills[i]==10){
            if(c5!=0){
                c5-=1;
                c10+=1;
            }
            else{
                return false;
            }
           }
           else{
            if(c5!=0 && c10 !=0){
                c5-=1;
                c10-=1;
            }
            else if(c5>=3){
                c5-=3;
            }
            else{
                return false;
            }
           }
        }
        return true;
    }
    public static void main(String[] args) {
        // int []arr={5,10,5,10,10,20};
        // int []arr={5,5,5,20,10};
        int []arr={5,5,5,20};
        //    int [] arr={5,5,5,10,20};
        
            System.out.println(lemonadeChange(arr));
        
    }
}
