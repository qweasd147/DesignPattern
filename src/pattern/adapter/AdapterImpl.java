package pattern.adapter;

public class AdapterImpl implements Adapter{
	
	
	@Override
	public Float twiceOf(Float f) {
		
		//return (float) Math.twoTime(f.doubleValue());
		return Math.dobuled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		return (float) Math.half(f.doubleValue());
	}


}
