package pe.gob.pj.rnc.dao;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.Aud_usuario_tablas_cab;

public class aud_usuario_tablas_cabDAOImpl implements Aud_usuario_tablas_cabDAO {
	
	@Override
	public void insert(Connection coneccion, Aud_usuario_tablas_cab aud_ut_cab) {
		MyLogger logger = new MyLogger(this.getClass().getName());
		try {
			// cod_registro, fecha_aud, c_usuario, c_tabla, c_accion,
			// cod_modificado, motivo,
			// c_usuario_red, c_ipaddr, c_pcname, c_mcaddr
			CallableStatement st = coneccion.prepareCall("{call usp_insert_aud_ut_cab(?,?,?,?,?,?,?,?,?)}");
			st.setString(1, aud_ut_cab.getC_usuario() == null ? "" : aud_ut_cab.getC_usuario());
			st.setString(2, aud_ut_cab.getC_tabla() == null ? "" : aud_ut_cab.getC_tabla());
			st.setString(3, aud_ut_cab.getC_accion() == null ? "" : aud_ut_cab.getC_accion());
			st.setString(4, aud_ut_cab.getCod_modificado() == null ? "" : aud_ut_cab.getCod_modificado());
			st.setString(5, aud_ut_cab.getMotivo() == null ? "" : aud_ut_cab.getMotivo());
			st.setString(6, aud_ut_cab.getC_usuario_red() == null ? "" : aud_ut_cab.getC_usuario_red());
			st.setString(7, aud_ut_cab.getC_ipaddr() == null ? "" : aud_ut_cab.getC_ipaddr());
			st.setString(8, aud_ut_cab.getC_pcname() == null ? "" : aud_ut_cab.getC_pcname());
			st.setString(9, aud_ut_cab.getC_mcaddr() == null ? "" : aud_ut_cab.getC_mcaddr());
			/*
			 * CREATE procedure dbo.usp_insert_aud_ut_cab(
			 * @c_usuario VARCHAR (10),
			 * @c_tabla VARCHAR (50),
			 * @c_accion CHAR (1),
			 * @cod_modificado VARCHAR (20),
			 * @motivo VARCHAR (100),
			 * @c_usuario_red VARCHAR (20),
			 * @c_ipaddr VARCHAR (15),
			 * @c_pcname VARCHAR (30),
			 * @c_mcaddr VARCHAR (20) )
			 */
			st.execute();
			st.close();
		} catch (SQLException e) {
			logger.info("SQLException:" + e.getMessage());
			logger.error("SQLException:" + e.getMessage(), e);
		}
	}
}