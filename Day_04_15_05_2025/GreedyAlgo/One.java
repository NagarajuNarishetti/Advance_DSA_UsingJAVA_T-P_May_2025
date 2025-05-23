import java.util.*;
public class One {
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
        String [] input= sc.nextLine().split(" ");
        int [] arr= new int [input.length];
        for(int i=0;i<input.length;i++){
            arr[i]=Integer.parseInt(input[i]);
        }
        /*
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if((arr[i]&1)==1){
                System.out.println("smallest odd = " +arr[i]);
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if((arr[i]&1)==0){
                System.out.println("Largest even = " +arr[i]);
                break;
            }
        }  */
        int l1=arr[0],l2=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>l1){
                l2=l1;
                l1=arr[i];
            }
            else if(arr[i]>l2 && arr[i]!=l1){
                l2=arr[i];
            }
        }
        System.out.println(l1+ " "+l2);

    }    
}
