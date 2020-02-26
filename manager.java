package com.chris;

public class Manager extends allEmploye {
	private final int base=1500;
	private int nbEmploye;
	
	public Manager(int nbEmploye){
		this.nbEmploye=nbEmploye;
	}
	
	@Override
	public double calculSalaire() {
		return super.calculSalaire() + nbEmploye * 100;
	}
	
}
