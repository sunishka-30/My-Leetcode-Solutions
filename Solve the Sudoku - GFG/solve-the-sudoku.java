//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int grid[][] = new int[9][9];
            for(int i = 0; i < 9; i++)
            {
                for(int j = 0; j < 9; j++)
                grid[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            if(ob.SolveSudoku(grid) == true)
                ob.printGrid(grid);
            else
                System.out.print("NO solution exists");
            System.out.println();
            
        }
    }
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int board[][])
    {
        // add your code here
        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==0)
                {
                    for(int k= 1; k<=9;k++)
                    {
                        if(isPossible(board,i,j,k))
                        {
                            board[i][j]=k;
                            if(SolveSudoku(board))
                                return true;
                            else{
                                board[i][j]=0;
                            }
                        }
                    }
                    return false;
                }
            }
            
        }
        return true;
        
    }
    
     static boolean isPossible(int[][]board, int row, int col, int k)
    {
        for(int i=0;i<9;i++)
        {
            if(board[row][i]==k)
                return false;
            if(board[i][col]==k)
                return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3] ==k)
                return false;
            
        }
        
        return true;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int board[][])
    {
        // add your code here
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                
                System.out.print(board[i][j]+" ");
            }
            
            //System.out.println();
        }
    }
}


