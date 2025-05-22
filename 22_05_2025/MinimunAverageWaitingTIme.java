import java.util.Arrays;

public class MinimunAverageWaitingTIme {
    public static void main(String[] args) throws Exception {
        int [] arr={4,3,7,1,6,2};
        Arrays.sort(arr);
        int cwt=0,twt=0;
        for(int i=0;i<arr.length;i++){
            if(i>0)
            twt+=cwt;
            cwt+=arr[i];
        }
        System.out.println((double)twt/arr.length);
    }
}
