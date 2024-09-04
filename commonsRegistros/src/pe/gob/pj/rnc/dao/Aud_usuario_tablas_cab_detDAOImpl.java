package pe.gob.pj.rnc.dao;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.Aud_usuario_tablas_cab_det;

public class Aud_usuario_tablas_cab_detDAOImpl implements Aud_usuario_tablas_cab_detDAO {
	@Override
	public void insert(Connection coneccion, Aud_usuario_tablas_cab_det aud_ut_cab) {
		MyLogger logger = new MyLogger(this.getClass().getName());
		CallableStatement st = null;
		try {
			st = coneccion.prepareCall("{call usp_ins_aud_usuario_tablas(?,?,?,?,?,?,?,?,?)}");
			st.setString(1, aud_ut_cab.getC_usuario() == null ? "" : aud_ut_cab.getC_usuario());
			st.setString(2, aud_ut_cab.getC_tabla() == null ? "" : aud_ut_cab.getC_tabla());
			st.setString(3, aud_ut_cab.getC_accion() == null ? "" : aud_ut_cab.getC_accion());
			st.setString(4, aud_ut_cab.getCod_modificado() == null ? "" : aud_ut_cab.getCod_modificado());
			st.setString(5, aud_ut_cab.getMotivo() == null ? "" : aud_ut_cab.getMotivo());
			st.setString(6, aud_ut_cab.getC_usuario_red() == null ? "" : aud_ut_cab.getC_usuario_red());
			st.setString(7, aud_ut_cab.getC_ipaddr() == null ? "" : aud_ut_cab.getC_ipaddr());
			st.setString(8, aud_ut_cab.getC_pcname() == null ? "" : aud_ut_cab.getC_pcname());
			st.setString(9, aud_ut_cab.getC_mcaddr() == null ? "" : aud_ut_cab.getC_mcaddr());
			ResultSet result;
			result = st.executeQuery();
			int codigo = 0;
			//			System.out.println("codigo...");
			if (result.next()) {
				try {
					// 1 : @ln_max_reg
					codigo = Integer.parseInt(result.getString(1));
					System.out.println(codigo);
				} catch (Exception e) {
					logger.error(e.getMessage());
					e.printStackTrace();
				}
			}
			result = null;
			int c = 0;
			if (codigo > 0) {
				if (st != null) {
					st.close();
				}
				st = null;
				st = coneccion
						.prepareCall("INSERT INTO dbo.aud_usuario_tablas_det(cod_registro, correlativo, campo_modificado, " +
								"valor_anterior)	VALUES (?,?,?,?)");

				String valor = aud_ut_cab.getCamposAudit().getCODG_USUAR() == null ? "" : aud_ut_cab.getCamposAudit()
						.getCODG_USUAR();
				if (valor.trim().length() > 0) {
					st.setInt(1, codigo);
					st.setInt(2, ++c);
					st.setString(3, "CODG_USUAR");
					st.setString(4, valor);
					st.addBatch();
				}

				valor = aud_ut_cab.getCamposAudit().getC_CLAVE() == null ? "" : aud_ut_cab.getCamposAudit().getC_CLAVE();
				if (valor.trim().length() > 0) {
					st.setInt(1, codigo);
					st.setInt(2, ++c);
					st.setString(3, "C_CLAVE");
					st.setString(4, valor);
					st.addBatch();
					//					System.out.println(2);
				}

				valor = aud_ut_cab.getCamposAudit().getNOMB_USUAR() == null ? "" : aud_ut_cab.getCamposAudit().getNOMB_USUAR();
				if (valor.trim().length() > 0) {
					st.setInt(1, codigo);
					st.setInt(2, ++c);
					st.setString(3, "NOMB_USUAR");
					st.setString(4, valor);
					st.addBatch();
					//				System.out.println(3);
				}

				valor = aud_ut_cab.getCamposAudit().getAPLL_USUAR() == null ? "" : aud_ut_cab.getCamposAudit().getAPLL_USUAR();
				if (valor.trim().length() > 0) {
					st.setInt(1, codigo);
					st.setInt(2, ++c);
					st.setString(3, "APLL_USUAR");
					st.setString(4, valor);
					st.addBatch();
					//				System.out.println(4);
				}

				valor = aud_ut_cab.getCamposAudit().getDESC_TITULO() == null ? "" : aud_ut_cab.getCamposAudit()
						.getDESC_TITULO();
				if (valor.trim().length() > 0) {
					st.setInt(1, codigo);
					st.setInt(2, ++c);
					st.setString(3, "DESC_TITULO");
					st.setString(4, valor);
					st.addBatch();
					//				System.out.println(5);
				}

				valor = aud_ut_cab.getCamposAudit().getDESC_COREEO() == null ? "" : aud_ut_cab.getCamposAudit()
						.getDESC_COREEO();
				if (valor.trim().length() > 0) {
					st.setInt(1, codigo);
					st.setInt(2, ++c);
					st.setString(3, "DESC_COREEO");
					st.setString(4, valor);
					st.addBatch();
					//				System.out.println(6);
				}

				valor = aud_ut_cab.getCamposAudit().getCODG_TIPO() == null ? "" : aud_ut_cab.getCamposAudit().getCODG_TIPO();
				if (valor.trim().length() > 0) {
					st.setInt(1, codigo);
					st.setInt(2, ++c);
					st.setString(3, "CODG_TIPO");
					st.setString(4, valor);
					st.addBatch();
				}

				valor = aud_ut_cab.getCamposAudit().getC_PERFIL() == null ? "" : aud_ut_cab.getCamposAudit().getC_PERFIL();
				if (valor.trim().length() > 0) {
					st.setInt(1, codigo);
					st.setInt(2, ++c);
					st.setString(3, "C_PERFIL");
					st.setString(4, valor);
					st.addBatch();
				}

				valor = aud_ut_cab.getCamposAudit().getCODG_DISTRITO_JUDICIAL() == null ? "" : aud_ut_cab.getCamposAudit()
						.getCODG_DISTRITO_JUDICIAL();
				if (valor.trim().length() > 0) {
					st.setInt(1, codigo);
					st.setInt(2, ++c);
					st.setString(3, "CODG_DISTRITO_JUDICIAL");
					st.setString(4, valor);
					st.addBatch();
				}

				valor = aud_ut_cab.getCamposAudit().getCODG_ENTIDAD_EXTERNA() == 0 ? "0" : aud_ut_cab.getCamposAudit()
						.getCODG_ENTIDAD_EXTERNA()
						+ "";
				if (Integer.parseInt(valor.trim()) > 0) {
					st.setInt(1, codigo);
					st.setInt(2, ++c);
					st.setString(3, "ENTIDAD_EXTERNA");
					st.setString(4, valor);
					st.addBatch();
				}

				valor = aud_ut_cab.getCamposAudit().getCODG_LUGAR() == null ? "" : aud_ut_cab.getCamposAudit().getCODG_LUGAR();
				if (valor.trim().length() > 0) {
					st.setInt(1, codigo);
					st.setInt(2, ++c);
					st.setString(3, "CODG_LUGAR");
					st.setString(4, valor);
					st.addBatch();
				}

				valor = aud_ut_cab.getCamposAudit().getNUME_JUZGA() == null ? "" : aud_ut_cab.getCamposAudit().getNUME_JUZGA();
				if (valor.trim().length() > 0) {
					st.setInt(1, codigo);
					st.setInt(2, ++c);
					st.setString(3, "NUME_JUZGA");
					st.setString(4, valor);
					st.addBatch();
				}

				valor = aud_ut_cab.getCamposAudit().getCODG_JUZGAD() == null ? "" : aud_ut_cab.getCamposAudit()
						.getCODG_JUZGAD();
				if (valor.trim().length() > 0) {
					st.setInt(1, codigo);
					st.setInt(2, ++c);
					st.setString(3, "CODG_JUZGAD");
					st.setString(4, valor);
					st.addBatch();
				}

				valor = aud_ut_cab.getCamposAudit().getESTD_USUAR() == null ? "" : aud_ut_cab.getCamposAudit().getESTD_USUAR();
				if (valor.trim().length() > 0) {
					st.setInt(1, codigo);
					st.setInt(2, ++c);
					st.setString(3, "ESTD_USUAR");
					st.setString(4, valor);
					st.addBatch();
				}

				valor = aud_ut_cab.getCamposAudit().getCOD_APLICACION() == null ? "" : aud_ut_cab.getCamposAudit()
						.getCOD_APLICACION();
				if (valor.trim().length() > 0) {
					st.setInt(1, codigo);
					st.setInt(2, ++c);
					st.setString(3, "COD_APLICACION");
					st.setString(4, valor);
					st.addBatch();
				}

				valor = aud_ut_cab.getCamposAudit().getDESC_OBSERVACIONES() == null ? "" : aud_ut_cab.getCamposAudit()
						.getDESC_OBSERVACIONES();
				if (valor.trim().length() > 0) {
					st.setInt(1, codigo);
					st.setInt(2, ++c);
					st.setString(3, "DESC_OBSERVACIONES");
					st.setString(4, valor);
					st.addBatch();
				}
				valor = aud_ut_cab.getCamposAudit().getDESC_MOTIVO() == null ? "" : aud_ut_cab.getCamposAudit()
						.getDESC_MOTIVO();
				if (valor.trim().length() > 0) {
					st.setInt(1, codigo);
					st.setInt(2, ++c);
					st.setString(3, "MOTIVO");
					st.setString(4, valor);
					st.addBatch();
				}
			}
			
			// st.execute();
			int[] x = st.executeBatch();
			System.out.println(12);
			System.out.println(x.length);
			result = null;
			System.out.println(".....usp_insert_aud_ut_cab_det");
		} catch (SQLException e) {
			logger.info("SQLException:" + e.getMessage());
			logger.error("SQLException:" + e.getMessage(), e);
			System.out.println(e.getMessage());
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}