package com.spotify.dtos;

import java.util.Comparator;

public class ComparadorArtista implements Comparator<CancionDTO>{

	@Override
	public int compare(CancionDTO o1, CancionDTO o2) {
		return o1.getArtista().compareTo(o2.getArtista());
	}

}
