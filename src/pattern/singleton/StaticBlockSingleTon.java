package pattern.singleton;

/**
 *
 *
 * @author Kane.Sun
 * @version Apr 24, 2014 4:52:06 PM
 * 
 */

public class StaticBlockSingleTon {

	private StaticBlockSingleTon() {
	}

	private static final StaticBlockSingleTon INSTANCE;

	static {
		try {
			INSTANCE = new StaticBlockSingleTon();
		} catch (Exception e) {
			throw new RuntimeException("Damn it , an error occurred!", e);
		}
	}

	public static StaticBlockSingleTon getInstatnce() {
		return INSTANCE;
	}

}
