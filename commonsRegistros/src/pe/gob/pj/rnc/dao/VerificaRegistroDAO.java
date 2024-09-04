// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VerificaRegistroDAO.java

package pe.gob.pj.rnc.dao;

import java.sql.Connection;
import java.sql.SQLException;

import pe.gob.pj.rnc.criterio.CriterioVerificarNombresApellidos;
import pe.gob.pj.rnc.model.Usuario;

public interface VerificaRegistroDAO {

	public abstract boolean[] verificaNombresApellidos(Connection connection, CriterioVerificarNombresApellidos criterio, Usuario usuario) throws SQLException;
	
	
	
	
}
