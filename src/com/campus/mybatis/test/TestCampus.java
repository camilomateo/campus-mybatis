package com.campus.mybatis.test;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.Reader;
import java.util.*;
import java.util.logging.*;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import com.campus.mybatis.beans.*;
import com.campus.mybatis.mapper.ContactoMapper;
import com.campus.mybatis.mapper.CursoMapper;
import com.campus.mybatis.mapper.TipoCursoMapper;
import com.campus.mybatis.mapper.UsuarioMapper;
import com.campus.mybatis.services.*;

public class TestCampus  {

	private final static Logger logger = Logger.getLogger("TestCampus");
	private static SqlSessionFactory sqlSessionFactory = null;
	private static String resource = "com/campus/mybatis/config/mybatis-config.xml";
	
	@BeforeClass
	public static void testInit() {
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			
		} catch (IOException e) {
			logger.log(Level.SEVERE, e.toString(), e);
		}	
	}
	
	@Test
	public void testMetodos() {
		List<String> metodos = new ArrayList<String>();
		metodos.add("testMatricula");
		metodos.add("testMatriculaTest");
		metodos.add("testLeerDatosDeUnContacto");
		metodos.add("testContacto");
		metodos.add("testCurso");
		metodos.add("testTipoCurso");
		metodos.add("testUsuario");
		for (int i = 0; i < metodos.size(); i++) {
			System.out.println(metodos.get(i));
		}
		assertTrue(true);
	}
	
	@Test
	public void testMatricula() {
		MatriculaService srv = null;
		try {
			srv = new MatriculaService();
			
			String idContacto 	= "9eee6ed6-0694-123d-05b6-5bab62e58eda"; // AARON FLOTATS CESAR movil 625536642
			String idCurso 		= "";
			Matricula itemMatricula = srv.getMatriculaByContacto(idContacto, idCurso);
			System.out.println(itemMatricula.toStringDetail());
			assertTrue(itemMatricula!=null);
			
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.toString(), e);
		}
	}
	
	@Test
	public void testMatriculaTest() {
		MatriculaService srv = null;
		try {
			srv = new MatriculaService();
			Matricula itemMatricula = srv.getMatriculaTest();
			System.out.println(itemMatricula.toStringDetail());
			assertTrue(itemMatricula!=null);
			
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.toString(), e);
		}
	}
	
	@Test
	public void testLeerDatosDeUnContacto() {
		SqlSession session = sqlSessionFactory.openSession();
		String idContacto = "9eee6ed6-0694-123d-05b6-5bab62e58eda"; // AARON FLOTATS CESAR movil 625536642 dni=48101101-M
		
		try {
			ContactoMapper 	mapperContacto 	= session.getMapper(ContactoMapper.class);
			UsuarioMapper 	mapperUsuario 	= session.getMapper(UsuarioMapper.class);
			CursoMapper 	mapperCurso 	= session.getMapper(CursoMapper.class);
			TipoCursoMapper mapperTipoCurso = session.getMapper(TipoCursoMapper.class);
			
			// Leer Contacto
			Contacto itemContacto = mapperContacto.getContactoById(idContacto);
			System.out.println("\n[itemContacto]\n" + itemContacto.toString());
			
			ContactoCstm itemContactoCstm = mapperContacto.getContactoCstmById(idContacto);
			System.out.println("\n[itemContactoCstm]\n" + itemContactoCstm.toString());
			
			// Leer Usuario del contacto
			Usuario itemUsuario = mapperUsuario.getUsuarioById(itemContacto.getIdUsuario());
			System.out.println("\n[itemUsuario]\n" + itemUsuario.toString());
			
			// Leer emails del contacto
			List<String> emails = mapperContacto.getEmailsContactoById(idContacto);
			System.out.println("\n[emails]\n" + emails.toString());
			
			// Leer cursos del contacto
			List<String> cursos = mapperContacto.getIdCursosContactoById(idContacto);
			System.out.println("\n[cursos]\n" + cursos.toString());
			for (int i = 0; i < cursos.size(); i++) {
				Curso itemCurso = mapperCurso.getCursoById(cursos.get(i));
				System.out.println(itemCurso.toString());
				
				// Tipo de curso
				TipoCurso itemTipoCurso = mapperTipoCurso.getTipoCursoById(itemCurso.getId());
				System.out.println(itemTipoCurso.toString());
			}
		
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.toString(), e);
			
		} finally {
			 if (session!=null) session.close();
		}
		
	}
	
	@Test
	public void testContacto() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			ContactoMapper mapperContacto = session.getMapper(ContactoMapper.class);
			
			// getAllContactos
			List<Contacto> itemsContacto = mapperContacto.getAllContactos();
