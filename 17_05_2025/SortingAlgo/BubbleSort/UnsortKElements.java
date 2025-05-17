import java.util.Arrays;
public class UnsortKElements {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 7, 6, 56, 1, 6, 5, 3, 22, 8, 9, 1};
        int k = 3;
        int start = k;
        int end = arr.length - k;
        for (int i = 0; i < end - start - 1; i++) {
            boolean isSorted = true;
            for (int j = start; j < end - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}














// import java.util.Arrays;

// public class UnsortKElements {
//     public static void main(String[] args) throws Exception {
//         int [] arr= {3,4,2,7,6,56,1,6,5,3,22,8,9,1};
//         int k=3;
//         for(int i=k-1;i<arr.length-k;i++){
//             boolean isSorted=true;
//             for(int j=i+1;j<arr.length-k;j++){
//                 if(arr[i]>arr[j]){
//                     int temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                     isSorted=false;
//                 }
//             }
//             if(isSorted){
//                     break;
//                 }
//         }
//        System.out.println(Arrays.toString(arr)); 
//     }
// }
