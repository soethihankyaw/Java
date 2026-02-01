package com.learn.parent;

import com.learn.behavior.interfaces.Flyable;
import com.learn.behavior.interfaces.QuackAble;

public abstract class Duck {
	
	protected QuackAble quackAble;
	protected Flyable flyable;
	
	
	protected abstract void display();
	
	public void performfly() {
		flyable.fly();
	}
	
	public void performQuack() {
		quackAble.quack();
	}
	
	protected void swim() {
		System.out.println("I'm swimming");
	}
	
	public void setQuackAble(QuackAble quackAble) {
		this.quackAble = quackAble;
	}

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}

}
