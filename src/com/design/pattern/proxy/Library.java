package com.design.pattern.proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
	private Map<String, Ebook> ebook=new HashMap<>();
	public void add(Ebook eBook) {
		ebook.put(eBook.getFileName(), eBook);
	}
	
	public 	void openEbook(String fileName) {
		ebook.get(fileName).show();
	}
	
}
