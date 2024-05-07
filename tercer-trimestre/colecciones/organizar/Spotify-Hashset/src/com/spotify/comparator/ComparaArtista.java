package com.spotify.comparator;


import java.util.Comparator;

import com.spotify.tipos.Cancion;

public class ComparaArtista implements Comparator<Cancion>{

		@Override
		public int compare(Cancion o1, Cancion o2) {
			// TODO Auto-generated method stub
			return o1.getArtista().compareTo(o2.getArtista());
		}
		
	}