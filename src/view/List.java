package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.AdminController;
import controller.MemberController;
import domain.MemberBean;
import domain.StaffBean;
import domain.UserBean;
import repositoryImpl.AccountDAOImpl;
import repositoryImpl.MemberDAOImpl;

public class List extends JFrame{
	private static final long serialVersionUID = 1L;
	JLabel topLab;
	JButton addBtn;
	JPanel bottomPan, centerPan;
	JComboBox<?> combo;
	String[] menu = {"멤버 목록","계좌 목록"};
	public List() {
		makeGui(); //화면구성
		this.setSize(400, 300);
		this.setVisible(true);
	}
	public void makeGui() {
		topLab = new JLabel("회원가입", JLabel.CENTER);
		
		combo = new JComboBox<>(menu);
		/*idLab = new JLabel("I D : ", JLabel.CENTER);
		idTxt = new JTextField(15);
		idPan = new JPanel();
		idPan.add(idLab);
		idPan.add(idTxt);
		
		passLab = new JLabel("비밀번호 : ");
		passTxt = new JTextField(15);
		passPan = new JPanel();
		passPan.add(passLab);
		passPan.add(passTxt);

		nameLab = new JLabel("이 름 : ");
		nameTxt = new JTextField(15);
		namePan = new JPanel();
		namePan.add(nameLab);
		namePan.add(nameTxt);
		
		ssnLab = new JLabel("주민번호 : ");
		ssnTxt = new JTextField(15);
		ssnPan = new JPanel();
		ssnPan.add(ssnLab);
		ssnPan.add(ssnTxt);

		phoneLab = new JLabel("전 화 : ");
		phoneTxt = new JTextField(15);
		phonePan = new JPanel();
		phonePan.add(phoneLab);
		phonePan.add(phoneTxt);
		
		emailLab = new JLabel("이메일 : ");
		emailTxt = new JTextField(15);
		emailPan = new JPanel();
		emailPan.add(emailLab);
		emailPan.add(emailTxt);

		addrLab = new JLabel("주 소 : ");
		addrTxt = new JTextField(15);
		addrPan = new JPanel();
		addrPan.add(addrLab);
		addrPan.add(addrTxt);*/

	

		centerPan = new JPanel();
		centerPan.setLayout(new GridLayout(8, 1));
		centerPan.add(combo);
		/*centerPan.add(idPan);
		centerPan.add(passPan);
		centerPan.add(namePan);
		centerPan.add(ssnPan);
		centerPan.add(phonePan);
		centerPan.add(emailPan);
		centerPan.add(addrPan);
		*/

		addBtn = new JButton("열람");
		
		addBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(((String) combo.getSelectedItem()).equals(menu[0])) {
				JOptionPane.showMessageDialog(null, MemberDAOImpl.getMemberList());
					
				}else {
				JOptionPane.showMessageDialog(null, AccountDAOImpl.getAccountList());
				}
				/*member.setUid(idTxt.getText());
				member.setName(nameTxt.getText());
				member.setPass(passTxt.getText());
				member.setSsn(ssnTxt.getText());
				member.setPhone(phoneTxt.getText());
				member.setAddr(addrTxt.getText());
				member.setEmail(emailTxt.getText());*/
				if(((String) combo.getSelectedItem()).equals(menu[0])) {
					//MemberController.getInstance().join((UserBean) member);
				}else {
				//AdminController.getInstance().add((StaffBean) member);
				}
				
				
			}
		});
		

		bottomPan = new JPanel();
		bottomPan.add(addBtn);
		
		add(topLab, "North");
		add(centerPan, "Center");
		add(bottomPan, "South");
	}
}
