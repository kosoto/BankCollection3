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
import domain.AccountBean;
import domain.MemberBean;
import domain.StaffBean;
import domain.UserBean;

public class FindById extends JFrame{
	private static final long serialVersionUID = 1L;
	JLabel topLab, idLab,passLab;
	JTextField idTxt, passTxt;
	JButton addBtn;
	JPanel bottomPan, centerPan, idPan, passPan;
	JComboBox<?> combo;
	String[] menu = {"계정 찾기","계좌 찾기"};
	public FindById() {
		makeGui(); //화면구성
		this.setSize(400, 300);
		this.setVisible(true);
	}
	public void makeGui() {
		topLab = new JLabel("ID 찾기", JLabel.CENTER);
		
		combo = new JComboBox<>(menu);
		idLab = new JLabel("I D : ", JLabel.CENTER);
		idTxt = new JTextField(15);
		idPan = new JPanel();
		idPan.add(idLab);
		idPan.add(idTxt);
		
		passLab = new JLabel("비밀번호 : ");
		passTxt = new JTextField(15);
		passPan = new JPanel();
		passPan.add(passLab);
		passPan.add(passTxt);

		centerPan = new JPanel();
		centerPan.setLayout(new GridLayout(8, 1));
		centerPan.add(combo);
		centerPan.add(idPan);
		centerPan.add(passPan);

		addBtn = new JButton("검색");
		
		addBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MemberBean member = null;
				AccountBean account = null;
				if(((String) combo.getSelectedItem()).equals(menu[0])) {
					MemberController.getInstance().findById(member);
				}else {
					
				}
				member.setUid(idTxt.getText());
				member.setPass(passTxt.getText());
				if(((String) combo.getSelectedItem()).equals(menu[0])) {
					
				}else {
					
				}
				
				JOptionPane.showMessageDialog(null, "등록성공");
			}
			
		});
		

		bottomPan = new JPanel();
		bottomPan.add(addBtn);
		
		add(topLab, "North");
		add(centerPan, "Center");
		add(bottomPan, "South");
	}
}
