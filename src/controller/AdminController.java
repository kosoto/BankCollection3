package controller;

import domain.StaffBean;
import serviceImpl.AdminServiceImpl;

public class AdminController {
	private static AdminController instance = new AdminController();
	public static AdminController getInstance() {return instance;}
	private AdminController() {}
	
	public void add(StaffBean staff) {
		AdminServiceImpl.getInstance().add(staff);
	}
	
}
