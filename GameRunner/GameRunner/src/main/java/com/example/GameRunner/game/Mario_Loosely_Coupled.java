package com.example.GameRunner.game;

public class Mario_Loosely_Coupled implements GameConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Mario Up");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Mario Down");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Mario left");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Mario right");
	}

}
