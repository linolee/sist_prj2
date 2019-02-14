package kr.co.sist.pcbang.manager.view;

public class Seat {

	Integer[][] seat;
	
	public Seat() {
		
		seat = new Integer[10][10];
		
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = 0;
			}
		}
		
		for (int i = 1; i < 7; i++) {
			for (int j = 2; j < 5; j++) {
				seat[i][j] = i*10+j;
			}
		}

		
		
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat.length; j++) {
				System.out.print(seat[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		new Seat();
	}
	
}
