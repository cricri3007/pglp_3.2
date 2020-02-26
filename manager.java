package com.chris;

public class Manager extends allEmploye {
	private int nbSousFifres;
	
	@Override
	public double calculSalaire() {
		return super.calculSalaire() + nbSousFifres * 100;
	}
	
}
