package com.design.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
	private final List<EditorState> history = new ArrayList<>();

	public void push(EditorState content) {
		history.add(content);
	}

	public EditorState pop() {
		int lastIndex = history.size() - 1;
		EditorState lastState = history.get(lastIndex);
		history.remove(lastState);
		return lastState;
	}
}
