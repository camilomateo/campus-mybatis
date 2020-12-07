package com.campus.mybatis.beans;

public class Matricula {
	
	// Por inyeccion
	private Contacto itemContacto;
	private ContactoCstm itemContactoCstm;
	private Curso itemCurso;
	private TipoCurso itemTipoCurso;
	private Usuario itemUsuario;
	
	
	// Datos personal
	private String pCodigoDeAlumno;
	private String pFechaDeMatricula;
	private String pComercial;
	private String pApellidos;
	private String pNombre;
	private String pTelefono;
	private String pMovil;
	private String pDNI;
	private String pEmail;
	private String pNacionalidad;
	private String pLugarDeNacimiento;
	private String pFecha;
	private String pEdad;
	private String pDomicilio;
	private String pLocalidad;
	private String pProvincia;
	private String pCP;
	private String pProfesion;
	private String pEstudios;
	private String pCurso;
	private String pMedio;
	private String pObservaciones;
	// Condiciones de pago
	private String cpImporteTotal;
	private String cpImporteInicial;
	private String cpTipoPago;
	private String cpTipoPagoPlazos;
	private String cpNumeroPlazos;
	private String cpImportePlazo;
	private String cpDiaMes;
	private String cpNumeroTarjetaCredito;
	private String cpMesCaducidadTarjeta;
	private String cpAnnoCaducidadTarjeta;
	// Domicilio entrega
	private String deDomicilio;
	private String deLocalidad;
	private String deProvincia;
	private String deCP;
	private String deTelefono;
	// Factura
	private Boolean fa;
	private String faNombre;
	private String faNIF;
	private String faDomicilio;
	private String faLocalidad;
	private String faProvincia;
	private String faTelefono;
	private String faCP;
	
	
	public String getpCodigoDeAlumno() {
		return pCodigoDeAlumno;
	}
	public void setpCodigoDeAlumno(String pCondigoDeAlumno) {
		this.pCodigoDeAlumno = pCondigoDeAlumno;
	}
	public String getpFechaDeMatricula() {
		return pFechaDeMatricula;
	}
	public void setpFechaDeMatricula(String pFechaDeMatricula) {
		this.pFechaDeMatricula = pFechaDeMatricula;
	}
	public String getpComercial() {
		return pComercial;
	}
	public void setpComercial(String pComercial) {
		this.pComercial = pComercial;
	}
	public String getpApellidos() {
		return pApellidos;
	}
	public void setpApellidos(String pApellidos) {
		this.pApellidos = pApellidos;
	}
	public String getpNombre() {
		return pNombre;
	}
	public void setpNombre(String pNombre) {
		this.pNombre = pNombre;
	}
	public String getpTelefono() {
		return pTelefono;
	}
	public void setpTelefono(String pTelefono) {
		this.pTelefono = pTelefono;
	}
	public String getpMovil() {
		return pMovil;
	}
	public void setpMovil(String pMovil) {
		this.pMovil = pMovil;
	}
	public String getpDNI() {
		return pDNI;
	}
	public void setpDNI(String pDNI) {
		this.pDNI = pDNI;
	}
	public String getpEmail() {
		return pEmail;
	}
	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}
	public String getpNacionalidad() {
		return pNacionalidad;
	}
	public void setpNacionalidad(String pNacionalidad) {
		this.pNacionalidad = pNacionalidad;
	}
	public String getpLugarDeNacimiento() {
		return pLugarDeNacimiento;
	}
	public void setpLugarDeNacimiento(String pLugarDeNacimiento) {
		this.pLugarDeNacimiento = pLugarDeNacimiento;
	}
	public String getpFecha() {
		return pFecha;
	}
	public void setpFecha(String pFecha) {
		this.pFecha = pFecha;
	}
	public String getpEdad() {
		return pEdad;
	}
	public void setpEdad(String pEdad) {
		this.pEdad = pEdad;
	}
	public String getpDomicilio() {
		return pDomicilio;
	}
	public void setpDomicilio(String pDomicilio) {
		this.pDomicilio = pDomicilio;
	}
	public String getpLocalidad() {
		return pLocalidad;
	}
	public void setpLocalidad(String pLocalidad) {
		this.pLocalidad = pLocalidad;
	}
	public String getpProvincia() {
		return pProvincia;
	}
	public void setpProvincia(String pProvincia) {
		this.pProvincia = pProvincia;
	}
	public String getpCP() {
		return pCP;
	}
	public void setpCP(String pCP) {
		this.pCP = pCP;
	}
	public String getpProfesion() {
		return pProfesion;
	}
	public void setpProfesion(String pProfesion) {
		this.pProfesion = pProfesion;
	}
	public String getpEstudios() {
		return pEstudios;
	}
	public void setpEstudios(String pEstudios) {
		this.pEstudios = pEstudios;
	}
	public String getpCurso() {
		return pCurso;
	}
	public void setpCurso(String pCurso) {
		this.pCurso = pCurso;
	}
	public String getpMedio() {
		return pMedio;
	}
	public void setpMedio(String pMedio) {
		this.pMedio = pMedio;
	}
	public String getpObservaciones() {
		return pObservaciones;
	}
	public void setpObservaciones(String pObservaciones) {
		this.pObservaciones = pObservaciones;
	}
	public String getCpTipoPagoPlazos() {
		return cpTipoPagoPlazos;
	}
	public void setCpTipoPagoPlazos(String cpTipoPagoPlazos) {
		this.cpTipoPagoPlazos = cpTipoPagoPlazos;
	}
	public String getCpAnnoCaducidadTarjeta() {
		return cpAnnoCaducidadTarjeta;
	}
	public void setCpAnnoCaducidadTarjeta(String cpAnnoCaducidadTarjeta) {
		this.cpAnnoCaducidadTarjeta = cpAnnoCaducidadTarjeta;
	}
	public String getCpMesCaducidadTarjeta() {
		return cpMesCaducidadTarjeta;
	}
	public void setCpMesCaducidadTarjeta(String cpMesCaducidadTarjeta) {
		this.cpMesCaducidadTarjeta = cpMesCaducidadTarjeta;
	}
	public String getCpNumeroTarjetaCredito() {
		return cpNumeroTarjetaCredito;
	}
	public void setCpNumeroTarjetaCredito(String cpNumeroTarjetaCredito) {
		this.cpNumeroTarjetaCredito = cpNumeroTarjetaCredito;
	}
	public String getCpDiaMes() {
		return cpDiaMes;
	}
	public void setCpDiaMes(String cpDiaMes) {
		this.cpDiaMes = cpDiaMes;
	}
	public String getCpImportePlazo() {
		return cpImportePlazo;
	}
	public void setCpImportePlazo(String cpImportePlazo) {
		this.cpImportePlazo = cpImportePlazo;
	}
	public String getCpTipoPago() {
		return cpTipoPago;
	}
	public void setCpTipoPago(String cpTipoPago) {
		this.cpTipoPago = cpTipoPago;
	}
	public String getCpImporteInicial() {
		return cpImporteInicial;
	}
	public void setCpImporteInicial(String cpImporteInicial) {
		this.cpImporteInicial = cpImporteInicial;
	}
	public String getCpNumeroPlazos() {
		return cpNumeroPlazos;
	}
	public void setCpNumeroPlazos(String cpNumeroPlazos) {
		this.cpNumeroPlazos = cpNumeroPlazos;
	}
	public String getCpImporteTotal() {
		return cpImporteTotal;
	}
	public void setCpImporteTotal(String cpImporteTotal) {
		this.cpImporteTotal = cpImporteTotal;
	}
	public String getDeDomicilio() {
		return deDomicilio;
	}
	public void setDeDomicilio(String deDomicilio) {
		this.deDomicilio = deDomicilio;
	}
	public String getDeLocalidad() {
		return deLocalidad;
	}
	public void setDeLocalidad(String deLocalidad) {
		this.deLocalidad = deLocalidad;
	}
	public String getDeProvincia() {
		return deProvincia;
	}
	public void setDeProvincia(String deProvincia) {
		this.deProvincia = deProvincia;
	}
	public String getDeCP() {
		return deCP;
	}
	public void setDeCP(String deCP) {
		this.deCP = deCP;
	}
	public String getDeTelefono() {
		return deTelefono;
	}
	public void setDeTelefono(String deTelefono) {
		this.deTelefono = deTelefono;
	}
	
	public Boolean getFa() {
		return fa;
	}
	public void setFa(Boolean fa) {
		this.fa = fa;
	}
	public String getFaNombre() {
		return faNombre;
	}
	public void setFaNombre(String faNombre) {
		this.faNombre = faNombre;
	}
	public String getFaNIF() {
		return faNIF;
	}
	public void setFaNIF(String faNIF) {
		this.faNIF = faNIF;
	}
	public String getFaDomicilio() {
		return faDomicilio;
	}
	public void setFaDomicilio(String faDomicilio) {
		this.faDomicilio = faDomicilio;
	}
	public String getFaLocalidad() {
		return faLocalidad;
	}
	public void setFaLocalidad(String faLocalidad) {
		this.faLocalidad = faLocalidad;
	}
	public String getFaTelefono() {
		return faTelefono;
	}
	public void setFaTelefono(String faTelefono) {
		this.faTelefono = faTelefono;
	}
	public String getFaCP() {
		return faCP;
	}
	public void setFaCP(String faCP) {
		this.faCP = faCP;
	}
	public String getFaProvincia() {
		return faProvincia;
	}
	public void setFaProvincia(String faProvincia) {
		this.faProvincia = faProvincia;
	}
	
	@Override
	public String toString() {
		return "Matricula [itemContacto=" + itemContacto + ", itemContactoCstm=" + itemContactoCstm + ", itemCurso="
				+ itemCurso + ", itemTipoCurso=" + itemTipoCurso + ", itemUsuario=" + itemUsuario + ", pCodigoDeAlumno="
				+ pCodigoDeAlumno + ", pFechaDeMatricula=" + pFechaDeMatricula + ", pComercial=" + pComercial
				+ ", pApellidos=" + pApellidos + ", pNombre=" + pNombre + ", pTelefono=" + pTelefono + ", pMovil="
				+ pMovil + ", pDNI=" + pDNI + ", pEmail=" + pEmail + ", pNacionalidad=" + pNacionalidad
				+ ", pLugarDeNacimiento=" + pLugarDeNacimiento + ", pFecha=" + pFecha + ", pEdad=" + pEdad
				+ ", pDomicilio=" + pDomicilio + ", pLocalidad=" + pLocalidad + ", pProvincia=" + pProvincia + ", pCP="
				+ pCP + ", pProfesion=" + pProfesion + ", pEstudios=" + pEstudios + ", pCurso=" + pCurso + ", pMedio="
				+ pMedio + ", pObservaciones=" + pObservaciones + ", cpImporteTotal=" + cpImporteTotal
				+ ", cpImporteInicial=" + cpImporteInicial + ", cpTipoPago=" + cpTipoPago + ", cpTipoPagoPlazos="
				+ cpTipoPagoPlazos + ", cpNumeroPlazos=" + cpNumeroPlazos + ", cpImportePlazo=" + cpImportePlazo
				+ ", cpDiaMes=" + cpDiaMes + ", cpNumeroTarjetaCredito=" + cpNumeroTarjetaCredito
				+ ", cpMesCaducidadTarjeta=" + cpMesCaducidadTarjeta + ", cpAnnoCaducidadTarjeta="
				+ cpAnnoCaducidadTarjeta + ", deDomicilio=" + deDomicilio + ", deLocalidad=" + deLocalidad
				+ ", deProvincia=" + deProvincia + ", deCP=" + deCP + ", deTelefono=" + deTelefono + ", fa=" + fa
				+ ", faNombre=" + faNombre + ", faNIF=" + faNIF + ", faDomicilio=" + faDomicilio + ", faLocalidad="
				+ faLocalidad + ", faProvincia=" + faProvincia + ", faTelefono=" + faTelefono + ", faCP=" + faCP + "]";
	}
	
	public String toStringDetail() {
		StringBuffer sb = new StringBuffer();
		sb.append("[CABECERA]");
		sb.append("\nCodigo del alumno = "		+ getpCodigoDeAlumno());
		sb.append("\nFecha de matricula =  "	+ getpFechaDeMatricula());
		sb.append("\n\n");
		
		sb.append("\n[DATOS PERSONALES]");
		sb.append("\nApellidos = "				+ getpApellidos());
		sb.append("\nNombre = "					+ getpNombre());
		sb.append("\nTelefono = "				+ getpTelefono());
		sb.append("\nMovil = "					+ getpMovil());
		sb.append("\nDNI = "					+ getpDNI());
		sb.append("\nE-mail = "					+ getpEmail());
		sb.append("\nNacionalidad = "			+ getpNacionalidad());
		sb.append("\nLugar de nacimiento = 	"	+ getpLugarDeNacimiento());
		sb.append("\nFecha = "					+ getpFecha());
		sb.append("\nEdad = "					+ getpEdad());
		sb.append("\nDomicilio = "				+ getpDomicilio());
		sb.append("\nLocalidad = "				+ getpLocalidad());
		sb.append("\nProvincia = "				+ getpProvincia());
		sb.append("\nCP = "						+ getpCP());
		sb.append("\nProfesion = "				+ getpProfesion());
		sb.append("\nEstudios = "				+ getpEstudios());
		sb.append("\nCurso = "					+ getpCurso());
		sb.append("\nMedio = "					+ getpMedio());
		sb.append("\nObservaciones = "			+ getpObservaciones());
		sb.append("\n\n");
		
		sb.append("\n[CONDICIONES DE PAGO]");
		sb.append("\nImporte total = "			+ getCpImporteTotal());
		sb.append("\nPago inicial = "			+ getCpImporteInicial());
		sb.append("\nSe realizará = "			+ getCpTipoPago());
		sb.append("\nResto se realizara = "		+ getCpTipoPagoPlazos());
		sb.append("\nPlazos = "					+ getCpNumeroPlazos());
		sb.append("\nImporte plazo = "			+ getCpImportePlazo());
		sb.append("\nDia = "					+ getCpDiaMes());
		sb.append("\nNumero tarjeta credito = " + getCpNumeroTarjetaCredito());
		sb.append("\nMes caducidad = "			+ getCpMesCaducidadTarjeta());
		sb.append("\nAno caducidad = "			+ getCpAnnoCaducidadTarjeta());
		sb.append("\n\n");
		
		sb.append("\n[DOMICILIO ENTREGA CURSO]");
		sb.append("\nDomicilio = "				+ getDeDomicilio());
		sb.append("\nLocalidad = "				+ getDeLocalidad());
		sb.append("\nProvincia = "				+ getDeProvincia());
		sb.append("\nCP = "						+ getDeCP());
		sb.append("\nTefefono = "				+ getDeTelefono());
		sb.append("\n\n");		
		
		sb.append("\n[FACTURA]");
		sb.append("\nFactura = "				+ getFa());
		sb.append("\nNombre = "					+ getFaNombre());
		sb.append("\nDomicilio = "				+ getFaDomicilio());
		sb.append("\nLocalidad = "				+ getFaLocalidad());
		sb.append("\nProvincia = "				+ getFaProvincia());
		sb.append("\nCP = "						+ getFaCP());
		sb.append("\nTefefono = "				+ getFaTelefono());
		sb.append("\n\n");	
		
		return sb.toString();
		
	}
	
}
