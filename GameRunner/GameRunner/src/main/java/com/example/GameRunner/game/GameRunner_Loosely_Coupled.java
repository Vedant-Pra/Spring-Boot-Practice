package com.example.GameRunner.game;

public class GameRunner_Loosely_Coupled {
	private GameConsole gameConsole;
	public GameRunner_Loosely_Coupled(GameConsole game) {
		this.gameConsole=game;
	}
	public void run() {
		gameConsole.up();
		gameConsole.down();
		gameConsole.left();
		gameConsole.right();
	}
}
