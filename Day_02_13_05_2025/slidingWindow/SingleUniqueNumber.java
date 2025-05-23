import java.util.*;
// can be solved using XOR O(n)
// using Sliging window dobuble jump O(n/2)
// using binary search O(log n) use no of elements are even or odd and choose the half
public class SingleUniqueNumber {
    public static int bs(ArrayList<Integer> list){
        int n=list.size();
        int start=0;
        int end=n-1;
        int mid=start+(end-start)/2;
        
        

        return 0;
    }
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,2,4,4,6,6,7,7,8,8,9));
        for(int i=0;i<list.size()-1;i+=2){
            if(list.get(i)!=list.get(i+1)){
                System.out.println(list.get(i));
                break;
            }
        }
        if(list.get(list.size()-1)!=list.get(list.size()-2)){
            System.out.println(list.get(list.size()-1));
        }
    }
}
