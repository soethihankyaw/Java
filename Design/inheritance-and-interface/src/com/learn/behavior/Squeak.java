package com.learn.behavior;

import com.learn.behavior.interfaces.QuackAble;

public class Squeak implements QuackAble{

	@Override
	public void quack() {
		System.out.println("Quack When squeak!!");
	}

}
