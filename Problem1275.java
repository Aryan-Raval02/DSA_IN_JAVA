public class Problem1275 
{
    public static String tictactoe(int[][] moves) 
    {
        if(moves.length < 5) return "Pending";

        char[][] board = new char[3][3];
        char sign = 'A';

        for(int[] move : moves)
        {
            int r = move[0];
            int c = move[1];

            board[r][c] = sign;

            sign = (sign == 'A') ? 'B' : 'A';
        }

        for(int i=0; i<3; i++)
        {
            if(board[i][0] != 0 && board[i][0] == board[i][1] && board[i][1] == board[i][2])
            {
                return String.valueOf(board[i][0]);
            }
            if(board[0][i] != 0 && board[0][i] == board[1][i] && board[1][i] == board[2][i])
            {
                return String.valueOf(board[0][i]);
            }
        }

        if(board[0][0] != 0 && board[0][0] == board[1][1] && board[1][1] == board[2][2])
        {
            return String.valueOf(board[0][0]);
        }
        if(board[0][2] != 0 && board[0][2] == board[1][1] && board[1][1] == board[2][0])
        {
            return String.valueOf(board[2][0]);
        }

        if(moves.length ==  9) return "Draw"; 
        return "Pending";
    }
    public static void main(String[] args) 
    {
        
    }
}
