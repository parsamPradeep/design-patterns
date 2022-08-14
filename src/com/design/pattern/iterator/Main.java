package com.design.pattern.iterator;

public class Main {

	public static void main(String[] args) {
		BrowserHistory bHistory=new BrowserHistory();
		bHistory.push("a");
		bHistory.push("b");
		bHistory.push("c");
		
		Iterator<String> iterator=bHistory.createIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.current());
			iterator.next();
		}
	}

}
