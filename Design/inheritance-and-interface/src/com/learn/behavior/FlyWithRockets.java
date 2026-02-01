package com.learn.behavior;

import com.learn.behavior.interfaces.Flyable;

public class FlyWithRockets implements Flyable{

	@Override
	public void fly() {
		System.out.println("Flying with Rockets");
	}

}
