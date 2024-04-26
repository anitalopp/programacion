package com.censo.dtos;

import java.util.Comparator;

public class ComparaModelo implements Comparator<CocheDTO>{

	public int compare(CocheDTO o1, CocheDTO o2) {
		return o1.getModelo().compareTo(o2.getModelo());
	}

}
