package controller;

import domain.*;
import service.*;
import serviceImpl.*;


public class MemberController {
	private static MemberController instance = new MemberController();
	public static MemberController getInstance() {return instance;}
	private MemberController() {}
	
	public void join(UserBean user) {
		MemberServiceImpl.getInstance().createUser(user);
	}
	
	public MemberBean findById(MemberBean member) {
		return null;
	};
	
	public String login(UserBean user) {
		
		return null;
	}
	
	public void updatePass(UserBean userr) {
		// TODO Auto-generated method stub
		
	}

	public void deleteMember(UserBean user) {
		// TODO Auto-generated method stub
		
	}
	
	
}
