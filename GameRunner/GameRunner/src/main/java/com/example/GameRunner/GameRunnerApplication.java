package com.example.GameRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.GameRunner.game.GameRunner;
import com.example.GameRunner.game.GameRunner_Loosely_Coupled;
import com.example.GameRunner.game.MarioGame;
import com.example.GameRunner.game.Mario_Loosely_Coupled;
import com.example.GameRunner.game.SuperContraGame;
import com.example.GameRunner.game.SuperContraGame_Loosely_Coupled;

@SpringBootApplication
public class GameRunnerApplication {

	public static void main(String[] args) {
//		SpringApplication.run(GameRunnerApplication.class, args);
		
/**		
 
//		MarioGame game = new MarioGame();
		SuperContraGame game = new SuperContraGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
//		The problem here is that whenever we are switching from one game to another we are making changes in the GameRunner Class.
//		This is because game runner class is tightly coupled to Mario or Super Contra.
		
**/
		
//		To reduce this coupling or make it loosely coupled we can use interface (here GameConsole.)
		
		Mario_Loosely_Coupled game1 = new Mario_Loosely_Coupled();
		SuperContraGame_Loosely_Coupled game2= new SuperContraGame_Loosely_Coupled();
		//Both the class implements the GameConsole interface in their own ways.
		
		GameRunner_Loosely_Coupled runner1 = new GameRunner_Loosely_Coupled(game1);
		GameRunner_Loosely_Coupled runner2 = new GameRunner_Loosely_Coupled(game2);
		//GameRuunner_Loosely_Coupled class simply creates an objecty of GameConsole interface and initilizes it with the game object in the constructor.
		//It simply calls the Gameconsole interface functuion which in turn calls the funtion of currently called object implementation of these functions.
		// In this case Mario loosely and super loosely are called.
		//We have not made any changes to the GameRunner_Loose... for different classes.
		runner1.run();
		runner2.run();
		
		
	}

}
