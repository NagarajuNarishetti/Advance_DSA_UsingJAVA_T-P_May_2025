import java.util.*;
//['c','f','z','a'];
public class charStort {
    private static void swap(char[] arr, int i,int j){
        char temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void main(String[] args) throws Exception {
        char[] arr= {'c','f','z','a'};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if((arr[j])>(arr[j+1])){
                        swap(arr,j,j+1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
