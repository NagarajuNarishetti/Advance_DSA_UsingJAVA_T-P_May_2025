import java.util.Scanner;
public class MinDIffEle {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr1 = sc.nextLine().split(" ");
        int[] arr1 = new int[strArr1.length];
        for (int i = 0; i < strArr1.length; i++) {
            arr1[i] = Integer.parseInt(strArr1[i]);
        }
        String[] strArr2 = sc.nextLine().split(" ");
        int[] arr2 = new int[strArr2.length];
        for (int i = 0; i < strArr2.length; i++) {
            arr2[i] = Integer.parseInt(strArr2[i]);
        }
        int x = Integer.parseInt(sc.nextLine());
        int minDiff = Integer.MAX_VALUE;
        int res1 = 0, res2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int sum = arr1[i] + arr2[j];
                int diff = Math.abs(sum - x);
                if (diff < minDiff) {
                    minDiff = diff;
                    res1 = arr1[i];
                    res2 = arr2[j];
                }
            }
        }
        System.out.println(res1+ " " +res2);
    }
}
