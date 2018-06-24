package serviceImpl;
import java.util.*;
import domain.*;
import repository.*;
import repositoryImpl.*;
import service.*;
import serviceImpl.*;

public class MemberServiceImpl implements MemberService{
	private static MemberService instance = new MemberServiceImpl();
	public static MemberService getInstance() {return instance;}
	private MemberServiceImpl() {}

	@Override
	public void createUser(UserBean user) {
		user.setCreditRating("7");
		MemberDAOImpl.getInstance().insertMember(user);
	}

	@Override
	public String login(UserBean user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePass(UserBean userr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(UserBean user) {
		// TODO Auto-generated method stub
		
	}


	
	
	

}











