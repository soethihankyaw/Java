package learn.characters;

import learn.behaviors.SwordBehavior;

public class King extends Character{
	
	public King() {
		weapon = new SwordBehavior();
	}

	@Override
	public void fignt() {
		weapon.useWeapon();
	}

}
