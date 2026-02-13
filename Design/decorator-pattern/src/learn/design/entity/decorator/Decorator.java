package learn.design.entity.decorator;

import learn.design.entity.Beverage;

public abstract class Decorator extends Beverage {
	
	protected Beverage beverage;
	
	public abstract String getDescription();

	@Override
	public double cost() {
		return beverage.cost();
	}

	@Override
	public Size getSize() {
		return super.getSize();
	}
	
	
}
