package com.design.pattern.adaptor;

import com.design.pattern.adaptor.thirdPartyFilters.Caromal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var imageView = new ImageView(new Image());
		imageView.apply(new VividFilter());
		imageView.apply(new CaromalAdaptor(new Caromal()));
	}

}
