package com.campus.mybatis.services;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.logging.*;

import org.apache.commons.lang3.*;
import org.apache.ibatis.io.*;
import org.apache.ibatis.session.*;
import org.joda.time.*;

import com.campus.mybatis.beans.*;
import com.campus.mybatis.mapper.*;

public class MatriculaService {

	private final static Logger logger = Logger.getLogger("MatriculaService");
	
	private static SqlSessionFactory sqlSessionFactory = null;
	private static String resource = "com/campus/mybatis/config/mybatis-config.xml";
	public static String version = "1.0";
	
	/**
	 * Constructora
	 */
	public MatriculaService() {
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			
		} catch (IOException e) {
			logger.log(Level.SEVERE, e.toString(), e);
		}	
	}
	
	/**
	 * Dado un idContacto, se rellena el objeto de la matricula
	 * 
	 * @param idContacto Clave del idcontacto 
	 * @param idCurso Clave del curso (opcional)
	 * @return Item de la matricula
	 */
	public Matricula getMatriculaByContacto(String idContacto, String idCurso) {
		Matricula itemMatricula = null;
		
		// Comprobar parametro
		if (StringUtils.isBlank(idContacto)) {
			return null;
		}
		
		// Session
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			ContactoMapper 	mapperContacto 	= session.getMapper(ContactoMapper.class);
			UsuarioMapper 	mapperUsuario 	= session.getMapper(UsuarioMapper.class);
			CursoMapper 	mapperCurso 	= session.getMapper(CursoMapper.class);
			TipoCursoMapper mapperTipoCurso = session.getMapper(TipoCursoMapper.class);
			
			// Leer Contacto
			Contacto itemContacto = mapperContacto.getContactoById(idContacto);
			if (itemContacto==null) itemContacto = new Contacto();
			
			ContactoCstm itemContactoCstm = mapperContacto.getContactoCstmById(idContacto);
			if (itemContactoCstm==null) itemContactoCstm = new ContactoCstm();
			
			// Leer Usuario del contacto
			Usuario itemUsuario = mapperUsuario.getUsuarioById(itemContacto.getIdUsuario());
			if (itemUsuario==null) itemUsuario = new Usuario();
			
			// Leer emails del contacto
			List<String> emails = mapperContacto.getEmailsContactoById(idContacto);
			if (emails==null) emails = new ArrayList<String>();
						
			// Leer cursos del contacto
			Curso itemCurso = null;
			TipoCurso itemTipoCurso = null;
			List<String> cursos = mapperContacto.getIdCursosContactoById(idContacto);
			if (cursos!=null && cursos.size()>0) {
				if (StringUtils.isBlank(idCurso)) {
					itemCurso = mapperCurso.getCursoById(cursos.get(0));
				} else {
					int index = cursos.indexOf(idCurso);
					if (index < 0) index = 0;
					itemCurso = mapperCurso.getCursoById(cursos.get(index));
				}
			}
			if (itemCurso!=null) {
				itemTipoCurso = mapperTipoCurso.getTipoCursoById(itemCurso.getId());
			}
			if (itemCurso==null) itemCurso = new Curso();
			if (itemTipoCurso==null) itemTipoCurso = new TipoCurso();

			/*
			 * DOCUMENTO DE MATRICULA PARA CURSO A DISTANCIA
			 */
			itemMatricula = new Matricula();
			String value = "";
			
			// CodigoDeAlumno
			value = "";
			itemMatricula.setpCodigoDeAlumno(value);
			
			// FechaDeMatricula
			value = dameValor(dameFecha(itemContactoCstm.getFechaMatricula(), ""), false);
			itemMatricula.setpFechaDeMatricula(value);
			
			// Comercial
			value = dameValor(itemUsuario.getFirstName(), true);
			itemMatricula.setpComercial(value);
			
			/*
			 * DATOS PERSONALES
			 */
			
			// Apellidos
			value = dameValor(itemContacto.getLastName(), true);
			itemMatricula.setpApellidos(value);
			
			// Nombre
			value = dameValor(itemContacto.getFirstName(), true);
			itemMatricula.setpNombre(value);
			
			// Telefono
			value = dameValor(itemContacto.getPhoneHome(), false);
			itemMatricula.setpTelefono(value);
			
			// Movil
			value = dameValor(itemContacto.getPhoneMobile(), false);
			itemMatricula.setpMovil(value);
			
			// DNI
			value = dameValor(itemContactoCstm.getDocIDentidad(), false);
			itemMatricula.setpDNI(value);
			
			// Email
			value = null;
			for (int i = 0; i < emails.size(); i++) {
				if (StringUtils.isNoneBlank(emails.get(i))) {
					if (StringUtils.isNotBlank(value)) value += " , ";
					value += emails.get(i);
				}
			}
			value = dameValor(value, false);
			itemMatricula.setpEmail(value);
			
			// Nacionalidad
			value = dameValor(itemContacto.getAltAddressCountry(), true);
			itemMatricula.setpNacionalidad(value);
			
			// LugarDeNacimieno
			value = dameValor(itemContactoCstm.getProvinciaNacim(), false);
			itemMatricula.setpLugarDeNacimiento(value);
			
			// Fecha nacimiento
			value = dameValor(dameFecha(itemContactoCstm.getFechaNacimiento(), ""), false);
			itemMatricula.setpFecha(value);
			
			// Edad
			value = dameValor(dameEdad(itemContactoCstm.getFechaNacimiento()), false);
			itemMatricula.setpEdad(value);
			
			// Domicilio
			value = dameValor(itemContacto.getPrimaryAddressStreet(), true);
			itemMatricula.setpDomicilio(value);
			
			// Localidad
			value = dameValor(itemContacto.getPrimaryAddressCity(), true);
			itemMatricula.setpLocalidad(value);
			
			// Provincia
			value = dameValor(itemContacto.getPrimaryAddressState(), false);
			itemMatricula.setpProvincia(value);
			
			// CP
			value = dameValor(itemContacto.getPrimaryAddressPostalcode(), false);
			itemMatricula.setpCP(value);
			
			// Profesion
			value = dameValor(itemContactoCstm.getProfesion(), true);
			itemMatricula.setpProfesion(value);
			
			// Estudios
			value = dameValor(itemContactoCstm.getNivelEstudios(), true);
			itemMatricula.setpEstudios(value);
			
			// Curso
			value = "";
			if (itemCurso!=null) {
				value = StringUtils.trim(itemCurso.getName()) + " - " + StringUtils.trim(itemCurso.getDescription());
			}
			value = dameValor(value, true);
			itemMatricula.setpCurso(value);
			
			// Medio
			value = dameValor(itemContactoCstm.getOrigen(), true);
			itemMatricula.setpMedio(value);
			
			// Observaciones
			value = dameValor("", true);
			itemMatricula.setpObservaciones(value);
			
			/*
			 * CONDICIONES DE PAGO
			 */
			
			// ImporteTotal (Precion Ofertado - Precio Venta)
			if (itemContactoCstm.getPrecioOfertado() != null) {
				value = dameImporte(itemContactoCstm.getPrecioOfertado());
			} else {
				value = dameImporte(itemContactoCstm.getPrecioVenta());
			}
			itemMatricula.setCpImporteTotal(value);
			
			// ImporteInicial (Precio Matricula)		 
			value = dameImporte(itemContactoCstm.getImporteMatricula());
			itemMatricula.setCpImporteInicial(value);
			
			// TipoPago
			value = dameValor(itemContactoCstm.getFormaPago(), true);
			itemMatricula.setCpTipoPago(value);
			
			// TipoPagoPlazos
			value = dameValor(itemContactoCstm.getFormaPagoRecibos(), true);
			itemMatricula.setCpTipoPagoPlazos(value);
									
			// Nº de plazos
			value = null;
			if (itemContactoCstm.getMensualidades()!=null && itemContactoCstm.getMensualidades()>0 ) {
				value = Integer.toString(itemContactoCstm.getMensualidades());
			}
			value = dameValor(value, false);
			itemMatricula.setCpNumeroPlazos(value);
			
			// ImporteRecibos
			value = dameImporte(itemContactoCstm.getImporteRecibos());
			itemMatricula.setCpImportePlazo(value);
						
			// DiaMensualidad
			value = null;
			if (itemContactoCstm.getDiaMensualidad()!=null && itemContactoCstm.getDiaMensualidad() > 0) {
				value = Integer.toString(itemContactoCstm.getDiaMensualidad());
				value = StringUtils.leftPad(value, 2, "0");
			}
			value = dameValor(value, false);
			itemMatricula.setCpDiaMes(value);
			
			// NumeroTarjetaCredito
			value = dameValor("", false);
			itemMatricula.setCpNumeroTarjetaCredito(value);
			
			// AnnoCaducidadTarjeta
			value = dameValor("", false);
			itemMatricula.setCpAnnoCaducidadTarjeta(value);
			
			// MesCaducidadTarjeta
			value = dameValor("", false);
			itemMatricula.setCpMesCaducidadTarjeta(value);
			
			/*
			 * DOMICILIO ENTREGA CURSOR (SOLO SI ES DIFERENTE AL DE DATOS PERSONALES)
			 */
			
			// Domicilio
			value = dameValor(itemContacto.getAltAddressStreet(), true);
			itemMatricula.setDeDomicilio(value);
			
			// Localidad
			value = dameValor(itemContacto.getAltAddressState(), true);
			itemMatricula.setDeLocalidad(value);
			
			// Provincia
			value = dameValor(itemContacto.getAltAddressState(), true);
			itemMatricula.setDeProvincia(value);
			
			// CP
			value = dameValor(itemContacto.getAltAddressPostalcode(), false);
			itemMatricula.setDeCP(value);
			
			// Telefono
			value = dameValor("", false);
			itemMatricula.setDeTelefono(value);
			
			/*
			 * FACTURA
			 */
			itemMatricula.setFa(itemContactoCstm.getFactura()!=null && itemContactoCstm.getFactura()==1 );
			
			// Nombre
			value = "";
			if (itemMatricula.getFa()) {
				value = itemContactoCstm.getRazonSocial();
			}
			value = dameValor(value, true);
			itemMatricula.setFaNombre(value);
			
			// NIF
			value = "";
			if (itemMatricula.getFa()) {
				value = itemContactoCstm.getCif();
			}
			value = dameValor(value, false);
			itemMatricula.setFaNIF(value);
			
			// Domicilio
			value = "";
			if (itemMatricula.getFa()) {
				value = "";
			}
			value = dameValor(value, true);
			itemMatricula.setFaDomicilio(value);
			
			// Localidad
			value = "";
			if (itemMatricula.getFa()) {
				value = "";
			}
			value = dameValor(value, true);
			itemMatricula.setFaLocalidad(value);
			
			// Provincia
			value = "";
			if (itemMatricula.getFa()) {
				value = "";
			}
			value = dameValor(value, true);
			itemMatricula.setFaProvincia(value);
			
			// Telefono
			value = "";
			if (itemMatricula.getFa()) {
				value = "";
			}
			value = dameValor(value, true);
			itemMatricula.setFaTelefono(value);
			
			// CP
			value = "";
			if (itemMatricula.getFa()) {
				value = "";
			}
			value = dameValor(value, true);
			itemMatricula.setFaCP(value);	
			
			
		} catch (Exception e) {
			logger.log(Level.WARNING, e.toString(), e);
			
		} finally {
			 if (session!=null) session.close();
		}
		
		return itemMatricula;
		
	}
	
	/**
	 * Devuelve un objeto con datos ficticios, sin leer en BDD
	 * 
	 * @return Item de matricula con datos ficticios
	 */
	public Matricula getMatriculaTest() {
		Matricula itemMatricula = new Matricula();
		itemMatricula = new Matricula();
		itemMatricula.setpCodigoDeAlumno("1234");
		itemMatricula.setpFechaDeMatricula("31/12/2018");
		itemMatricula.setpComercial("Silvia");
		itemMatricula.setpApellidos("Mateo Garceo");
		itemMatricula.setpNombre("Camilo");
		itemMatricula.setpTelefono("943590558");
		itemMatricula.setpMovil("669397505");
		itemMatricula.setpDNI("15980141V");
		itemMatricula.setpEmail("camilomateo@gmail.com");
		itemMatricula.setpNacionalidad("España");
		itemMatricula.setpLugarDeNacimiento("Donostia");
		itemMatricula.setpFecha("19/06/1965");
		itemMatricula.setpEdad("55");
		itemMatricula.setpDomicilio("Plaza Elizondo, 6 - 2 A");
		itemMatricula.setpLocalidad("Andoain");
		itemMatricula.setpProvincia("Guipuzcoa");
		itemMatricula.setpCP("20140");
		itemMatricula.setpProfesion("Analista programador");
		itemMatricula.setpEstudios("Ingenieria");
		itemMatricula.setpCurso("AAA - PROGRAMACION C++");
		itemMatricula.setpMedio("Web");
		itemMatricula.setpObservaciones("Observación de matricula");
		
		itemMatricula.setCpTipoPagoPlazos("Mensual");
		itemMatricula.setCpAnnoCaducidadTarjeta("18");
		itemMatricula.setCpMesCaducidadTarjeta("11");
		itemMatricula.setCpNumeroTarjetaCredito("12345678901234556689");
		itemMatricula.setCpDiaMes("28");
		itemMatricula.setCpImportePlazo("1000");
		itemMatricula.setCpNumeroPlazos("2");
		itemMatricula.setCpTipoPago("Euros");
		itemMatricula.setCpImporteInicial("300");
		itemMatricula.setCpImporteTotal("2300");
		
		itemMatricula.setDeDomicilio("Plaza Navarra, 5");
		itemMatricula.setDeLocalidad("Hernani");
		itemMatricula.setDeProvincia("Guipuzcoa");
		itemMatricula.setDeCP("20130");
		itemMatricula.setDeTelefono("94312344556");

		itemMatricula.setFaNombre("Mario Mateo");
		itemMatricula.setFaNIF("123121321B");
		itemMatricula.setFaDomicilio("Kalean berria, 12-2º A");
		itemMatricula.setFaLocalidad("Lekeitio");
		itemMatricula.setFaProvincia("Bizkaia");
		itemMatricula.setFaTelefono("8430304343");
		itemMatricula.setFaCP("20110");		
		
		return itemMatricula;
	}
	
	
	/**
	 * Dado un valor el valor con el primer carácter en mayúscula,
	 * y vacio si es null.
	 * 
	 * @param value Valor a tratar
	 * @param upperCase (true/false) Mayusculas
	 * @return Valor tratado
	 */
	private static String dameValor(String value, boolean upperCase) {
		String resu = value;
		if (StringUtils.isNotBlank(value)) {
			if (upperCase) {
				resu = StringUtils.upperCase(value);
			}
			
		} else {
			resu = "";
		}
		return resu;
	}
	
	/**
	 * Dado una fecha formato Date, devuelve en el formato que se
	 * indique. Por defecto, el formato es dd-MM-yyyy
	 * 
	 * @param date Fecha formato Date
	 * @param formato Formato de la fecha (Defecto=dd-MM-yyyy)
	 * @return Fecha formateada
	 */
	private static String dameFecha(Date date, String formato) {
		String resu = "";
		if (StringUtils.isBlank(formato))
			formato = "dd-MM-yyyy";
		if (date != null) {
			resu = new SimpleDateFormat(formato).format(date);
		}
		return resu;
	}
	
	/**
	 * Dado un importe, devuelve su valor siempre que sea mayor de cero
	 * 
	 * @param importe Importe 
	 * @return importe (String)
	 */
	private static String dameImporte(BigDecimal importe) {
		String resu = "";
		if (importe!=null && importe.compareTo(BigDecimal.ZERO) > 0) {
			resu = String.valueOf(importe.doubleValue());
		} 
		return resu;
	}
	
	/**
	 * Dada una fecha, devuelve los años a la fecha actual
	 * 
	 * @param fechaNacimiento Fecha nacimiento
	 * @return Años entre la fecha nacimiento y la actual 
	 */
	private static String dameEdad(Date fechaNacimiento) {
		if (fechaNacimiento != null) {
			LocalDate birthdate = new LocalDate(fechaNacimiento);
			LocalDate now = new LocalDate();
			Years age = Years.yearsBetween(birthdate, now);
			return Integer.toString(age.getYears());
		}
		return "";
	}
}
