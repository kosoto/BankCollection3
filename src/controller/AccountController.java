package controller;

import domain.*;
import serviceImpl.AccountServiceImpl;

public class AccountController {
	private static AccountController instance = new AccountController();
	public static AccountController getInstance() {return instance;}
	private AccountController() {}
	
	public void createAccount(AccountBean account) {
		AccountServiceImpl.getInstance().createAccount(account);
	}
	
	public void createMinusAccount(MinusAccountBean minusAccount) {
		AccountServiceImpl.getInstance().createMinusAccount(minusAccount);
	}
	
}
