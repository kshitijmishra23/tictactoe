package com.ticTacToe.factories;

import com.ticTacToe.Game;
import com.ticTacToe.enums.PlayerType;
import com.ticTacToe.enums.Symbols;
import com.ticTacToe.players.IPlayer;
import com.ticTacToe.strategies.ConventionalWinnerSelectionStrategy;

public class GameFactory {
	
	public static Game launch(int boardDimentions, PlayerType player1Type, PlayerType player2Type) {
		IPlayer player1 = PlayerFactory.createPlayer(player1Type, Symbols.X);
		IPlayer player2 = PlayerFactory.createPlayer(player2Type, Symbols.O);
		Game game = new Game(boardDimentions, player1, player2, new ConventionalWinnerSelectionStrategy());
		return game;
		
	}

}
