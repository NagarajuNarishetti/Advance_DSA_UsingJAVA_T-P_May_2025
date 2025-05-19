import java.util.*;

public class KthLargestInUnsorted {

    // With Considering Frequency (duplicates are treated as one for determining kth largest)
    private static void withConsideringFreq(int[] arr, int k) {
        int maxi = arr[0];
        // Find the maximum element in the array to size the count array
        for (int ele : arr) {
            if (ele > maxi) {
                maxi = ele;
            }
        }

        // Count frequency of each element
        int[] count = new int[maxi + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int i;
        // Traverse count array from the end (max value to min value)
        for (i = count.length - 1; i >= 0; i--) {
            if (count[i] > 0) {
                k--;  // Decrement k for each element found
                if (k == 0) {
                    System.out.println("Kth largest with considering frequency: " + i);
                    return;
                }
            }
        }
    }

    // Without Considering Frequency (duplicates are treated as separate entities)
    private static void withOutConsideringFreq(int[] arr, int k) {
        int maxi = arr[0];
        // Find the maximum element in the array to size the count array
        for (int ele : arr) {
            if (ele > maxi) {
                maxi = ele;
            }
        }

        // Count the presence of each element (mark as 1 for presence)
        int[] count = new int[maxi + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]] = 1;
        }

        int i;
        // Traverse count array from the end (max value to min value)
        for (i = count.length - 1; i >= 0; i--) {
            if (count[i] == 1) {
                k--;  // Decrement k for each unique element
                if (k == 0) {
                    System.out.println("Kth largest without considering frequency: " + i);
                    return;
                }
            }
        }
    }

    // Without considering frequency, decrement k for each occurrence
    private static void withOutConsideringFreqWithDecrementForAllOccurrences(int[] arr, int k) {
        int maxi = arr[0];
        // Find the maximum element in the array to size the count array
        for (int ele : arr) {
            if (ele > maxi) {
                maxi = ele;
            }
        }

        // Count frequency of each element
        int[] count = new int[maxi + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int i;
        // Traverse count array from the end (max value to min value)
        for (i = count.length - 1; i >= 0; i--) {
            // Decrement k for each occurrence of the element
            if (count[i] > 0) {
                k -= count[i];  // Decrement k by the frequency of the element
                if (k <= 0) {
                    System.out.println("Kth largest without considering frequency: " + i);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 13, 4, 2, 9, 9, 5, 8, 7, 13, 13, 3};

        // Find the 4th largest element considering duplicates as one entity
        withOutConsideringFreq(arr, 4);

        // Find the 4th largest element considering duplicates as separate
        withConsideringFreq(arr, 4);

        // Find the 4th largest element without considering frequency (proper logic)
        withOutConsideringFreqWithDecrementForAllOccurrences(arr, 4);
        int []t= new int[5];
        System.out.println(Arrays.toString(t));
    }
}






// import java.util.*;
// public class KthLargestInUnsorted {
//     // NOT TO BE USED WHEN MAX VALUE IS SO HIGH USE MERGE THAT TIME
//     private static void withConsideringFreq(int [] arr,int k){
//         int maxi=arr[0];
//         for(int ele:arr ){
//             if(ele>maxi){
//                 maxi=ele;
//             }
//         }
//         int [] count= new int[maxi+1];
//         for(int i=0;i<arr.length;i++){
//             count[arr[i]]+=1;
//         }
//         int i;
//         for(i=count.length-1;i>=0 && k>1;i--){
//             if(count[i]>0){
//                 k-=count[i];
//             }
//         }
//         System.out.println(i);
//     }

//         private static void withOutConsideringFreq(int [] arr,int k){
//         int maxi=arr[0];
//         for(int ele:arr ){
//             if(ele>maxi){
//                 maxi=ele;
//             }
//         }
//         int [] count= new int[maxi+1];
//         for(int i=0;i<arr.length;i++){
//             count[arr[i]]=1;
//         }
//         int i;
//         for(i=count.length-1;i>=0 && k>0;i--){
//             if(count[i]==1){
//                 k--;
//             }
//         }
//         System.out.println(i);
//     }

//     public static void main(String[] args) throws Exception {
//         int [] arr= {2,13,4,2,9,9,5,8,7,13,13,3};
//         withOutConsideringFreq(arr,4);
//         withConsideringFreq(arr,4);
        
//     }
// }
