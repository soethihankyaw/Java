package com.learn;

import com.learn.behavior.FlyWithRockets;
import com.learn.child.MallardDuck;
import com.learn.child.RubberDuck;

public class Main {

	public static void main(String[] args) {
		
		var mallard = new MallardDuck();
		
		mallard.display();
		mallard.performQuack();
		mallard.performfly();
		
		System.out.println("");
		
		var rubber = new RubberDuck();
		
		rubber.display();
		rubber.performfly();
		rubber.setFlyable(new FlyWithRockets());
		rubber.performQuack();
		rubber.performfly();
		
	}

}
