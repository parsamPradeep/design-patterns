package com.design.pattern.facade;

public class Main {

	public static void main(String[] args) {
		var notificationService =  new NotificationService();
		notificationService.send("Hello word", "target");
	}

}
