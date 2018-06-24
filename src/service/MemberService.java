package service;

import domain.*;

public interface MemberService {
	public void createUser(UserBean user);
	public String login(UserBean user);
	public void updatePass(UserBean userr);
	public void deleteMember(UserBean user);
	
}
