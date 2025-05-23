public class Coins {
    // Check if it's possible to reach target using subsets
    public static boolean isPossible(int[] arr, int t, int i) {
        if (t == 0) return true;
        if (t < 0 || i < 0) return false;

        // Option 1: exclude current coin
        boolean exclude = isPossible(arr, t, i - 1);
        // Option 2: include current coin (move to i-1 since we can’t reuse)
        boolean include = isPossible(arr, t - arr[i], i - 1);

        return include || exclude;
    }

    // Minimum number of coins to reach target using subsets (each coin only once)
    public static int minIsPossible(int[] arr, int t, int i) {
        if (t == 0) return 0;
        if (t < 0 || i < 0) return Integer.MAX_VALUE;

        // Exclude current
        int exclude = minIsPossible(arr, t, i - 1);
        // Include current
        int include = minIsPossible(arr, t - arr[i], i - 1);
        if (include != Integer.MAX_VALUE) include += 1;

        return Math.min(include, exclude);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8};
        int target = 14;

        System.out.println(isPossible(arr, target, arr.length - 1)); // true
        int minCoins = minIsPossible(arr, target, arr.length - 1);
        System.out.println(minCoins == Integer.MAX_VALUE ? -1 : minCoins); // Output: 2 (e.g., 6 + 8)
    }
}


/*public class Coins {
    public static boolean isPossible(int[] arr,int t,int i){
     if(t==0){
        return true;
     }
     if(t<0){
        return false;
     }
     if(i<0){
        return false;
     }
     if(arr[i]>t){
       return  isPossible(arr, t, i-1);
     }
     return isPossible(arr, t-arr[i], i);
    }
    public static int minIsPossible(int [] arr,int t,int i){
    if(t==0){
        return 1;
     }
     if(t<0){
        return 0;
     }
     if(i<0){
        return 0;
     }
     if(arr[i]>t){
       return  minIsPossible(arr, t, i-1);
     }
     return minIsPossible(arr, t-arr[i], i)+1;
    }
    public static void main(String[] args) throws Exception {
        int [] arr= {2,4,5,8};
        int target=14;
        System.out.println(isPossible(arr,target,arr.length-1));
        System.out.println(minIsPossible(arr,target,arr.length-1)-1);
    }
} */
