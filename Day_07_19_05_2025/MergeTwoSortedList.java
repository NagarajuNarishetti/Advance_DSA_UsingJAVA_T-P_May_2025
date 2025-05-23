import java.util.*;
public class MergeTwoSortedList {
    public static void main(String[] args) throws Exception {
    ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(2,4,5,8,9));
    ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(3,5,6,9,11,12,13));
    ArrayList<Integer> ans= new ArrayList<>();
    int i=0;
    int j=0;

    while(i<list1.size() && j<list2.size()){
        if(list1.get(i)<list2.get(j)){
            ans.add(list1.get(i));
            i++;
        }
        else{
            ans.add(list2.get(j));
            j++;
        }
    }
    while(i<list1.size()){
        ans.add(list1.get(i));
        i++;
    }
    while(j<list2.size()){
        ans.add(list2.get(j));
        j++;
    }
    System.out.println(list1);
    System.out.println(list2);
    System.out.println(ans);
    }
}
