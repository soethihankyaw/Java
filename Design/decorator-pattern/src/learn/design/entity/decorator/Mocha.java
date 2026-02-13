package learn.design.entity.decorator;

import learn.design.entity.Beverage;

public class Mocha extends Decorator {
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return  beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return super.cost() + 0.4;
	}
	

}
