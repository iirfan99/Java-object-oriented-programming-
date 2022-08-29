package com.labs.lab10;

public class Pet extends LivingCreature {
	private MovementType mt;
	private boolean isDog;

	public Pet(String id, int year, boolean isDog, MovementType mt){

		super(id,year);
		this.mt = mt;
		this.isDog = isDog;

	}

	@Override
	public String toString() {

		return "This pest's name is "+ getName()+". This pet is " + ( isDog ? "" :"not ") +"a dog. THis pet is "+ getAge() +" years old. This pet can "+ this.mt.getStringValue()+".";
	}
}