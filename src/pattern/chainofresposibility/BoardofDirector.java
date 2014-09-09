package pattern.chainofresposibility;

public class BoardofDirector extends Approver {

	public BoardofDirector() {
		setApproverPosition("BoardofDirector");
	}

	@Override
	public void approve(Request request) {
		if (request.getAmount() < MoneyRange.BOARDOFDIRECTOR.getValue()) {
			System.out.println(request.getPurpose() + " Need " + request.getAmount() + " , " + getApproverPosition() + " is Handling the request");
		} else {
			System.out.println("Our Company Can not help");
		}
	}
}
