package edu.kh.network.run;

import edu.kh.network.model.service.TCPService;

public class networkRun {

	public static void main(String[] args) {

		TCPService tcp = new TCPService();
		tcp.serverStart();
	}

}
