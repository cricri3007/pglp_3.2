package com.chris;

public class Vendeur extends allEmploye {
	private double commission;
	
	@Override
	public double calculSalaire() {
		return super.calculSalaire() + commission;
	}
	
}
