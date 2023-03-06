package domain.warrior.weapon;

import domain.warrior.weapon.type.WeaponType;

public class Axe extends Weapon {
	public Axe(int edgePoints) {
		super(edgePoints, WeaponType.ATTACK);
	}
}
