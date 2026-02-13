package learn.design;

import learn.design.entity.Beverage;
import learn.design.entity.Beverage.Size;
import learn.design.entity.DarkRoast;
import learn.design.entity.Espresso;
import learn.design.entity.HouseBlend;
import learn.design.entity.decorator.Mocha;
import learn.design.entity.decorator.Soy;
import learn.design.entity.decorator.Whip;

public class CoffeeMenu {
	
	public static void main(String[] args) {
		
		var dark = new DarkRoast();
		
		System.out.println(dark.getDescription() + " -  $" + dark.cost());
		
		Beverage expresso = new Espresso();
		
		expresso = new Mocha(expresso);
		expresso = new Mocha(expresso);
		expresso = new Whip(expresso);
		
		System.out.println(expresso.getDescription() + " - $" + expresso.cost());
		
		Beverage houseBlend = new HouseBlend();
		houseBlend.setSize(Size.VENTI);
		houseBlend = new Soy(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
		
		System.out.println(houseBlend.getDescription() + " - $" + houseBlend.cost());
	}
}
