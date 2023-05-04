package fr.esgi.poo.java;


public class Elector{
	private final int id;
	private static int cpt = 0;
	private Candidate c = null; 
	
	public Elector(){
		cpt++;
		id = cpt;
	}
	
	public int getID(){
		return id;
	}
	
	public Candidate getCandidate(){
		return c;
	}
	
	public void voteFor(Candidate c){
		if(this.c == null){
			this.c = c;
			System.out.println("Elector"+this.id+" a voté pour un candidat "+c.getName());
		}else{
			System.out.println("Elector"+this.id+" ne peut pas voter pour "+c.getName()+" car il a deja voter pour un candidat !");
		}
	}
}
