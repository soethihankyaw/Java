package com.learn.behavior;

import com.learn.behavior.interfaces.QuackAble;

public class Quack implements QuackAble{

	@Override
	public void quack() {
		System.out.println("Quack Quack!!");
	}

}
