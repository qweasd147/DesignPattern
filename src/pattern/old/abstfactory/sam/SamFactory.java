package pattern.old.abstfactory.sam;

import pattern.old.abstfactory.BikeFactory;
import pattern.old.abstfactory.Body;
import pattern.old.abstfactory.Wheel;

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
