package package_GSM$E;

public class GSM {
	String model;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	SIMcard isValid;
	

	void removeSimCard() {
		this.isValid.hasSimCard = false;
		this.isValid.simMobileNumber = "";
	}
	

	void call(GSM receiver, int duration, SIMcard card) {
		if ((receiver != null) && (receiver.card )) {
			if (duration > 0 && duration <= 60) {
				if (this.hasSimCard && !this.simMobileNumber.equals(receiver.simMobileNumber)) {
					if (this != receiver) {
						// create a new call
						Call newCall = new Call();
						newCall.caller = this;
						newCall.receiver = receiver;
						newCall.duration = duration;

						this.lastOutgoingCall = newCall;
						receiver.lastIncomingCall = newCall;
						this.outgoingCallsDuration += duration;
					}
				}
			}
		}
	}

	double getSumForCalls() {
		if (lastOutgoingCall == null) {
			return 0.0;
		}
		return this.outgoingCallsDuration * this.lastOutgoingCall.priceForAMinute;
	}

	void printInfoForCall(Call call) {
		if (call != null) {
			System.out.println(call.caller.simMobileNumber + 
					" se obajda na " + call.receiver.simMobileNumber
					+ " za tolkova vreme " + call.duration);
		}
	}

	void printInfoForLastIncomingCall() {
		printInfoForCall(lastIncomingCall);
	}

	void printInfoForLastOutgoingCall() {
		printInfoForCall(lastOutgoingCall);
	}

}