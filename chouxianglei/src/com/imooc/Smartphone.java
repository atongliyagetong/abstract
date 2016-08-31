package com.imooc;

public class Smartphone extends Telephone implements IPlayGame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("用屏幕打电话");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
			System.out.println("用屏幕发短信");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("智能手机具有玩游戏的功能");
	}

}
