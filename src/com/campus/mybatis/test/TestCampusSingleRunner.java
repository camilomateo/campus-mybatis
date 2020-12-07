package com.campus.mybatis.test;

import org.apache.commons.lang3.*;
import org.junit.runner.*;
import org.junit.runner.notification.*;

/**
 * Usted puede hacer un corredor personalizado, barebones JUnit bastante fácilmente. 
 * Aquí hay uno que ejecutará un solo método de prueba en la forma 
 * 
 * com.package.TestClass # methodName:
 * 
 * @author Cami
 *
 */
public class TestCampusSingleRunner {
	
	public static void main(String args[])  throws ClassNotFoundException {
		
		String clase = "com.campus.mybatis.test.TestCampus";
		String metodo = "";
		
		if (args==null || args.length==0) {
		
		} else if (args.length==1) {
			metodo = args[0];
			
		} else {
			String[] classAndMethod = args[0].split("#");	        
	        if (StringUtils.isNotBlank(classAndMethod[0])) {
	        	clase = classAndMethod[0];
	        	metodo = classAndMethod[1];
	        }
		}
		
		if (StringUtils.equals(metodo, "help")) {
			metodo = "testMetodos";
		}
		
		Request request = null;
		Result result = null;
		if (StringUtils.isNotBlank(metodo)) {
			request = Request.method(Class.forName(clase), metodo);
			result = new JUnitCore().run(request);
		} else {
			result = JUnitCore.runClasses(TestCampus.class);
		}
        
        for(Failure failure:result.getFailures()){
            System.out.println(failure.toString());
            System.out.println("Message: "+failure.getMessage());
            System.out.println("Test Header: "+failure.getTestHeader());
            System.out.println("Exception is: "+failure.getException());
            System.out.println("---------------------------------");
       }
		
		System.out.println("\nResult: "+result.wasSuccessful());
        System.out.println("Run Count: "+result.getRunCount());
        System.out.println("Failure Count: "+result.getFailureCount());
        System.out.println("Run Time: "+result.getRunTime()+" miliseconds");	
	    }
}
