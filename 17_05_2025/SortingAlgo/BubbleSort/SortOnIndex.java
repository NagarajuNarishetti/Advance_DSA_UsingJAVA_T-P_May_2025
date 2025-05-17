import java.util.*;
// [[2,3],[5,7],[8,1],[3,1],[7,6]] sort in incresing of 2nd element
public class SortOnIndex {
    private static void swap(ArrayList<ArrayList<Integer>> list,int i,int j){
    ArrayList<Integer> temp=list.get(i) ;
    list.set(i,list.get(j));
    list.set(j,temp);

    }
    public static void main(String[] args) throws Exception {
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(2,3)));
        list.add(new ArrayList<>(Arrays.asList(5,7)));
        list.add(new ArrayList<>(Arrays.asList(8,1)));
        list.add(new ArrayList<>(Arrays.asList(3,1)));
        list.add(new ArrayList<>(Arrays.asList(7,6)));
        System.out.println(list);
        for(int i=0;i<list.size()-1;i++){
            for(int j=0;j<list.size()-1-i;j++){
                if((list.get(j)).get(1)>(list.get(j+1).get(1))){
                    swap(list,j,j+1);
                }
            }
        }
        System.out.println(list);
    }
}
