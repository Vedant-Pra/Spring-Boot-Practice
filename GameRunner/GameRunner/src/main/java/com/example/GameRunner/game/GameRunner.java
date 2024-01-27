package com.example.GameRunner.game;

public class GameRunner {
	
//	This code is for mario game
/**	private MarioGame game;
	public GameRunner(MarioGame game) {
		// TODO Auto-generated constructor stub
		this.game=game;
	}

	public void run() {
		// TODO Auto-generated method stub
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
	**/
	
//	This code is for Super Contra Game
	private SuperContraGame game;
	public GameRunner(SuperContraGame game) {
		// TODO Auto-generated constructor stub
		this.game=game;
	}

	public void run() {
		// TODO Auto-generated method stub
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
