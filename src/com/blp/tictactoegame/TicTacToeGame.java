package com.blp.tictactoegame;
import java.util.Scanner;
public class TicTacToeGame
{
        static char player1='X';
        static char player2='O';
        static char[] board = new char[10];
        void  createBoard()
        {
            for (int i = 0; i < 9; i++)
            {
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
            move();
            move();

        }
        static void makeChoice()
        {
            Scanner choice = new Scanner(System.in);
            System.out.println("Enter 1 for choosing X and 2 for choosing O");
            int i = choice.nextInt();

            switch (i) {
                case (1) -> {
                    System.out.println("Player got  'X' character");
                    player1='X';
                    player2='O';
                }
                case (2) -> {
                    System.out.println("Player got 'O' character");
                    player1='O';
                    player2='X';
                }
            }
        }
        static void showBoard()
        {
            for (int i = 1; i < 4; i++)
            {
                System.out.print("|");
                System.out.print(board[i]);
            }
            System.out.println("|");
            for (int i = 4; i < 7; i++)
            {
                System.out.print("|");
                System.out.print(board[i]);
            }
            System.out.println("|");
            for (int i = 7; i < 10; i++)
            {
                System.out.print("|");
                System.out.print(board[i]);
            }
            System.out.println("|");

        }
        static void move() {
            System.out.println("Enter number between 1 to 9");
            Scanner m = new Scanner(System.in);
            int num = m.nextInt();
            System.out.println("Player got the location on board = " + num);
            if (board[(num)] == 'X' | board[num] == 'O')
            {
                System.out.println("Space is not free");
            }
            else
            {
                System.out.println("Space is free");
                //board[num] = (char) num;
                board[num] = player1;
                System.out.println(board[num]);
                System.out.println(num);
                showBoard();
            }
        }
}