package com.campus.mybatis.beans;

import java.math.BigDecimal;

public class TipoCurso {

	private String idC;
	private String siglasC;
	private String codigoC;
	private BigDecimal precioSegundaC;
	private BigDecimal precioTerceraC;
	private BigDecimal precioPromocionC;

	public String getIdC() {
		return idC;
	}

	public void setIdC(String idC) {
		this.idC = idC;
	}

	public String getSiglasC() {
		return siglasC;
	}

	public void setSiglasC(String siglasC) {
		this.siglasC = siglasC;
	}

	public String getCodigoC() {
		return codigoC;
	}

	public void setCodigoC(String codigoC) {
		this.codigoC = codigoC;
	}

	public BigDecimal getPrecioSegundaC() {
		return precioSegundaC;
	}

	public void setPrecioSegundaC(BigDecimal precioSegundaC) {
		this.precioSegundaC = precioSegundaC;
	}

	public BigDecimal getPrecioTerceraC() {
		return precioTerceraC;
	}

	public void setPrecioTerceraC(BigDecimal precioTerceraC) {
		this.precioTerceraC = precioTerceraC;
	}

	public BigDecimal getPrecioPromocionC() {
		return precioPromocionC;
	}

	public void setPrecioPromocionC(BigDecimal precioPromocionC) {
		this.precioPromocionC = precioPromocionC;
	}

	@Override
	public String toString() {
		return "TipoCurso [idC=" + idC + ", siglasC=" + siglasC + ", codigoC=" + codigoC + ", precioSegundaC="
				+ precioSegundaC + ", precioTerceraC=" + precioTerceraC + ", precioPromocionC=" + precioPromocionC
				+ "]";
	}
	
	
}
