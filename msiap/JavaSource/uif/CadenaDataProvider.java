/*
 * CadenaDataProvider.java
 *
 * Created on 19 de abril de 2007, 01:45 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package uif;

import java.util.ArrayList;


import com.sun.data.provider.impl.ObjectListDataProvider;

/**
 *
 * @author Administrador
 */
public class CadenaDataProvider extends ObjectListDataProvider{
      
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Cadena> lista = new ArrayList<Cadena>();

    
    /** Creates a new instance of CadenaDataProvider */
//    @SuppressWarnings("unchecked")
	public CadenaDataProvider() {
        lista.add(new Cadena());
        setList(this.lista);
    }

    
     @SuppressWarnings("unchecked")
	public void refreshProvider(ArrayList listaCampos){
         lista.clear();
         lista.addAll(listaCampos);
     }
   
    
}
