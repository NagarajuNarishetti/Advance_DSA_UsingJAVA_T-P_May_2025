/*
 * list 2,3,4,3,2,5,5
 * every number has freq 2 only 1  number will have once
 */
import java.util.*;
public class Four { 
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    ArrayList<Integer> list= new ArrayList<>(Arrays.asList(2,3,4,3,2,5,5));
    int ans = list.get(0);
    for(int i=1;i<list.size();i++){
        ans^=list.get(i);
    }
    System.out.println(ans);
    // System.out.println(2^3^4^3^2^5^5);
    }
}
