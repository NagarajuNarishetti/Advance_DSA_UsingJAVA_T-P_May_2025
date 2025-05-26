import java.util.Arrays;

public class DoctorsScheduler {
    public static void main(String[] args) {
        int[] a = {900, 945, 1110, 1230, 1235, 1245, 1340, 1700};
        int[] d = {930, 1130, 1120, 1245, 1250, 1415, 1400, 1730};

        Arrays.sort(a);
        Arrays.sort(d);

        int m = a.length;
        int i = 0, j = 0;
        int count = 0, res = 0;

        while (i < m && j < m) {
            if (a[i] < d[j]) {
                count++; // new patient needs a doctor
                res = Math.max(res, count); // track max doctors needed
                i++;
            } else {
                count--; // patient leaves, doctor becomes free
                j++;
            }
        }
        System.out.println("Minimum number of doctors required: " + res);
    }
}
