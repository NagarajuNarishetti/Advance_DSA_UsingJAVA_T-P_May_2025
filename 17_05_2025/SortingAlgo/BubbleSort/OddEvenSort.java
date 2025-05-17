import java.util.Arrays;

public class OddEvenSort {
    // odd incresing even decresing
    public static void main(String[] args) throws Exception {
        // int [] arr= {1,2,3,4,5,6,7,8,9,10};
        int [] arr={1,3,16,4,9,8,6,10,2,7};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j] && arr[i]%2!=0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                if(arr[i]<arr[j] && arr[i]%2==0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
