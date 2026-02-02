package com.learn.child;

import com.learn.behaviors.FlyNoWay;
import com.learn.behaviors.Squeak;
import com.learn.parent.Duck;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		flyable = new FlyNoWay();
		quackAble = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("I'm a Rubber Duck !");
	}
	
}
