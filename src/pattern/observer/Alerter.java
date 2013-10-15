package pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 
 * @author Kane.Sun
 */
public class Alerter implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		if (Integer.parseInt(arg.toString()) > 95) {
			alarm();
		}
	}

	private void alarm() {
		for (int i = 0; i < 5; i++)
			System.out.println("--------xx");
	}

}