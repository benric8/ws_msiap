package pe.gob.pj.rnc.dao;

import java.util.List;
import pe.gob.pj.rnc.model.EntidadExterna;
import pe.gob.pj.rnc.model.EntidadExternaExample;

public interface EntidadExternaDAO
{

    public abstract void insert(EntidadExterna entidadexterna);

    public abstract int updateByPrimaryKey(EntidadExterna entidadexterna);

    public abstract int updateByPrimaryKeySelective(EntidadExterna entidadexterna);

    public abstract List selectByExample(EntidadExternaExample entidadexternaexample);

    public abstract EntidadExterna selectByPrimaryKey(Integer integer);

    public abstract int deleteByExample(EntidadExternaExample entidadexternaexample);

    public abstract int deleteByPrimaryKey(Integer integer);
    
    public List<EntidadExterna> consultarEntidades(EntidadExterna key);
}
