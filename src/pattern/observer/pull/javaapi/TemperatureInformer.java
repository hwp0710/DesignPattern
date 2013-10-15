package pattern.observer.pull.javaapi;

import java.util.Observable;

/**
 * 
 * 
 * @author Kane.Sun
 * @version Sep 4, 2013 2:04:48 PM
 * 
 */

public class TemperatureInformer extends Observable {

	double temperature = 0;

	public double getTemperature() {
		return temperature;
	}

	private void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public void informObserver() {
		setChanged();
		notifyObservers();
	}

	public void changeTemperature(double newTemperature) {
		if (newTemperature - temperature > 1) {
			setTemperature(newTemperature);
			informObserver();
		}

		System.out.println("current temperature is : " + newTemperature);
	}

}
