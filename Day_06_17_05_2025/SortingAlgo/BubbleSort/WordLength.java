import java.util.*;
public class WordLength {
    private static void swapInput(String[] arr,int i,int j){
        String temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private static void swaplen(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    String [] input=sc.nextLine().split(" ");
    int [] len= new int[input.length];
    for(int i=0;i<len.length;i++){
        len[i]=input[i].length();
    }
    for(int i=0;i<input.length-1;i++){
        for(int j=0;j<input.length-1-i;j++){
            if(len[j]>len[j+1]){
                swapInput(input,j,j+1);
                swaplen(len,j,j+1);
            }
        }
    }
    System.out.println(Arrays.toString(input));
    StringBuilder ans= new StringBuilder();
    for(String str: input){
        ans.append(str+" ");
    }
    System.out.println(ans);
    }
}
