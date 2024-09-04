package pe.gob.pj.rnc.dao;

import java.sql.Connection;

import pe.gob.pj.rnc.model.AudAntecPenWs;

public interface AudAntecPenWsDAO {
	public abstract void insert(Connection coneccion, AudAntecPenWs antecPenWs);
}
