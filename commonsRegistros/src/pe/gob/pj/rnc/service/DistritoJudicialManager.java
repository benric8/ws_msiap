// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   DistritoJudicialManager.java

package pe.gob.pj.rnc.service;

import java.util.List;

import pe.gob.pj.rnc.dao.DAOConfiguration;
import pe.gob.pj.rnc.dao.DistritoJudicialDAO;
import pe.gob.pj.rnc.model.DistritoJudicial;
import pe.gob.pj.rnc.model.DistritoJudicialExample;

import com.ibatis.dao.client.DaoManager;

public class DistritoJudicialManager {

	private DaoManager daoManager;
	private DistritoJudicialDAO distritoJudicialDAO;

	public DistritoJudicialManager() {
		daoManager = DAOConfiguration.getDaoManager();
		distritoJudicialDAO = (DistritoJudicialDAO) daoManager.getDao(DistritoJudicialDAO.class);
	}

	public DistritoJudicial selectDistritoJudicial(String codigoDistritoJudicial){
		return distritoJudicialDAO.selectByPrimaryKey(codigoDistritoJudicial);
	}

	public List<DistritoJudicial> getDistritosJudiciales(){
		DistritoJudicialExample muestra = new DistritoJudicialExample();
		muestra.createCriteria().andC_CONVENIOSIsNull().andINDC_ACTIVOEqualTo("S");
		muestra.setOrderByClause("DESC_DISTRITO_JUDICIAL");

		return distritoJudicialDAO.selectByExample(muestra);
	}

	public List<DistritoJudicial> getDistritosJudicialesConvenio(){
		DistritoJudicialExample muestra = new DistritoJudicialExample();
		muestra.createCriteria().andC_CONVENIOSEqualTo("C").andINDC_ACTIVOEqualTo("S");
		muestra.setOrderByClause("DESC_DISTRITO_JUDICIAL");

		return distritoJudicialDAO.selectByExample(muestra);
	}
}
