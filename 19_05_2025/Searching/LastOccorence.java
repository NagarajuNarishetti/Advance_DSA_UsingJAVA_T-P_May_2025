public class LastOccorence {
  public static void main(String[] args) throws Exception {
    int [] arr= {2,4,3,1,4,2,3,4,5};
    int t=4;
    boolean isFound=false;
    for(int i=arr.length-1;i>=0;i--){
        if(arr[i]==t){
            System.out.println(i);
            isFound= true;
            break;
        }
    }
    if(!isFound){
        System.out.println(-1);
    }
  }  
}
