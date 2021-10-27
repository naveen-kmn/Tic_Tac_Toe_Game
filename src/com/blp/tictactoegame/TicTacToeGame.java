package com.blp.tictactoegame;
public class TicTacToeGame
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Tic Tac Toe Game");
        createABoard();
    }

    static char[] createABoard()
    {
        char[] board = new char[10];
        for (int i = 0; i < 9; i++)
        {
            board[i+1] = ' ';
        }
        return null;
    }
}
