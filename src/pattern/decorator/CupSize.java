package pattern.decorator;

public enum CupSize {

	BIG(1.2),
	NORMAL(1),
	SMALL(0.8);

	private double ratio;

	CupSize(double ratio) {
		this.ratio = ratio;
	}

	public double getRatio() {
		return ratio;
	}

}
