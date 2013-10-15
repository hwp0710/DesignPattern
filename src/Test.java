/**
 * 
 * 
 * @author Kane.Sun
 * @version Oct 10, 2013 3:09:11 PM
 * 
 */

public class Test {

	public static void main(String... args) throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			
			A.setNull();
			Thread.sleep(100);
			
			new Thread(new Runnable() {

				@Override
				public void run() {
					if (A.getInstance().test == 0) {
						System.out.println("success");
					} else {

					}
				}

			}).start();

			new Thread(new Runnable() {

				@Override
				public void run() {
					A.setNull();
				}

			}).start();
		}
	}
}

class A {
	public static volatile A INSTANCE = new A();

	public static int test = 0;

	private A() {
		test = 1;
	}

	public static A getInstance() {
		if (INSTANCE == null) {
			synchronized (A.class) {
				if (INSTANCE == null) {
					INSTANCE = new A();
				}
			}
		}

		return INSTANCE;

	}

	public static void setNull() {
		INSTANCE = null;
	}
}
