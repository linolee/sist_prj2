package kr.co.sist.pcbang.manager.view;

import javax.swing.JFrame;

public class PMMainView extends JFrame{
	PMSeatView psv;
	
	public PMMainView() {
		setLayout(null);
		psv = new PMSeatView();
		psv.setBounds(50,50,700,700);
		add(psv);
		setVisible(true);
		setBounds(100,100,800,800);
	}
	
}