//			if (itemsContacto!=null && itemsContacto.size()>0) {
//				System.out.println("\ngetAllContactos");
//				for (Contacto itemContacto : itemsContacto) {
//					if (itemContacto!=null) {
//						System.out.println(itemContacto.toString());
//					}
//				}
//			}		
//			assertTrue("getAllContactos", (itemsContacto!=null && itemsContacto.size()>0));
						
			// getContactoById
			String idContacto = "9eee6ed6-0694-123d-05b6-5bab62e58eda";
			Contacto itemContacto = mapperContacto.getContactoById(idContacto);
			System.out.println("\ngetContactoById\n"+itemContacto.toString());
			assertTrue("getContactoById", itemContacto!=null);
			
			// getContactoCstmById
			ContactoCstm itemContactoCstm = mapperContacto.getContactoCstmById(idContacto);
			System.out.println("\ngetgetContactoCstmById\n"+itemContactoCstm.toString());
			assertTrue("getContactoCstmById", itemContactoCstm!=null);
			
			// getEmailsContactoById()
			List<String> itemsEmail = mapperContacto.getEmailsContactoById(idContacto);
			if (itemsEmail!=null && itemsEmail.size()>0) {
				System.out.println("\ngetEmailsContactoById");
				for (int i = 0; i < itemsEmail.size(); i++) {
					System.out.println("email ["+itemsEmail.get(i)+"]");
				}
			}
			assertTrue(itemsEmail!=null && itemsEmail.size()>0);
			
			// getIdCursosContactoById
			List<String> idCursos = mapperContacto.getIdCursosContactoById(idContacto);
			if (idCursos!=null && idCursos.size()>0) {
				System.out.println("\ngetIdCursosContactoById");
				for (int i = 0; i < idCursos.size(); i++) {
					System.out.println("idCurso ["+idCursos.get(i)+"]");
				}
			}
			
			// getContactoByLike
			// AARON FLOTATS CESAR movil 625536642 dni=48101101-M
			Map<String, Object> map = new HashMap<String, Object>();
//			map.put("idContacto", "9eee6ed6-0694-123d-05b6-5bab62e58eda");
//			map.put("telefono", "625536642");
			map.put("dni", "48101101-m");
			
//			map.put("first_name", "AARON");
//			map.put("last_name", "FlOTATS CeSAR");
			
			try {
				itemsContacto = mapperContacto.getContactoByLike(map);
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
			if (itemsContacto!=null && itemsContacto.size()>0) {
				System.out.println("\ngetContactoByLike map["+map+"]");
				for (Contacto item : itemsContacto) {
					if (item!=null) {
						System.out.println(item.toString());
					}
				}
			}	
			assertTrue("getContactoByLike", (itemsContacto!=null && itemsContacto.size()>0));
			
			
			
		} finally {
			 if (session!=null) session.close();
		}
	}
	
	@Test
	public void testCurso() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			CursoMapper mapperCurso = session.getMapper(CursoMapper.class);
			
			// getAllCursos
			List<Curso> itemsCurso = mapperCurso.getAllCursos();
			if (itemsCurso!=null && itemsCurso.size()>0) {
				System.out.println("\ngetAllCursos");
				for (Curso itemCurso : itemsCurso) {
					if (itemCurso!=null) {
						System.out.println(itemCurso.toString());
					}
				}
			}		
			assertTrue("getAllCursos", (itemsCurso!=null && itemsCurso.size()>0));
						
			// getCursoById
			String idCurso = "667a45a0-989a-f0c3-1da9-4f5878757016";
			Curso itemCurso = mapperCurso.getCursoById(idCurso);
			System.out.println("\ngetCursoById\n"+itemCurso.toString());
			assertTrue("geCursoById", itemCurso!=null);
						
		} finally {
			 if (session!=null) session.close();
		}
	}
	
	@Test
	public void testTipoCurso() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			TipoCursoMapper mapperTipoCurso = session.getMapper(TipoCursoMapper.class);
			
			// getAllTipoCursos
			List<TipoCurso> itemsTipoCurso = mapperTipoCurso.getAllTipoCursos();
			if (itemsTipoCurso!=null && itemsTipoCurso.size()>0) {
				System.out.println("\ngetAllTipoCursos");
				//logger.log(Level.INFO, "getAllTipoCursos\n");
				for (TipoCurso itemTipoCurso : itemsTipoCurso) {
					if (itemTipoCurso!=null) {
						System.out.println(itemTipoCurso.toString());
					}
				}
			}		
			assertTrue("getAllTipoCursos", (itemsTipoCurso!=null && itemsTipoCurso.size()>0));
						
			// geTipoCursoById
			String idTipoCurso = "667a45a0-989a-f0c3-1da9-4f5878757016";
			TipoCurso itemTipoCurso = mapperTipoCurso.getTipoCursoById(idTipoCurso);
			System.out.println("\ngetTipoCursoById\n"+itemTipoCurso.toString());
			assertTrue("geTipoCursoById", itemTipoCurso!=null);
						
		} finally {
			 if (session!=null) session.close();
		}
	}
	
	@Test
	public void testUsuario() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			UsuarioMapper mapperUsuario = session.getMapper(UsuarioMapper.class);
			
			// getAllUsuarios
			List<Usuario> itemsUsuario = mapperUsuario.getAllUsuarios();
			if (itemsUsuario!=null && itemsUsuario.size()>0) {
				System.out.println("\ngetAllUsuarios");
				for (Usuario itemUsuario : itemsUsuario) {
					if (itemUsuario!=null) {
						System.out.println(itemUsuario.toString());
					}
				}
			}
			assertTrue("getAllUsuarios", (itemsUsuario!=null && itemsUsuario.size()>0));
			
			// getUsuarioById
			String idUsuario = "20bcab69-946f-5aa0-cf7c-533ad12466c6";
			Usuario itemUsuario = mapperUsuario.getUsuarioById(idUsuario);
			System.out.println("\ngetUsuarioById\n" + itemUsuario.toString());
			assertTrue("getUsuarioById", itemUsuario!=null);
			
			
		} finally {
			if (session!=null) session.close();
		}
	}
	

}
