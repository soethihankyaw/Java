package learn.design.entity.decorator;

import learn.design.entity.Beverage;

public class Milk extends Decorator {
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return super.cost() + 0.30;
	}
	
	
	
}
