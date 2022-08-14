package com.design.pattern.iterator;

public interface Iterator<T> {
	void next();
	T current();
	boolean hasNext();
}

// class ABC implements Iterator<String>
//class User implements Iterator<User>