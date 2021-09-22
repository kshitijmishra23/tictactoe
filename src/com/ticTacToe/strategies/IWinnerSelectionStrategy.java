package com.ticTacToe.strategies;

import com.ticTacToe.Board;
import com.ticTacToe.players.IPlayer;

public interface IWinnerSelectionStrategy {

	int getWinner(Board b);
}
