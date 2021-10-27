package com.blp.tictactoegame;

import java.util.Scanner;

public class TicTacToeGame
{
    static char[] board = new char[10];
    void  createBoard() {
        for (int i = 0; i < 9; i++) {
            board[i + 1] = ' ';
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Tic Tac Toe Game");
        TicTacToeGame rv = new TicTacToeGame();
        rv.createBoard();
        makeChoice();
        showBoard();
    }
    static void makeChoice()
    {
        Scanner choice = new Scanner(System.in);
        System.out.println("Enter 1 for X and 2 for O");
        int i = choice.nextInt();
        switch (i)
        {
            case 1:
                System.out.println("Player got  'X' character");
            case 2:
                System.out.println("Player got 'O' character");
        }
    }
    static void showBoard()
    {
        int k=0;
        for (int i = 0; i < 3; i++)
        {
            System.out.print("| ");
            k=i+1;
            for (int j=k; j < k+3; j++)
            {
                System.out.print(board[j]);
                System.out.print( " | ");
            }
            System.out.println();
        }
    }
}
