public class InsertAtInSortedList {
    private static int  bs (int [] arr,int t){
     int s=0;
     int e=arr.length-1;

     while(s<=e){
        int mid=s+(e-s)/2;
        if(arr[mid]==t){
            return mid;
        }
        if(arr[mid]>t){
            e=mid-1;
        }
        else{
            s=mid+1;
        } 
     }
     return s;
    }
    public static void main(String[] args) throws Exception {
        int [] arr={2,4,8,10,15,20,30};
        int t=4;
        System.out.println(bs(arr, t));
    }
}
