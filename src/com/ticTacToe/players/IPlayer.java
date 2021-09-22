package com.ticTacToe.players;

import com.ticTacToe.Board;
import com.ticTacToe.enums.Symbols;

public abstract class IPlayer {

	public abstract void makeMove(Board b);
	public Symbols symbol;
	
	public IPlayer(Symbols x) {
		this.symbol = x;
	}
}
