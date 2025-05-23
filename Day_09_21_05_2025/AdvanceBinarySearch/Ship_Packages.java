public class Ship_Packages {
    private  static int isPossibleIn(int[] arr, int tc) {
        int c = 1, sum = 0;
        for (int ele : arr) {
            if (ele > tc) {
                return Integer.MAX_VALUE;
            }
            if (sum + ele > tc) {
                c++;
                sum = 0;
            }
            sum += ele;
        }
        return c;
    }

    public  static int shipWithinDays(int[] weights, int days) {
        int sum = 0, m = weights[0];
        for (int ele : weights) {
            sum += ele;
        }
        int s = 1, e = sum;
        int ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isPossibleIn(weights, mid) <= days) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Example input
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        
        // Call the shipWithinDays method and print the result
        int result = shipWithinDays(weights, days);
        System.out.println("Minimum capacity to ship within " + days + " days is: " + result);
    }
}
