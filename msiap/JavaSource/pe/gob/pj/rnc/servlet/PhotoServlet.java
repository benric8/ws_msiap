package pe.gob.pj.rnc.servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.util.IOUtils;

import pe.gob.pj.rnc.model.DatosReniec;

/**
 * Servlet implementation class PhotoServlet
 */
@WebServlet("/PhotoServlet/*")
public class PhotoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PhotoServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dni = request.getPathInfo().substring(1);
		String[] tokens = dni.split("E");
		for(String dniTmp:tokens)
		{
			if(dniTmp!=null && dniTmp.length()==8)
				dni = dniTmp;
		}
		//dni = (dni!=null && dni.length()>8?dni.substring(0,8):dni);
		DatosReniec persona = (DatosReniec) request.getSession().getAttribute("PERSONA_RENIEC_BEAN");
		if (persona!=null && persona.getDni().equals(dni)){
			response.setContentType("image/JPEG");
			if(persona.getFoto()==null || persona.getFoto().length==0)
				cargarImagenPredeterminada(persona, request);
	        response.setContentLength(persona.getLongitudFoto());
	        response.getOutputStream().write(persona.getFoto());
		}
	}

	private void cargarImagenPredeterminada(DatosReniec persona, HttpServletRequest request){
		ServletContext servletContext= request.getServletContext();
	    byte[] media;
		try {
			InputStream in = servletContext.getResourceAsStream("/images/image-not-found.jpg");
			media = IOUtils.toByteArray(in);
			persona.setLongitudFoto(media.length);
		    persona.setFoto(media);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
