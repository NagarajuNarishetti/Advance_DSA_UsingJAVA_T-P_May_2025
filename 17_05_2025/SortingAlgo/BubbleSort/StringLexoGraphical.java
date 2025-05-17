import java.util.*;
public class StringLexoGraphical {
    private static void swap(ArrayList<String> list,int i,int j){
        String temp=list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
    public static void BubbleSort(ArrayList<String> list){
        for(int i=0;i<list.size()-1;i++){
            boolean isSorted=true;
            for(int j=0;j<list.size()-1-i;j++){
                if(list.get(j).compareTo(list.get(j+1))>0){
                    swap(list,j,j+1);
                    isSorted=false;
                }
            }
            if(isSorted){
                break;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        // ArrayList<String> list= new ArrayList<>(Arrays.asList("zebra","cet","apple","cat"));
        ArrayList<String> list= new ArrayList<>(Arrays.asList("school","car","hello","bet","apple","cat","bat"));
        BubbleSort(list);
        System.out.println(list);

    }
}
