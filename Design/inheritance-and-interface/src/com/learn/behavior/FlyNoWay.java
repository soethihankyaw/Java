package com.learn.behavior;

import com.learn.behavior.interfaces.Flyable;

public class FlyNoWay implements Flyable{

	@Override
	public void fly() {
		System.out.println("I can't fly!");
	}

}
