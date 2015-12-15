
public class GSMCallDemo {

	public static void main(String[] args) {

		GSM kumaLisa = new GSM();
		GSM kumchoValcho = new GSM();
		
			
		kumaLisa.insertSimCard("0894578623");
		System.out.println("Kuma Lisa's number is " + kumaLisa.simMobileNumber);
		kumchoValcho.insertSimCard("0894523478");
		System.out.println("Kucho Valcho's number is " + kumchoValcho.simMobileNumber);
		
		
		//First Kumcho Valcho calls Kuma Lisa:
		int callLength = 20;
				
		kumchoValcho.call(kumaLisa, callLength);
		double kumchoValchoBill = kumchoValcho.getSumForCall();
		System.out.println(String.format("Kumcho Valcho called Kuma Lisa and they talked for %d minutes. That will cost Kumcho Valcho %.2f leva.", callLength,kumchoValchoBill));
		
		System.out.println();
		System.out.println("Kumcho Valcho's last outgoing call:");
		kumchoValcho.printInfoForTheLastOutgoingCall();
		
		System.out.println();
		System.out.println("Kuma Lisa's last incoming call:");
		kumaLisa.printInfoForTheLastIncomingCall();
		
		
		//Then Kuma Lisa calls Kumcho Valcho:
		System.out.println();
		int callLength2 = 50;
		kumaLisa.call(kumchoValcho, callLength2);
		double kumaLisaBill = kumaLisa.getSumForCall();
		System.out.println(String.format("Latter Kuma Lisa called Kumcho Valcho and they talked for %d minutes. That will cost Kuma Lisa %.2f leva.", callLength2,kumaLisaBill));
		
		System.out.println();
		System.out.println("Kuma Lisa's last outgoing call:");
		kumaLisa.printInfoForTheLastOutgoingCall();
		
		System.out.println();
		System.out.println("Kumcho Valcho's last incoming call:");
		kumchoValcho.printInfoForTheLastIncomingCall();
		
		
		
	}

}
