package repositoryImpl;

import java.util.ArrayList;
import java.util.List;

import domain.AccountBean;
import repository.AccountDAO;

public class AccountDAOImpl implements AccountDAO{
	private static AccountDAO instance = new AccountDAOImpl();
	private static List<AccountBean> accountList;
	public static List<AccountBean> getAccountList() {
		return accountList;
	}
	public static AccountDAO getInstance() {return instance;}
	private AccountDAOImpl() {
		accountList = new ArrayList<>();
	}
	@Override
	public void insertAccount(AccountBean account) {
		System.out.println("=====계좌DAO=====");
		System.out.println(account);
		accountList.add(account);
	}

}
