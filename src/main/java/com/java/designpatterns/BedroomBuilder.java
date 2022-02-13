package com.java.designpatterns;

public class BedroomBuilder {
	private int ceilingHeight;
	private int floorNumber;
	private boolean isDouble;

	public BedroomBuilder setCeilingHeight(int ceilingHeight) {
		this.ceilingHeight = ceilingHeight;
		return this;
	}
	public BedroomBuilder setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
		return this;
	}
	public BedroomBuilder setDouble(boolean isDouble) {
		this.isDouble = isDouble;
		return this;
	}
	
	public Bedroom createBedroom() {
		return new Bedroom(ceilingHeight, floorNumber, isDouble);
	}
	public int getCeilingHeight() {
		return ceilingHeight;
	}
	public int getFloorNumber() {
		return floorNumber;
	}
	public boolean isDouble() {
		return isDouble;
	}
	
	
}
