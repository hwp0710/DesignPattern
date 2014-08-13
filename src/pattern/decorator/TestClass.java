package pattern.decorator;

import pattern.decorator.concreteBeverage.BaseBeverage;
import pattern.decorator.concreteBeverage.Espresso;
import pattern.decorator.condiment.Milk;
import pattern.decorator.condiment.Mocha;

public class TestClass {

	public static void main(String... args) {
		BaseBeverage espresso = new Espresso();
		double finalPrice = espresso.setCondiment(new Milk().setTimes(3)).setCondiment(new Mocha().setTimes(2)).cost();
		System.out.println(finalPrice);
	}

}
