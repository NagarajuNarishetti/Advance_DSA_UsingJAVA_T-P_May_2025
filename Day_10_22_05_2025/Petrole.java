public class Petrole {
    public static void main(String[] args) throws Exception {
        // int [] arr={2,3,1,4,2,3,1};
        // int [] arr={2,3,1,0,1,3,0};
        // int [] arr={2,3,1,0,1,3,1};
        // int [] arr={2,2,1,0,1,3,0};
        int [] arr={3,2,1,0,4};
        int p=arr[0];
        for(int i =1;i<arr.length;i++){
            if(p==0){
                System.out.println("Not Possible");
                break;
            }
            p--;
            if(p<arr[i]){
                p=arr[i];
            }
        }
        if(p>0){
            System.out.println("Is possible And LeftOver with "+ p+" Liters of Petrole");
        }
        
    }
}
