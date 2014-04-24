package pattern.singleton;

/**
 *
 *
 * @author Kane.Sun
 * @version Apr 24, 2014 4:40:06 PM
 * 
 */

public class OnDemandHolderSingleTon {

	private OnDemandHolderSingleTon() {
	}

	private static class InstanceHolder {

		public static final OnDemandHolderSingleTon instance = new OnDemandHolderSingleTon();

		public static OnDemandHolderSingleTon getInstance() {
			return instance;
		}
	}

	public static OnDemandHolderSingleTon getInstantce() {
		return InstanceHolder.getInstance();
	}

}
