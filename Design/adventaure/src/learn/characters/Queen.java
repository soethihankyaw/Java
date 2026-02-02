package learn.characters;

import learn.behaviors.BowAndArrowBehavior;

public class Queen extends Character{
	
	public Queen() {
		weapon = new BowAndArrowBehavior();
	}

	@Override
	public void fignt() {
		weapon.useWeapon();
	}

}
