package serviceImpl;
import domain.*;
import repositoryImpl.MemberDAOImpl;
import service.*;

import java.text.SimpleDateFormat;
import java.util.*;
public class AdminServiceImpl implements AdminService{
	private static AdminService instance = new AdminServiceImpl();
	public static AdminService getInstance() {return instance;}
	private AdminServiceImpl() {}
	
	public void add(StaffBean staff) {
		staff.setAccessNum("1234");
		MemberDAOImpl.getInstance().insertMember(staff);
	}
			
}
 