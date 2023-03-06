package domain.warrior.weapon;

import domain.warrior.weapon.type.WeaponType;

public class Sword extends Weapon {
	public Sword(int edgePoints) {
		super(edgePoints, WeaponType.ATTACK);
	}
}