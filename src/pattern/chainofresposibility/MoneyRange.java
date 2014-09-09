package pattern.chainofresposibility;

public enum MoneyRange {

	DIRECTOR(5_000),
	MANAGER(20_000),
	CHAIRMAN(50_000),
	BOARDOFDIRECTOR(200_000);

	private int amount = 0;

	private MoneyRange(int amount) {
		this.amount = amount;
	}

	public int getValue() {
		return this.amount;
	}
}
