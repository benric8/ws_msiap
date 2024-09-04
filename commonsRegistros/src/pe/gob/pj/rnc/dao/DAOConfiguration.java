// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DAOConfiguration.java

package pe.gob.pj.rnc.dao;

import com.ibatis.common.resources.Resources;
import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.DaoManagerBuilder;
import java.util.Properties;

import pe.gob.pj.rnc.log.MyLogger;

public class DAOConfiguration
{
	static MyLogger logger= new MyLogger(DAOConfiguration.class.getName());
    public DAOConfiguration()
    {
    }

    public static DaoManager getDaoManager()
    {
        return daoManager;
    }

    public static DaoManager newDaoManager(Properties props)
    {
        try
        {
            java.io.Reader reader = Resources.getResourceAsReader("pe/gob/pj/rnc/resources/rncDAO.xml");
            return DaoManagerBuilder.buildDaoManager(reader, props);
        }
        catch(Exception e)
        {
        	logger.error((new StringBuilder()).append("No se puede incializar la configuraci\363n del DAO.  Causa: ").append(e).toString(),e);
            throw new RuntimeException((new StringBuilder()).append("No se puede incializar la configuraci\363n del DAO.  Causa: ").append(e).toString(), e);
        }
    }

    //private static final String resource = "pe/gob/pj/rnc/resources/rncDAO.xml";
    private static final DaoManager daoManager;

    static 
    {
        try
        {
            daoManager = newDaoManager(null);
        }
        catch(Exception e)
        {
        	logger.error((new StringBuilder()).append("Description.  Causa: ").append(e).toString(),e);
            throw new RuntimeException((new StringBuilder()).append("Description.  Causa: ").append(e).toString(), e);
        }
    }
}
