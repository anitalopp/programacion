package com.spotify.dtos;

import java.util.Comparator;

public class ComparadorTitulo implements Comparator<CancionDTO>{

	@Override
	public int compare(CancionDTO o1, CancionDTO o2) {
		return o1.getTitulo().compareTo(o2.getTitulo());
		
	}

}
