package com.learn.behaviors;

import com.learn.behaviors.interfaces.QuackAble;

public class Squeak implements QuackAble{

	@Override
	public void quack() {
		System.out.println("Quack When squeak!!");
	}

}
