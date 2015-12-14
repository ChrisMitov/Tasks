package package_GSM$E;

public class SIMcard {

	 String simMobileNumber;
	boolean hasSimCard;
	

	void validSIMcard( String simMobileNumber, boolean hasSimCard){
		if (simMobileNumber !=null) {
			if (simMobileNumber.length() == 10 && simMobileNumber.startsWith("08")) {
				this.simMobileNumber = simMobileNumber;
				this.hasSimCard = true;
			}
		}
	}
	
	
	
	
}