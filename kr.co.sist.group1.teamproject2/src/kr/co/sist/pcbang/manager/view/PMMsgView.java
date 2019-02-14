package kr.co.sist.pcbang.manager.view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PMMsgView extends JDialog{
	private JTextArea jtaMsg;
	private JTextField jtfMsg;
	private JButton jbSendMsg;
	
	public PMMsgView() {
		
	}

	public JTextArea getJtaMsg() {
		return jtaMsg;
	}

	public JTextField getJtfMsg() {
		return jtfMsg;
	}

	public JButton getJbSendMsg() {
		return jbSendMsg;
	}
	
	
	
}
