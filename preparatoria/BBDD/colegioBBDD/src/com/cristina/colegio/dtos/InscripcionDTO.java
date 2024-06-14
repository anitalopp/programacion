package com.cristina.colegio.dtos;

public class InscripcionDTO {
	
	// En el DTO ponemos los datos de la consulta de buscar con Filtros.

	private String idCurso;
	private String nombreCurso;
	private String idEstudiante;
	private String nombreEstudiante;
	
	public InscripcionDTO(String idCurso, String nombreCurso, String idEstudiante, String nombreEstudiante) {
		super();
		this.idCurso = idCurso;
		this.nombreCurso = nombreCurso;
		this.idEstudiante = idEstudiante;
		this.nombreEstudiante = nombreEstudiante;
	}
	public String getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(String idCurso) {
		this.idCurso = idCurso;
	}
	public String getNombreCurso() {
		return nombreCurso;
	}
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	public String getIdEstudiante() {
		return idEstudiante;
	}
	public void setIdEstudiante(String idEstudiante) {
		this.idEstudiante = idEstudiante;
	}
	public String getNombreEstudiante() {
		return nombreEstudiante;
	}
	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}
	@Override
	public String toString() {
		return "InscripcionDTO [idCurso = " + idCurso + ", nombreCurso = " + nombreCurso + ", idEstudiante = " + idEstudiante
				+ ", nombreEstudiante = " + nombreEstudiante + "]";
	}
	
	
	
}
