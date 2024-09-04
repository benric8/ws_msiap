// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DistritoJudicialDAO.java

package pe.gob.pj.rnc.dao;

import java.util.List;
import pe.gob.pj.rnc.model.DistritoJudicial;
import pe.gob.pj.rnc.model.DistritoJudicialExample;

public interface DistritoJudicialDAO
{

    public abstract void insert(DistritoJudicial distritojudicial);

    public abstract int updateByPrimaryKey(DistritoJudicial distritojudicial);

    public abstract int updateByPrimaryKeySelective(DistritoJudicial distritojudicial);

    public abstract List selectByExample(DistritoJudicialExample distritojudicialexample);

    public abstract DistritoJudicial selectByPrimaryKey(String s);

    public abstract int deleteByExample(DistritoJudicialExample distritojudicialexample);

    public abstract int deleteByPrimaryKey(String s);
}
