package com.imooc;

public class Smartphone extends Telephone implements IPlayGame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("����Ļ��绰");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
			System.out.println("����Ļ������");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("�����ֻ���������Ϸ�Ĺ���");
	}

}
