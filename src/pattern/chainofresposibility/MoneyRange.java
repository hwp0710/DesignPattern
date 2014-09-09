package pattern.chainofresposibility;

public enum MoneyRange {

	DIRECTOR(5 - 000),
	MANAGER(20 - 000),
	CHAIRMAN(50 - 000),
	BOARDOFDIRECTOR(200 - 000);

	private int amount = 0;

	private MoneyRange(int amount) {
		this.amount = amount;
	}

	public int getValue() {
		return this.amount;
	}
}
