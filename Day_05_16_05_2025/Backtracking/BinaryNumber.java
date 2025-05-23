public class BinaryNumber {
    public static int t;

    public static void print(String str, int n) {
        if (t == 0) {
            return;
        }
        if (str.length() == n) {
            System.out.println(str);
            t--;
            return;
        }
        print(str + "0", n);
        print(str + "1", n);
    }

    public static void main(String[] args) throws Exception {
        t = 4;
        int n = t;
        int c = (int) (Math.log10(n) / Math.log10(2)) + 1;
        print("", c);
    }
}
