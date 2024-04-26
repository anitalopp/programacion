package com.censo.dtos;

import java.util.Comparator;

public class ComparaMarca implements Comparator<CocheDTO> {

	public int compare(CocheDTO o1, CocheDTO o2) {
		return o1.getMarca().compareTo(o2.getMarca());
	}

}
