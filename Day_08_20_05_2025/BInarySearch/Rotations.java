public class Rotations {
    private static int rotatatedAt(int []arr){
        int s=0,e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[e] ){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        if(s==arr.length){
            s=0;
        }
        return s;
    }
    private static int noOfRotations(int [] arr){
         int s=rotatatedAt(arr);
         return s;
    }

    public static void main(String[] args) throws Exception {
        // int [] arr= {20,30,2,4,8,15};
        int [] arr={4,5,6,7,8,1,2,3}; // 1 2 3 4 5 6 7 8 9 
        // System.out.println("Rotated At  = "+(arr.length-rotatatedAt(arr)));
        System.out.println("Rotated At  = "+rotatatedAt(arr));
        System.out.println("No of Rotations = "+noOfRotations(arr));
        
    }
}
