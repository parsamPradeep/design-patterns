package com.desing.pattern.memento;

public class Main {

	public static void main(String[] args) {
		History his=new History();
		Editor edi=new Editor();
		
		
		edi.setContent("First Content");
		his.push(edi.createState());
		
		edi.setContent("Second Content");
		his.push(edi.createState());

		edi.setContent("Third Content");
		his.push(edi.createState());
		
		edi.setContent("Fourth Content");
		//his.push(edi.createState());
		System.out.println(edi.getContent());
		edi.restore(his.pop());
		edi.restore(his.pop());
		
		System.out.println(edi.getContent());
		
	}

}
