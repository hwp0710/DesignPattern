package pattern.decorator.concreteBeverage;

import pattern.decorator.Beverage;
import pattern.decorator.CupSize;
import pattern.decorator.condiment.BaseCondiment;

public class BaseBeverage implements Beverage {

	protected BaseCondiment condiment;

	protected double price = 0;

	protected double condimentPrice = 0;

	protected String description;

	protected CupSize cupSize = CupSize.NORMAL;

	@Override
	public String getDescription() {
		return null;
	}

	@Override
	public double cost() {
		return costBySize(cupSize) + condimentPrice;
	}

	private double costBySize(CupSize cupSize) {
		if (cupSize == CupSize.SMALL) {
			return price * CupSize.SMALL.getRatio();
		} else if (cupSize == CupSize.NORMAL) {
			return price * CupSize.NORMAL.getRatio();
		} else {
			return price * CupSize.BIG.getRatio();
		}
	}

	public void setCupSize(CupSize cupSize) {
		this.cupSize = cupSize;
	}

	public BaseBeverage setCondiment(BaseCondiment condiment) {
		condimentPrice += condiment.cost();
		return this;
	}

}
