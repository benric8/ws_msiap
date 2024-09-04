/*
 * EntidadExternaDataProvider.java
 *
 * Created on July 4, 2007, 12:46 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package uif;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.Departamento;

import pe.gob.pj.rnc.service.DepartamentoManager;
import com.sun.data.provider.impl.ObjectListDataProvider;

/**
 *
 * @author Administrador
 */
public class DepartamentoFilterDataProvider extends ObjectListDataProvider {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	static MyLogger logger= new MyLogger(DepartamentoFilterDataProvider.class.getName());

	private ArrayList<Departamento> lista = new ArrayList<Departamento>();

	public DepartamentoFilterDataProvider() {
		lista.add(new Departamento());
		setList(lista);
	}

	public void refreshProvider(String codDistritoJudicial)
			throws SQLException, NamingException {

		Departamento departamentoTodos = new Departamento();
		ArrayList<Departamento> listado = null;
		departamentoTodos.setCODG_LUGAR("0");
		departamentoTodos.setDESC_LUGAR("--- SELECCIONE DEPARTAMENTO ---");

		lista.clear();
		lista.add(departamentoTodos);

		if (codDistritoJudicial != null) {
			if (!codDistritoJudicial.equals("%")&&!codDistritoJudicial.equals("00")) {
				DepartamentoManager servicioDepartamento = new DepartamentoManager();
				listado = (ArrayList<Departamento>) servicioDepartamento.lugaresPorDistritoJudicial(codDistritoJudicial);
			}
		}
		if (!(listado == null || listado.isEmpty())) {
			this.lista.addAll(listado);
		}
	}
}
