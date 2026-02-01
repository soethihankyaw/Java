package com.learn.child;

import com.learn.behavior.FlyWithWings;
import com.learn.behavior.Quack;
import com.learn.parent.Duck;

public class RedHeadDuck extends Duck{
	
	public RedHeadDuck() {
		flyable = new FlyWithWings();
		quackAble = new Quack();
	}
	
	
	@Override
	public void display() {
		System.out.println("I'm a redhead duck!!");
	}

}
