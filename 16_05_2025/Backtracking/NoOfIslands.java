public class NoOfIslands {
    public static void land(int [][] arr,int row,int col,int n){
        if(row==n || col==n|| row<0 || col<0 || arr[row][col]==2 || arr[row][col]==0){
            return;
        }
        if(arr[row][col]==1){
            arr[row][col]=2;
        }
        land(arr,row-1,col,n);
        land(arr,row+1,col,n);
        land(arr,row,col-1,n);
        land(arr,row,col+1,n);
    }
    public static void main(String[] args) throws Exception {
        int mat[][]={{1,0,0,1,1},
                     {1,0,0,0,1},
                     {0,0,0,1,0},
                     {1,0,0,0,0},
                     {1,0,0,0,1}};
        int c=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                    if(mat[i][j]==1){
                        land(mat,i,j,mat.length);
                        c++;
                    }
            }
        }
        System.out.println(c);
        

        
    }
}
