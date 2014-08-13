package pattern.observer.pull.javaapi;

import java.util.Observable;
import java.util.Random;

/**
 * 
 * @author Kane.Sun
 */
public class Teakettle extends Observable {
	private double currentTemperature = 90;
	private boolean isKeepHeating = true;
	private Random random = new Random();

	public void heat() throws InterruptedException {
		while (isKeepHeating) {
			Thread.sleep(200);
			currentTemperature += random.nextInt(10) / 1.0;
			this.setChanged();
			this.notifyObservers(currentTemperature);
		}
	}

	public boolean isKeepHeating() {
		return isKeepHeating;
	}

	public void turnOffHeating() {
		isKeepHeating = false;
	}

	public double getCurrentTemperature() {
		return currentTemperature;
	}
}