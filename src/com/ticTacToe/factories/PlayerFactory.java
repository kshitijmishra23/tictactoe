package com.ticTacToe.factories;

import com.ticTacToe.enums.PlayerType;
import com.ticTacToe.enums.Symbols;
import com.ticTacToe.players.ComputerPlayer;
import com.ticTacToe.players.HumanPlayer;
import com.ticTacToe.players.IPlayer;

public class PlayerFactory {

	public static IPlayer createPlayer(PlayerType type, Symbols x) {
		switch (type) {
		case human:
			return  new HumanPlayer(x);		
		case computer:
			return new ComputerPlayer(x);
		default:
			return null;
		}
	}
}
