import java.util.*;
public class Frog {
    public static int countIsPossible(int row,int col,ArrayList<ArrayList<Integer>> list){
        if(row>=5 || col>=5 || list.contains(new ArrayList<>(Arrays.asList(row,col)))){
            return 0;
        }
        if(row==4 && col==4){
            return 1;
        }
        return countIsPossible(row+1, col,list) + countIsPossible(row, col+1,list);

    }
    public static void main(String[] args) throws Exception {
        int maze[][]= {{1,1,1,1,1},
                       {0,1,1,1,1},
                       {1,1,1,1,0},
                       {0,1,1,1,1},
                       {1,0,1,1,1}};
        int n=1,m=2;
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(1, 0)));
        list.add(new ArrayList<>(Arrays.asList(3, 0)));
        list.add(new ArrayList<>(Arrays.asList(4, 1)));
        list.add(new ArrayList<>(Arrays.asList(2, 4)));
        System.out.println(countIsPossible(n,m,list));
    }
}