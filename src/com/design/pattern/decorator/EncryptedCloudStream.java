package com.design.pattern.decorator;

public class EncryptedCloudStream implements Stream {
	
	private Stream stream;
	
	public EncryptedCloudStream(Stream stream) {
		this.stream=stream;
	}
	@Override
	public void write(String data) {
		var encrpted = encrpt(data);
		stream.write(encrpted);
	}
	private String encrpt(String data) {
		return "%^$^&&(*&))";
	}

}
