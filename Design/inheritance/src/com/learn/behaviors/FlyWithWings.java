package com.learn.behaviors;

import com.learn.behaviors.interfaces.Flyable;

public class FlyWithWings implements Flyable{

	@Override
	public void fly() {
		System.out.println("I can fly!");
	}

}
