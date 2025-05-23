import java.util.Arrays;

public class MaximumPeople {
    public static void main(String[] args) {
        int [] ppl={1,6,2,3,4,5};
        int [] bdl={4,2,3,1,1,2};
        Arrays.sort(ppl);
        Arrays.sort(bdl);
        int j=0,c=0;
        System.out.println(Arrays.toString(ppl));
        System.out.println(Arrays.toString(bdl));
        for(int i=0;i<ppl.length && j<bdl.length;){
            if(ppl[i]<=bdl[j]){
                c++;
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        System.out.println(c);
    }
}
