package com.learn.child;

import com.learn.behavior.FlyWithWings;
import com.learn.behavior.Quack;
import com.learn.parent.Duck;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		flyable = new FlyWithWings();
		quackAble = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a mallard duck.");
	}

}
