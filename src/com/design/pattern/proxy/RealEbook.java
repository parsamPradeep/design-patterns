	package com.design.pattern.proxy;

public class RealEbook implements Ebook {
	private String fileName;

	public RealEbook(String fileName) {
		this.fileName = fileName;
		load();
	}
	
	private void load() {
		System.out.println("Loading Ebook "+ fileName);
	}
	
	@Override
	public void show() {
		System.out.println("showing e-book "+fileName);
	}
	
	@Override
	public String getFileName() {
		return fileName;
	}
}
