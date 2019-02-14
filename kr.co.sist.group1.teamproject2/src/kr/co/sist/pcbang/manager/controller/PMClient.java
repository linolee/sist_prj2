package kr.co.sist.pcbang.manager.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class PMClient implements Runnable{
	private Socket client;
	private DataInputStream dis;
	private DataOutputStream dos;
	
	public PMClient(Socket client) {
		this.client = client;
		
		
	}
	private void openMsg() {
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	private void readStream() {
		
	}
	
	public void sendMsg(String msg) {
		
	}

}
