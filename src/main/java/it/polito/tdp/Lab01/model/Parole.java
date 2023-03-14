package it.polito.tdp.Lab01.model;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	LinkedList<String> listaParole=new LinkedList<String>();
		
	public Parole() {
		//TODO
	}
	
	public void addParola(String p) {
		listaParole.add(p);	}
	
	public List<String> getElenco() {
		Collections.sort(listaParole, new comparatoreAlfabetico());
	  return listaParole;
	}
	
	public void reset() {
	 listaParole.removeAll(listaParole);
	}
	
	
	  public  void deleteParola(String s) {
            for(String a: listaParole) {
            	if(s.compareTo(a)==0)
            		listaParole.remove(a);
            }
	    }

}