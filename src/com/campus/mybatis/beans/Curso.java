package com.campus.mybatis.beans;

import java.math.BigDecimal;
import java.util.Date;

public class Curso {

	public static final String TIPO_FORMACION_DISTANCIA 	= "Distancia";
	public static final String TIPO_FORMACION_ONLINE 		= "OnLine";
	public static final String TIPO_FORMACION_PRESENCIAL 	= "Presencial";
	
	private String id;
	private String name;
	private String description;
	private String tipoCurso;
	private String tipoFormacion;
	private Date fechaInicio;
	private Date fechaFin;
	private Integer activo;
	private BigDecimal precio;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTipoCurso() {
		return tipoCurso;
	}

	public void setTipoCurso(String tipoCurso) {
		this.tipoCurso = tipoCurso;
	}

	public String getTipoFormacion() {
		return tipoFormacion;
	}

	public void setTipoFormacion(String tipoFormacion) {
		this.tipoFormacion = tipoFormacion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", name=" + name + ", description=" + description + ", tipoCurso=" + tipoCurso
				+ ", tipoFormacion=" + tipoFormacion + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", activo=" + activo + ", precio=" + precio + "]";
	}

}
