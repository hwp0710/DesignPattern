package observer;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 * 
 * @author Kane.Sun
 */
public class Teakettle extends Observable {
	private int temperature = 90;

	public void heat() throws InterruptedException {

		Observer alarm = new Alerter();
		this.addObserver(alarm);
		while (true) {
			Thread.sleep(new Random().nextInt(500));
			System.out.println("----------------");
			System.out.println("now temperature is : " + temperature++);

			this.setChanged();
			this.notifyObservers(temperature);
		}

	}
}