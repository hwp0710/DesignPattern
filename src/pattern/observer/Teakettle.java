package pattern.observer;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 * 
 * @author Kane.Sun
 */
public class Teakettle extends Observable {
	private int temperature = 90;
	private boolean switchStatus = true;

	public void heat() throws InterruptedException {

		Observer alarm = new Alerter();
		this.addObserver(alarm);
		while (switchStatus) {
			Thread.sleep(new Random().nextInt(500));
			System.out.println("----------------");
			System.out.println("now temperature is : " + temperature++);

			this.setChanged();
			this.notifyObservers(temperature);
		}

	}

	public boolean isSwitchStatus() {
		return switchStatus;
	}

	public void setSwitchStatus(boolean switchStatus) {
		this.switchStatus = switchStatus;
	}
}