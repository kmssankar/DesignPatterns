package org.designpattern.creational.builder;

interface CarPlan {
	
		public void setEngine(String engine);
	 
	    public void setExterior(String exterior);
	 
	    public void setColor(String color);
	 
	    public void setVarient(String varient);
}


class Car implements CarPlan
{
	String engine;
	String exterior;
	String color;
	String varient;
	
	@Override
	public void setEngine(String Engine) {
		this.engine=Engine;	
	}

	@Override
	public void setExterior(String exterior) {
		this.exterior=exterior;	
	}

	@Override
	public void setColor(String color) {
		this.color = color;	
	}

	@Override
	public void setVarient(String varient) {
		this.varient = varient;	
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", exterior=" + exterior + ", color=" + color + ", varient=" + varient + "]";
	}
	
	
}