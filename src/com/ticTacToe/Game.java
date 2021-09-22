package com.ticTacToe;

import com.ticTacToe.players.IPlayer;
import com.ticTacToe.strategies.IWinnerSelectionStrategy;

public class Game {

	Board board;
	IPlayer player1;
	IPlayer player2;
	boolean currentPlayer;
	IWinnerSelectionStrategy winnerSelectionStrategy;
	
	public Game(int boardDimentions, IPlayer player1, IPlayer player2,IWinnerSelectionStrategy winnerSelectionStrategy ) {
		board = new Board(boardDimentions);
		this.player1 = player1;
		this.player2 = player2;
		currentPlayer = true;
		this.winnerSelectionStrategy = winnerSelectionStrategy;
	}
	IPlayer getCurrentPlayer() {
		return currentPlayer? player1 : player2;
	}
	void updateCurrentPlayer() {
		currentPlayer = !currentPlayer;
	}	

	void run() {
		int totalTurns = board.getDimentions() * board.getDimentions();
		int turns = 0;
		
		while(turns < totalTurns) {
			board.print();
			IPlayer currentPlayer = getCurrentPlayer();
			System.out.println("Player "+currentPlayer.symbol+"'s turn");
			currentPlayer.makeMove(board);
			int winner = winnerSelectionStrategy.getWinner(board);
			if(winner > -1) {
				board.print();
				printWinner(winner);
				return;
			}
			
			updateCurrentPlayer();
			turns++;
		}
		System.out.println("No result!!");
	}
	
	void printWinner(int winner) {
		if(winner == 0) {
			System.out.println("Player O wins the game!!");
		}else if(winner == 1) {
			System.out.println("Player X wins the game!!");
		}
	}
}
