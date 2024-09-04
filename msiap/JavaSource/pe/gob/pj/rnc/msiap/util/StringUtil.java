package pe.gob.pj.rnc.msiap.util;

import java.io.Serializable;
import java.text.Normalizer;
import java.text.Normalizer.Form;

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Copyright (C) 2015 Poder Judicial (Lima - Peru)
 * GERENCIA DE INFORMATICA
 * SUB GERENCIA DE  DESARROLLO DE SISTEMAS DE INFORMACION
 * PROYECTO SINOE - WJAV015 - WJAV016: SINOE

 * All rights reserved. Used by permission
 * This software is the confidential and proprietary information of PJ
 * ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with PJ.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 **/
/**
 * @objetivo: Implementar la clase StringUtil
 * @autor: jhenriquez
 * @fecha: 22/07/2015
 **/
public class StringUtil implements Serializable{
	private static final long serialVersionUID = 1L;

	public static String completarCerosIzquierda(int longitud, int numero) {
		try {
			StringBuffer formato = new StringBuffer();
			formato.append("%0");
			formato.append(longitud);
			formato.append("d");
			return String.format(formato.toString(), numero);
		}catch(Exception ex){
			return null;
		}
	}

	public static String completarCerosIzquierda(int longitud, String numero) {
		try {
			StringBuffer formato = new StringBuffer();
			if( !ValidarUtil.isNullOrEmpty( numero ) ){
				int c = numero.trim().length();
				while( c < longitud){
					formato.append("0");
					c++;
				}
				formato.append(numero);
			}else{
				formato.append("");
			}

			return formato.toString();
		}catch(Exception ex){
			return null;
		}
	}

	public static String toUpper( String obj ){
		String resultado = null;
		if( obj != null && obj.trim().length()>0 ){
			resultado = obj.trim().toUpperCase();
		}
		return resultado;
	}


	public static String trimNotNull(String cadena){
		if(null != cadena){
			return cadena.trim();
		}else{
			return "";
		}
	}

	public static String removeAccents(String text) {
	    return text == null ? null :
	        Normalizer.normalize(text, Form.NFD)
	            .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
	}

    public static String izquierda(String input, int len) {
        return input.substring (0, len);
    }

    public static String derecha(String input, int len) {
        return input.substring (input.length () - len);
    }

	public static String[] separarNombresReniec(String cad){

		String delimitador2="@";
		String nuevaCad = "", temp = null;
		String[] cadenas = null, nombres = null;

		//Dividir el nombre por palabras en un arreglo
		cadenas = cad.trim().split(" +");
		//Analizar cada palabra dentro del arreglo
		for(int i=0; i<cadenas.length;i++){
			temp=cadenas[i];
            //Palabras que forman parte de un apellido compuesto
            //Agregar nuevas palabras separadas por una coma
			if (temp.equals("DE")||temp.equals("DEL")||temp.equals("LA")||
				temp.equals("LAS")||temp.equals("LOS")||temp.equals("SAN")){
				//Insertar espacio en blanco
				nuevaCad=nuevaCad+temp+" ";
			}else{
				//Insertar caracter delimitador
				nuevaCad=nuevaCad+temp+"@";
			}
		}
		//Remover el último caracter delimitador de la cadena
		if(derecha(nuevaCad,1).equals("@")){
			nuevaCad=izquierda(nuevaCad,nuevaCad.length()-1);
		}
		//Dividir la nueva cadena en los nombres correctos
		nombres = nuevaCad.split(delimitador2);

		return  nombres;
	}

}