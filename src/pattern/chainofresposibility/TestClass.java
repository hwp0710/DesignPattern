package pattern.chainofresposibility;

public class TestClass {

	public static void main(String[] args) {
		Request request1 = new Request();
		Request request2 = new Request();
		Request request3 = new Request();
		Request request4 = new Request();

		request1.setAmount(2000);
		request1.setPurpose("ÂòÊé");
	}

}
