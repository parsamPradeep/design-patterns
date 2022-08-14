package com.design.pattern.facade;

public class NotificationServer {

	// connection() -> Coonection;
	// authentication(app_Id, key)-> AuthToken;
	// send(authToken, message, target)
	// conn.disconnect();
	public Connection connect(String iP) {
		return new Connection();
	}

	public AuthToken authenticate(String appId, String key) {
		return new AuthToken();
	}

	public void send(Message message, AuthToken auth, String target) {
		System.out.println("Sending a message");
	}
}
