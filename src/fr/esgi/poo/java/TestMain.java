package fr.esgi.poo.java;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestMain{
	public static void main(String[] args){
		System.out.println("Hello world !");
		System.out.println();
		
		System.out.println();
		Candidate c1 = new Candidate("Hari");
		Candidate c2 = new Candidate("Arunthina");
		Candidate c3 = new Candidate("Vithu");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println();
	
		
		ArrayList<Candidate> candidates = new ArrayList<>();
        candidates.add(c1);
        candidates.add(c2);
        candidates.add(c3);
        
        ArrayList<Elector> electors = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            electors.add(new Elector());
        }
        
        System.out.println("OUVERTURE DU VOTE");
        System.out.println("________________________________________________________");
        System.out.println();
        for(int j = 1; j <= 100; j++){
        	int electorsIndex = (int) (Math.random() * electors.size());
            int candidateIndex = (int) (Math.random() * candidates.size());
            Candidate candidate = candidates.get(candidateIndex);
            electors.get(electorsIndex).voteFor(candidate);
  
          
        }
        
        System.out.println();
        
        Map<Candidate, Integer> votes = new HashMap<>();
        for (Candidate candidate : candidates) {
            votes.put(candidate, 0);
        }

        for (Elector elector : electors) {
            Candidate candidate = elector.getCandidate();
            votes.put(candidate, votes.get(candidate) + 1);
            System.out.println("Elector " + elector.getID() + " a voté pour " + candidate.getName());
        }
		System.out.println();
        System.out.println("Election results:");
        System.out.println();
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getName() + " a " + votes.get(candidate) + " votes");
        }
        System.out.println();
        int MAX = 0;
        Candidate c = null;
        for(Candidate candidate : candidates){
        	if(votes.get(candidate) > MAX){
        		MAX = votes.get(candidate);
        		c = candidate;
        	}
        }
        
        System.out.println(c.getName() + " passe au tour suivant.");
        System.out.println();
        System.out.println("FERMETURE DU VOTE");
        System.out.println("________________________________________________________");
      
    }
}


