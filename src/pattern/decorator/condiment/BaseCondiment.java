package pattern.decorator.condiment;

import pattern.decorator.Beverage;

public class BaseCondiment implements Beverage {

	protected String description;

	protected double price;

	protected int times = 1;

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double cost() {
		return price * times;
	}

	public BaseCondiment setTimes(int times) {
		this.times = times;
		return this;
	}

	public int getTimes() {
		return times;
	}

}
