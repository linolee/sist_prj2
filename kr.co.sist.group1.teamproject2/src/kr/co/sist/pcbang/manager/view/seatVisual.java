package kr.co.sist.pcbang.manager.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class seatVisual extends JFrame {

	Seat seat;
	JButton[][] btnSeat;
	
	public seatVisual() {
		seat = new Seat();
		btnSeat = new JButton[seat.seat.length][seat.seat[0].length];
		
		for (int i = 0; i < seat.seat.length; i++) {
			for (int j = 0; j < seat.seat[i].length; j++) {
				btnSeat[i][j] = new JButton(seat.seat[i][j].toString());
				switch (seat.seat[i][j]) {
				case 0:
					btnSeat[i][j].setBackground(Color.GRAY);
					break;
				default:
					btnSeat[i][j].setBackground(Color.WHITE);
				}
			}
		}
				
		JPanel pnl = new JPanel(new GridLayout(seat.seat.length, seat.seat[0].length));
		for (int i = 0; i < seat.seat.length; i++) {
			for (int j = 0; j < seat.seat[i].length; j++) {
				pnl.add(btnSeat[i][j]);
			}
		}
		add(pnl);
		setBounds(100, 100, 800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new seatVisual();
	}
}
