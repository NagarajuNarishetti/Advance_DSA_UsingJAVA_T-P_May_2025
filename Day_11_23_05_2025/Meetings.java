import java.util.*;

public class Meetings {
    public static void main(String[] args) {
        int [] arr1={0,3,8,1,5,7,9};
        int [] arr2={5,6,10,2,6,9,11};
        // HashMap<Integer,Integer> map= new HashMap<>();
        Integer  temp[][]=new Integer[arr1.length][2];
        for(int i=0;i<arr1.length;i++){
            temp[i][0]=arr1[i];
            temp[i][1]=arr2[i];
        }
        System.out.println(Arrays.deepToString(temp));
        Arrays.sort(temp,(a,b)-> a[1]-b[1]);
        System.out.println(Arrays.deepToString(temp));
        int c=0,end=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i][0]>end){
                c++;
                end=temp[i][1];
            }
        }
        System.out.println(c);
    }
}
