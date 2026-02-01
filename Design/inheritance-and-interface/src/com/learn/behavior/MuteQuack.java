package com.learn.behavior;

import com.learn.behavior.interfaces.QuackAble;

public class MuteQuack implements QuackAble{

	@Override
	public void quack() {
		System.out.println("<--- Silence ---->");
	}

}
