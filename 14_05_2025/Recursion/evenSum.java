public class evenSum {
    static int sum=0;
    public static int es(int arr[],int i){
        if(i==arr.length){
            return 0;
        }
        // This by declaring a sum variable in global
        /*
        if((arr[i]&1)==0){
            sum+=arr[i];
        }
        es(arr,i+1);
        return sum;
         */
        // by using else
        /*
        if((arr[i]&1)==0){
            return arr[i]+es(arr,i+1);
        }
        else{
            return es(arr,i+1);
        }
         */

        //with out else
        if((arr[i]&1)==0){
            sum+=arr[i];
            return arr[i]+es(arr,i+1);
        }
        return es(arr,i+1);

    }
public static void main(String[] args) throws Exception {
// Scanner sc=new Scanner(System.in);
int [] arr= {2,5,6,7,2,1,4,3,6};
System.out.println(es(arr,0));
    
}    
}
