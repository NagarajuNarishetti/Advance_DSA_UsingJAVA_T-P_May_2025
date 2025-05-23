public class RatInMaze {
    public static boolean isPossible(int[][] arr){
        int row=0;
        int col=0;
        return helper(arr,row,col);
    }
    public static boolean helper(int [][] arr,int row,int col){
        if(row>=arr.length || col>=arr[0].length || arr[row][col]==0){
            return false;
        }
        if(row==arr.length-1 && col==arr[0].length-1){
            return true;
        }
        return helper(arr, row+1, col) || helper(arr, row, col+1);
    }

    public static int countIsPossible(int [][] arr,int row,int col){
        if(row>=arr.length || col>=arr[0].length || arr[row][col]==0){
            return 0;
        }
        if(row==arr.length-1 && col==arr[0].length-1){
            return 1;
        }
        return countIsPossible(arr, row+1, col) + countIsPossible(arr, row, col+1);

    }
    public static void main(String[] args) throws Exception {
        int maze[][]= {{1,0,0,0,0},
                       {1,1,1,0,0},
                       {1,0,1,0,1},
                       {1,0,1,1,1},
                       {1,1,1,0,1}};
        System.out.println(isPossible(maze));
        System.out.println(countIsPossible(maze, 0, 0));
    }
}
