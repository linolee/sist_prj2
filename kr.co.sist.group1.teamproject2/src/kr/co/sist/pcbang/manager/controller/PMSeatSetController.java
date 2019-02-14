package kr.co.sist.pcbang.manager.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import kr.co.sist.pcbang.manager.model.PMSeatDAO;
import kr.co.sist.pcbang.manager.view.PMSeatSetView;
import kr.co.sist.pcbang.manager.vo.PMSeatSetVO;

public class PMSeatSetController implements ActionListener{
	private PMSeatSetView pmssv;
	private PMSeatDAO pms_dao;
	private PMSeatSetVO[][] seat;
	
	public PMSeatSetController(PMSeatSetView pmssv) {
		this.pmssv = pmssv;
		pms_dao = PMSeatDAO.getInstance();
		
		
		
	}//constructor
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pmssv.getBtnSeatSave()) {
			seatSave(seat);
		}
		if (e.getSource() == pmssv.getBtnSeatLoad()) {
			seatLoad();
		}
		if (e.getSource() == pmssv.getBtnSeatReset()) {
			seatReset();
		}
		
	}
	
	private void seatSave(PMSeatSetVO[][] seat) {
		
	}
	private void seatLoad() {
		
	}
	private void seatReset() {
		
	}
	

}
