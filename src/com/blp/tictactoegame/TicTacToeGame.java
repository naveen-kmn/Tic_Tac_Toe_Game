package com.blp.tictactoegame;

import java.util.Scanner;

public class TicTacToeGame
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Tic Tac Toe Game");
        createABoard();
        makeChoice();

    }

    static char[] createABoard()
    {
        char[] board = new char[10];
        for (int i = 0; i < 9; i++) {
            board[i + 1] = ' ';
        }
        return null;
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
                System.out.println("Computer got 'O' character");
        }
    }
}
