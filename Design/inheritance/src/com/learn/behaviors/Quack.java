package com.learn.behaviors;

import com.learn.behaviors.interfaces.QuackAble;

public class Quack implements QuackAble{

	@Override
	public void quack() {
		System.out.println("Quack Quack!!");
	}

}
