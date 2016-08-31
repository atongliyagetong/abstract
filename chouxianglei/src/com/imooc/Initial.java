package com.imooc;

public class Initial {		
	public static void main(String[] args) {
		Telephone tel1=new Cellphone();
		Telephone tel2=new Smartphone();
		tel1.call();
		tel1.message();
		tel2.call();
		tel2.message();
		
		IPlayGame ip1=new Smartphone();
		IPlayGame ip2=new Psp();
		ip1.playGame();
		ip2.playGame();
		new IPlayGame(){

			public void playGame() {
		
			System.out.println("匿名内部类的方式实现借口");
			}
			
		}.playGame();
		
	}

}
