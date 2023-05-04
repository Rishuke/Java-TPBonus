package fr.esgi.poo.java;


public class Candidate{
	private String name;
	
	public Candidate(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		return "Je suis le candidat "+this.name+".";
	}
	
}
