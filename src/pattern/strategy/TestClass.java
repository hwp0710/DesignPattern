package pattern.strategy;

import pattern.strategy.charactor.Charactor;
import pattern.strategy.charactor.impl.Knight;
import pattern.strategy.charactor.impl.Warrior;
import pattern.strategy.weapon.impl.ShotGun;

/**
 *
 *
 * @author Kane.Sun
 * @version Apr 25, 2014 10:11:15 AM
 * 
 */

public class TestClass {

	public static void main(String... args) {
		Charactor knight = new Knight();
		Charactor warrior = new Warrior();
		knight.attack();
		warrior.attack();
		knight.setWeaponBehavior(new ShotGun());
		knight.attack();
	}

}
