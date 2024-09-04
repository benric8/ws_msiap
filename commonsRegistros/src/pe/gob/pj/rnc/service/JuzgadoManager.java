// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   JuzgadoManager.java

package pe.gob.pj.rnc.service;

import java.util.List;

import pe.gob.pj.rnc.dao.DAOConfiguration;
import pe.gob.pj.rnc.dao.JuzgadoDAO;
import pe.gob.pj.rnc.model.Juzgado;
import pe.gob.pj.rnc.model.JuzgadoExample;

import com.ibatis.dao.client.DaoManager;
public class JuzgadoManager {

	private DaoManager daoManager;
	private JuzgadoDAO juzgadoDAO;

	public JuzgadoManager() {
		daoManager = DAOConfiguration.getDaoManager();
		juzgadoDAO = (JuzgadoDAO) daoManager.getDao(JuzgadoDAO.class);
	}

	public Juzgado selectJuzgado(String codigoJuzgado){
		return juzgadoDAO.selectByPrimaryKey(codigoJuzgado);
	}

	public List<Juzgado> selectJuzgados(){
		JuzgadoExample muestra = new JuzgadoExample();
		muestra.createCriteria().andESTD_JUZGAEqualTo("A");
		muestra.setOrderByClause("DESC_JUZGAD");
		return juzgadoDAO.selectByExample(muestra);
	}

}
