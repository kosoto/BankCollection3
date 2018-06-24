package serviceImpl;

import java.text.SimpleDateFormat;
import java.util.*;
import domain.*;
import repositoryImpl.AccountDAOImpl;
import service.AccountService;

public class AccountServiceImpl implements AccountService{
	private static AccountService instance = new AccountServiceImpl();
	public static AccountService getInstance() {return instance;}
	private AccountServiceImpl() {}

	@Override
	public void createAccount(AccountBean account) {
		account.setAccountNo(createAccountNum());
		account.setAccountType(account.ACCOUNT_TYPE);
		account.setCreateDate(createDate());
		AccountDAOImpl.getInstance().insertAccount(account);
	}

	@Override
	public void createMinusAccount(MinusAccountBean minusaccount) {
		minusaccount.setAccountNo(createAccountNum());
		minusaccount.setAccountType(minusaccount.ACCOUNT_TYPE);
		minusaccount.setCreateDate(createDate());
		AccountDAOImpl.getInstance().insertAccount(minusaccount);
	}

	@Override
	public AccountBean findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePass(AccountBean account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(AccountBean account) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String createDate() {
		return new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
	}
	@Override
	public String createRandom(int start,int end) {
		return String.format("%03d", (int)((Math.random()*(end-start))+start))	;
	}
	@Override
	public String createAccountNum() {
		String result = "";
		for(int i=0;i<5;i++) {
			if(i%2==0) {
				result += createRandom(0, 1000);
			}else {
				result += "-";
			}
		}
		return result;
	}
		

	
}






