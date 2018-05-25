package pattern.abstfactory.sam;

import pattern.abstfactory.BikeFactory;
import pattern.abstfactory.Body;
import pattern.abstfactory.Wheel;

public class SamFactory implements BikeFactory{

	@Override
	public Body createBody() {
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		return new SamWheel();
	}


}
