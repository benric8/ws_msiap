// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   DepartamentoManager.java

package pe.gob.pj.rnc.service;

import java.util.List;

import pe.gob.pj.rnc.dao.DAOConfiguration;
import pe.gob.pj.rnc.dao.DepartamentoDAO;
import pe.gob.pj.rnc.model.Departamento;
import pe.gob.pj.rnc.model.DepartamentoExample;

import com.ibatis.dao.client.DaoManager;

public class DepartamentoManager {

	private DaoManager daoManager;
	private DepartamentoDAO departamentoDAO;

	public DepartamentoManager() {
		daoManager = DAOConfiguration.getDaoManager();
		departamentoDAO = (DepartamentoDAO) daoManager.getDao(DepartamentoDAO.class);
	}

	public Departamento selectDepartamento(String codigoLugar){
		return departamentoDAO.selectByPrimaryKey(codigoLugar);
	}

	public List<Departamento> getComboDepartamento(){
		DepartamentoExample muestra = new DepartamentoExample();
		muestra.createCriteria().andINDC_VISUAEqualTo("S").andC_CONVENIOSNotEqualTo("C").andCODG_DISTRITO_JUDICIALLessThan("53");
		muestra.setOrderByClause("DESC_LUGAR");
		return departamentoDAO.selectByExample(muestra);
	}

	public List<Departamento> lugaresPorDistritoJudicial(String codDistritoJudicial){
		DepartamentoExample muestra = new DepartamentoExample();
		muestra.createCriteria().andINDC_VISUAEqualTo("S").andCODG_DISTRITO_JUDICIALEqualTo(codDistritoJudicial);
		muestra.setOrderByClause("DESC_LUGAR");
		return departamentoDAO.selectByExample(muestra);
	}
}
