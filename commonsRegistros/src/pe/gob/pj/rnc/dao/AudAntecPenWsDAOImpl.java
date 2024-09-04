package pe.gob.pj.rnc.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.AudAntecPenWs;

public class AudAntecPenWsDAOImpl implements AudAntecPenWsDAO{
	@Override
	public void insert(Connection coneccion, AudAntecPenWs antecPenWs) {
		MyLogger logger = new MyLogger(this.getClass().getName());
		try {
			CallableStatement st = coneccion.prepareCall("{call usp_insert_aud_antec_pen_ws(?,?,?,?,?,?,?,?,?,?,?,?)}");
//			st.setDate("f_consu_aud", (Date) antecPenWs.getF_consu_aud());
//			st.setString("ps_paterno", antecPenWs.getPs_materno());
			st.setString(1, antecPenWs.getPs_paterno()==null?"":antecPenWs.getPs_paterno());
//			st.setString("ps_materno", antecPenWs.getPs_paterno());
			st.setString(2, antecPenWs.getPs_materno()==null?"":antecPenWs.getPs_materno());
//			st.setString("ps_nom3", antecPenWs.getPs_nom3());
			st.setString(3, antecPenWs.getPs_nom3()==null?"":antecPenWs.getPs_nom3());
//			st.setString("ps_nom2", antecPenWs.getPs_nom2());
			st.setString(4, antecPenWs.getPs_nom2()==null?"":antecPenWs.getPs_nom2());
//			st.setString("ps_nom1", antecPenWs.getPs_nom1());
			st.setString(5, antecPenWs.getPs_nom1()==null?"":antecPenWs.getPs_nom1());
//			st.setString("ps_aud_pc", antecPenWs.getPs_aud_pc());
			st.setString(6, antecPenWs.getPs_aud_pc()==null?"":antecPenWs.getPs_aud_pc());
//			st.setString("ps_aud_ip", antecPenWs.getPs_aud_ip());
			st.setString(7, antecPenWs.getPs_aud_ip()==null?"":antecPenWs.getPs_aud_ip());
//			st.setString("ps_aud_mcaddr", antecPenWs.getPs_aud_mcaddr());
			st.setString(8, antecPenWs.getPs_aud_mcaddr()==null?"":antecPenWs.getPs_aud_mcaddr());
//			st.setInt("COD_APP", antecPenWs.getCOD_APP());
//			st.setInt("pi_aud_cod_entidad", antecPenWs.getPi_aud_cod_entidad());
			st.setInt(9, antecPenWs.getPi_aud_cod_entidad()==null?0:antecPenWs.getPi_aud_cod_entidad());
//			st.setString("x_resp_ws", antecPenWs.getX_resp_ws());
			st.setString(10, antecPenWs.getX_resp_ws()==null?"":antecPenWs.getX_resp_ws());
//			st.setString("ps_aud_dni", antecPenWs.getPs_aud_dni());
			st.setString(11, antecPenWs.getPs_aud_dni()==null?"":antecPenWs.getPs_aud_dni());
//			st.setString("ps_aud_cod_usuario", antecPenWs.getPs_aud_cod_usuario());
			st.setString(12, antecPenWs.getPs_aud_cod_usuario()==null?"":antecPenWs.getPs_aud_cod_usuario());
			/*
CREATE procedure dbo.usp_insert_aud_antec_pen_ws(
--@f_consu_aud DATETIME,
 @ps_paterno VARCHAR (50),
 @ps_materno VARCHAR (50),
 @ps_nom3 VARCHAR (30),
 @ps_nom2 VARCHAR (30),
 @ps_nom1 VARCHAR (30),
 @ps_aud_pc VARCHAR (30),
 @ps_aud_ip VARCHAR (30),
 @ps_aud_mcaddr VARCHAR (30),
-- @COD_APP NUMERIC (18, 0),
 @pi_aud_cod_entidad INT,
 @x_resp_ws VARCHAR (50),
 @ps_aud_dni CHAR (8),
 @ps_aud_cod_usuario VARCHAR (20))
			 */
			st.execute();
			st.close();
		} catch (SQLException e) {
			logger.info("SQLException:" + e.getMessage());
			logger.error("SQLException:" + e.getMessage());
		}
		
	}

}
