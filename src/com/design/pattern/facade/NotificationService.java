package com.design.pattern.facade;

public class NotificationService {
	public void send(String message, String target) {
	var server=new NotificationServer();
	var connection = server.connect("ip");
	var authToken = server.authenticate("appId", "key");
	server.send(new Message(message), authToken, target);
	connection.disconnect();
	}
	
}
