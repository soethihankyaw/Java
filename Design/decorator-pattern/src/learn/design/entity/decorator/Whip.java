package learn.design.entity.decorator;

import learn.design.entity.Beverage;

public class Whip extends Decorator {
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return super.cost() + 0.25;
	}
	
	

}
