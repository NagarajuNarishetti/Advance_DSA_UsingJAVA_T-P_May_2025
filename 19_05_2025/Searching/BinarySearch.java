public class BinarySearch {
    private static int bs(int [] arr,int t){
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
     return -1;
    }
    private static int bsLastIndex(int [] arr,int t){
     int s=0;
     int e=arr.length-1;
     while(s<=e){
        int mid=s+(e-s)/2;
        if(arr[mid]==t){
            if(arr[mid+1]==t){
                s=mid+1;
            }
            else{
                return mid;
            }
        }
        else if(arr[mid]>t){
            e=mid-1;
        }
        else{
            s=mid+1;
        }
     }
     return -1;
    }
    public static void main(String[] args) throws Exception {
        int [] arr={2,3,5,6,7,7,8,9,10,10,13,13,13,15};
        int t=13;
        System.out.println(bs(arr, t));
        System.out.println(bsLastIndex(arr, t));

        
    }
}