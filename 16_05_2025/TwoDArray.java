public class TwoDArray {
    public static void main(String[] args) throws Exception {
        int [] arr={7,6,5,2,1};
        int [][] mat={{0,1,1,0,1},{1,1,0,0,1},{0,0,0,1,1},{0,1,0,0,0}};
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    sum+=arr[j];
                }
            }
            System.out.println(sum);
        }
    }
}
