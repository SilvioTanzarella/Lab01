package it.polito.tdp.parole.model;

import java.util.*;

public class Parole{
	
	private List<String> parole;
		
	public Parole() {
		this.parole = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		parole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(this.parole);
		return this.parole;
	}
	
	public void reset() {
		this.parole.clear();
	}
	
	public void eliminaParola(String p) {
		this.parole.remove(p);
	}
	
	public String descriviti() {
		String s = "";
		for(String i:this.parole) {
			s += i+"\n";
		}
		return s;
		
	}
	
	

}
