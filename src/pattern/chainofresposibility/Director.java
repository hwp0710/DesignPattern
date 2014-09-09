package pattern.chainofresposibility;

public class Director extends Approver {

	public Director() {
		setApproverPosition("Director");
	}

	@Override
	public void approve(Request request) {
		if (request.getAmount() < MoneyRange.DIRECTOR.getValue()) {
			System.out.println(request.getPurpose() + " Need " + request.getAmount() + " , " + getApproverPosition() + " is Handling the request");
		} else {
			this.getSuccessor().approve(request);
		}
	}
}
