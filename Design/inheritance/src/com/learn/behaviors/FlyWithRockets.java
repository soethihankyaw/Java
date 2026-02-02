package com.learn.behaviors;

import com.learn.behaviors.interfaces.Flyable;

public class FlyWithRockets implements Flyable{

	@Override
	public void fly() {
		System.out.println("Flying with Rockets");
	}

}
