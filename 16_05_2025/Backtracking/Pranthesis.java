public class Pranthesis {
    private static int t;
    public static void print(String str,int open,int close,int n){
        if(str.length()==2*n){
            System.out.println(str);
            return;
        }
        if(open<n){
            print(str+"(",open+1,close,n);
        }
        if(close<open){
        print(str+")",open,close+1,n);
        }
    }

public static void main(String[] args) throws Exception {
    int n=3;
    print("",0,0,n);
    
}    
}
