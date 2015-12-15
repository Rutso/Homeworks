
public class GSM {

	
	//State:
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall = new Call();
	Call lastOutgoingCall = new Call();
	
	
	//Behaviour:
	//1. Inserts SIM:
	void insertSimCard(String newSimMobileNumber) {
		
		if (newSimMobileNumber.length() == 10 && newSimMobileNumber.charAt(0) == '0' && newSimMobileNumber.charAt(1) == '8') {
			hasSimCard = true;
			simMobileNumber = newSimMobileNumber;
		}
	}
	
	
	//2. Removes SIM:
	void removeSimCard() {
		hasSimCard = false;
		simMobileNumber = null;
	}
	
	
	//3. Makes a call:
	void call(GSM receiver, int duration) {
		
		
		if (hasSimCard == false || receiver.hasSimCard == false) {
			return;
		}
		
		if (simMobileNumber.equals(receiver.simMobileNumber)) {
			return;
		}
		
		if (duration <= 0) {
			return;
		} 
		
				
		lastOutgoingCall.caller = simMobileNumber;
		lastOutgoingCall.receiver = receiver.simMobileNumber;
		lastOutgoingCall.duration = duration;
		
		receiver.lastIncomingCall.caller = simMobileNumber;
		receiver.lastIncomingCall.receiver = receiver.simMobileNumber;
		receiver.lastIncomingCall.duration = duration;
		
		outgoingCallsDuration+= duration;
		
	}
	
	
	
	//4. Calculates the phone bill of the GSMs user
	double getSumForCall() {
		
		double theBill = (Call.priceForAMinute)*(outgoingCallsDuration);
		return theBill;
		
		
	}
	
	//5. Info for the last outgoing call:
	void printInfoForTheLastOutgoingCall() {
		if (lastOutgoingCall.duration > 0) {
		System.out.println("Caller: " + lastOutgoingCall.caller);
		System.out.println("Receiver: " + lastOutgoingCall.receiver);
		System.out.println("Duration: " + lastOutgoingCall.duration + " minutes");
		} else {
			System.out.println("No outgoing calls have been made from this GSM yet.");
		}
	}
	
	//5. Info for the last outgoing call:
		void printInfoForTheLastIncomingCall() {
			if (lastIncomingCall.duration != 0) {
			System.out.println("Caller: " + lastIncomingCall.caller);
			System.out.println("Receiver: " + lastIncomingCall.receiver);
			System.out.println("Duration: " + lastIncomingCall.duration + " minutes");
			} else {
				System.out.println("No incoming calls have been made from this GSM yet.");
			}
		}
}
