package com.design.pattern.proxy;

public class Main {

	public static void main(String[] args) {
		var lib = new Library();
		String [] fineNames= {"a", "b","c"};
		for(String file: fineNames)
			lib.add(new EbookProxy(file));
		lib.openEbook("a");
	}

}
