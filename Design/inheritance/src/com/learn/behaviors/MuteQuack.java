package com.learn.behaviors;

import com.learn.behaviors.interfaces.QuackAble;

public class MuteQuack implements QuackAble{

	@Override
	public void quack() {
		System.out.println("<--- Silence ---->");
	}

}
