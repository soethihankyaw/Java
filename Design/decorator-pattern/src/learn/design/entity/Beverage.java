package learn.design.entity;

public abstract class Beverage {
	
	protected String description;
	
	Size size = Size.TALL;
	
	public abstract double cost();
	
	public String getDescription() {
		return description;
	}
	
	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
	
	public enum Size {
		TALL, GRANDE, VENTI
	}
}
