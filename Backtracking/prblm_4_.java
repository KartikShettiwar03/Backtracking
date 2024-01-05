public class prblm_4_{
    public static boolean isSafe(char board[][],int row,int col){
        //ver up
        for(int i=row-1 ; i>=0 ; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //dia left
        for(int i=row-1 , j=col-1 ; i>=0 && j>=0 ; i-- , j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //dia right
        for(int i=row-1,j=col+1 ; i>=0 && j<board.length ; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }
    public static void nQueens(char board[][],int row){
        if(row==board.length){
            count++;
            print(board);
            return;
        }
        for(int j=0 ; j<board.length ; j++){
            //N queens N rows
            // board[row][j] = 'Q';
            // nQueens(board,row+1);
            // board[row][j] = 'x';


            //N queens
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueens(board,row+1);
                board[row][j] = 'x';
            }
        }
    }
    public static boolean nQueensExist(char board[][],int row){
        if(row==board.length){
            count++;
            return true;
        }
        for(int j=0 ; j<board.length ; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                if(nQueensExist(board,row+1)){
                    return true;
                }
                board[row][j] = 'x';
            }
        }
        return false;
    }
    public static void print(char board[][]){
        System.out.println("**********");
        for(int i=0 ; i<board.length ; i++){
            for(int j=0 ; j<board[0].length ; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int count = 0;
    public static void main(String args[]){
        int n = 4;
        char board[][] = new char[n][n];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                board[i][j] = 'x';
            }
        }
        nQueens(board,0);
        System.out.println(count);
        System.out.println(nQueensExist(board,0));
    }
}