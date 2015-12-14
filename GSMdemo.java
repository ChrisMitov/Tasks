package package_GSM$E;


public class GSMdemo {
	public static void main(String[] args) {
		GSM motorola = new GSM();
		GSM nokia = new GSM();
		
		nokia.isValid.validSIMcard( String simMobileNumber,boolean hasSimCard);
		
		nokia.insertSimCard("0883131929");
		motorola.insertSimCard("0889342546");
		
//		nokia.removeSimCard();
		
		nokia.call(motorola, 2);
		
		nokia.printInfoForLastOutgoingCall();

		motorola.printInfoForLastIncomingCall();
		
		System.out.println(nokia.getSumForCalls());
	}
}