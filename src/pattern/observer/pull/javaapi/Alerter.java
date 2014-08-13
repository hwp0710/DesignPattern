package pattern.observer.pull.javaapi;

import java.util.Observable;
import java.util.Observer;

/**
 * 
 * @author Kane.Sun
 */
public class Alerter implements Observer {

	private Teakettle teakettle;

	@Override
	public void update(Observable o, Object arg) {
		if (Double.parseDouble(arg.toString()) > 95) {
			alarm();
		}

		if (Double.parseDouble(arg.toString()) > 100) {
			System.out.println("Should not be heating more than 100 C , stop heating");
			teakettle.turnOffHeating();
		}
	}

	private void alarm() {
		System.out.println("-------bibibibi------- more than 95 C");
	}

	public void sucscribeTeakettle(Teakettle teakettle) {
		this.teakettle = teakettle;
	}

}