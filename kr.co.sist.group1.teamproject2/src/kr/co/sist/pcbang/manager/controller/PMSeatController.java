package kr.co.sist.pcbang.manager.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.net.Socket;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import javax.swing.JButton;

import kr.co.sist.pcbang.manager.model.PMSeatDAO;
import kr.co.sist.pcbang.manager.view.PMSeatSetView;
import kr.co.sist.pcbang.manager.view.PMSeatView;
import kr.co.sist.pcbang.manager.vo.PMSeatLocVO;
import kr.co.sist.pcbang.manager.vo.PMSeatVO;

public class PMSeatController extends WindowAdapter implements Runnable, ActionListener{
	private PMSeatView pmsv;
	private Socket serverSocket;
	private List<PMClient> clientSocket;
	private PMSeatDAO pms_dao;
	private PMSeatLocVO[][] seat;
		
	public PMSeatController(PMSeatView pmsv) {
		//DAO¿¬°á
		this.pmsv = pmsv;
		pms_dao = PMSeatDAO.getInstance();
		setServer();
		setBtnSeat();
	}//constructor
	
	private void setServer() {
		
	}
	
	private void setBtnSeat() {
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pmsv.getBtnSet()) {
			openSeatSet();
		}
		
		if (e.getSource() == pmsv.getBtnSeat()[0][0]) {
			System.out.println("¤·¤µ¤·");
		}
	}
	private void openSeatSet() {
		new PMSeatSetView();
	}
	private void openPopBtn() {
		
	}
	private void openSeatDetail() {
		
	}
	private void visibleMsg() {
		
	}
	
	
	
	@Override
	public void run() {
		
	}
	
	private void recieveClient() {
		
	}
	private void dropClient() {
		
	}
	private void readSeatInfo() {
		
	}
	
}
