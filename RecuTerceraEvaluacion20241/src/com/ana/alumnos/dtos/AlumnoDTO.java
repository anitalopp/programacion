package com.ana.alumnos.dtos;

public class AlumnoDTO {

	private String nombreAlumno;
	private Integer id;
	private String idMunicipio;
	private String nombreMunicipio;
	private Integer familiaNumerosa;

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(String idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public String getNombreMunicipio() {
		return nombreMunicipio;
	}

	public void setNombreMunicipio(String nombreMunicipio) {
		this.nombreMunicipio = nombreMunicipio;
	}

	public Integer isFamiliaNumerosa() {
		return familiaNumerosa;
	}

	public void setFamiliaNumerosa(Integer familiaNumerosa) {
		this.familiaNumerosa = familiaNumerosa;
	}

	@Override
	public String toString() {
		return "InscripcionDTO [nombreAlumno=" + nombreAlumno + ", id=" + id + ", idMunicipio=" + idMunicipio
				+ ", nombreMunicipio=" + nombreMunicipio + ", familiaNumerosa=" + familiaNumerosa + "]";
	}

	public AlumnoDTO(String nombreAlumno, int id, String idMunicipio, String nombreMunicipio,
			Integer familiaNumerosa) {
		super();
		this.nombreAlumno = nombreAlumno;
		this.id = id;
		this.idMunicipio = idMunicipio;
		this.nombreMunicipio = nombreMunicipio;
		this.familiaNumerosa = familiaNumerosa;
	}

}
