package service;
import java.util.List;
import domain.*;

public interface AccountService {
	
	public void createAccount(AccountBean account);
	public void createMinusAccount(MinusAccountBean minusaccount);
	public AccountBean findById();
	public void updatePass(AccountBean account);
	public void deleteAccount(AccountBean account);
	public String createDate();
	public String createRandom(int start,int end);
	public String createAccountNum();
	
}
