package phonecardserver.services;

import phonecardserver.entity.MobileCard;

public interface SendService {
	
	int send(int count, MobileCard mc);

}
