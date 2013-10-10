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
			new Thread(new Runnable() {

				@Override
				public void run() {
					A.addA();
				}

			}).start();
		}
		Thread.sleep(2000);
		System.out.println(A.x);
	}

}

class A {
	public static  int x = 0;

	public static void addA() {
		synchronized (A.class) {
			x++;
			System.out.println("x is : " + x);
		}
	}
}
