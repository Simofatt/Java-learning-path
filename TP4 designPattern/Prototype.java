package TP4;

public abstract class Prototype implements Cloneable {
	@Override
	protected Prototype clone() throws CloneNotSupportedException {
		Prototype prototype=(Prototype) super.clone();
		return prototype;
	}
	
	public abstract void informations();
}
