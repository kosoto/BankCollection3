package repositoryImpl;

import java.util.ArrayList;
import java.util.List;

import domain.MemberBean;
import domain.UserBean;
import repository.MemberDAO;

public class MemberDAOImpl implements MemberDAO{
	private static MemberDAO instance = new MemberDAOImpl();
	private static List<MemberBean> memberList;
	public static List<MemberBean> getMemberList() {
		return memberList;
	}
	public static MemberDAO getInstance() {return instance;}
	private MemberDAOImpl() {
		memberList = new ArrayList<>();
	}
	
	public void insertMember(MemberBean member) {
		System.out.println("=====멤버DAO=====");
		System.out.println(member);
		memberList.add(member);
	}
}
