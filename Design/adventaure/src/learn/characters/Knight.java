package learn.characters;

import learn.behaviors.KnifeBehavior;

public class Knight extends Character{
	
	public Knight() {
		weapon = new KnifeBehavior();
	}
	
	@Override
	public void fignt() {
		weapon.useWeapon();
	}

}
