package com.learn.child;

import com.learn.behaviors.FlyWithWings;
import com.learn.behaviors.Quack;
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
