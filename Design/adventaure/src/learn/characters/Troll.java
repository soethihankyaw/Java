package learn.characters;

import learn.behaviors.AxeBehavior;

public class Troll extends Character {

	public Troll() {
		weapon = new AxeBehavior();
	}

	@Override
	public void fignt() {
		weapon.useWeapon();
	}

}
