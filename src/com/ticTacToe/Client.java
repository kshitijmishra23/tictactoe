package com.ticTacToe;

import com.ticTacToe.enums.PlayerType;
import com.ticTacToe.factories.GameFactory;

public class Client {

	public static void main(String[] args) {
		
		Game ticTacToe = GameFactory.launch(3, PlayerType.human, PlayerType.human);
		ticTacToe.run();

	}

}
