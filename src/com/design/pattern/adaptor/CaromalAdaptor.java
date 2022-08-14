package com.design.pattern.adaptor;

import com.design.pattern.adaptor.thirdPartyFilters.Caromal;

public class CaromalAdaptor implements Filter  {
	
	private Caromal caromal;
	public CaromalAdaptor(Caromal caromal) {
		this.caromal = caromal;
	}
	@Override
	public void apply(Image image) {
		caromal.init();
		caromal.render(image);
	}

}
