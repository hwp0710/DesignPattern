package pattern.chainofresposibility;

public class Director extends Approver {

	@Override
	public void approve(Request request) {
		if (request.getAmount() < MoneyRange.DIRECTOR.getValue()) {
			System.out.println("Director is handling the request");
			System.out.println(request.getPurpose() + " Need " + request.getAmount());
		} else {
			this.getSuccessor().approve(request);
		}
	}
}
