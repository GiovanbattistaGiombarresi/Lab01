package it.polito.tdp.Lab01.model;

import java.util.Comparator;

public class comparatoreAlfabetico implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}

}
