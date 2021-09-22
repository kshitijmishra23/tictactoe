package com.ticTacToe.players;

import java.util.Scanner;

import com.ticTacToe.Board;
import com.ticTacToe.enums.Symbols;

public class HumanPlayer extends IPlayer {

	public HumanPlayer(Symbols x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeMove(Board b) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		b.grid[i][j] = this.symbol == Symbols.X ? 1 : 0;
	}

}
