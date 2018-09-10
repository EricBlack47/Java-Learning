package phonecardserver.services;

import phonecardserver.entity.MobileCard;

public interface CallService {
	

	int call(int talkTimeMin, MobileCard mc);


}
