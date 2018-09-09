package phonecardserver.services;

import phonecardserver.MobileCard;

public interface SendService {
	
	void send(int count, MobileCard mc);

}
