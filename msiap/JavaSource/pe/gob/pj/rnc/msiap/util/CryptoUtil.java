package pe.gob.pj.rnc.msiap.util;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.lang.RandomStringUtils;
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
 * @objetivo: Implementar la clase CryptoUtil
 * @autor: jhenriquez
 * @fecha: 22/07/2015
 **/
public class CryptoUtil implements Serializable{
	private static final long serialVersionUID = -1856464103545143507L;

	public static String encriptar(String dato) throws NoSuchAlgorithmException {

		MessageDigest md;
		byte[] buffer, digest;
		String hash = "";

		buffer = dato.getBytes();
		md = MessageDigest.getInstance("SHA1");
		md.update(buffer);
		digest = md.digest();

		for (byte aux : digest) {
			int b = aux & 0xff;
			if (Integer.toHexString(b).length() == 1)
				hash += "0";
			hash += Integer.toHexString(b);
		}

		return hash;

	}

	public static String generarClaveVisual() {
		String clave = RandomStringUtils.randomAlphanumeric(7);
		return clave;
	}

}
