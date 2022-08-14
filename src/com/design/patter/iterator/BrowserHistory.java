package com.design.patter.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
	private List<String> history = new ArrayList<>();
	
	public void push(String item) {
		history.add(item);
	}
	
	public String pop() {
		int lastIndex=history.size()-1;
		String removedItem=history.get(lastIndex);
		history.remove(lastIndex);
		return removedItem;
	}
	
	public Iterator<String> createIterator(){
		return new ListIterator(this);
	}
	
	public class ListIterator implements Iterator<String>{
		private int index;
		private BrowserHistory browserHistory;
		
		public ListIterator(BrowserHistory browserHistory) {
			this.browserHistory = browserHistory;
		}

		@Override
		public void next() {
			index++;
		}

		@Override
		public String current() {
			return browserHistory.history.get(index);
		}

		@Override
		public boolean hasNext() {
			return (index < browserHistory.history.size());
		}
		
	}
}
