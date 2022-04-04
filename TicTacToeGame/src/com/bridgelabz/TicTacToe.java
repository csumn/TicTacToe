package com.bridgelabz;

public class TicTacToe {

	private char[] board = new char[11];

	public void createBoard() {
		for(int i = 1;i <= 10;i++)
			board[i] = ' ';
	}
}
