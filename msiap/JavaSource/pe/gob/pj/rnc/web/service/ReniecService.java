package pe.gob.pj.rnc.web.service;

import org.apache.commons.codec.binary.Base64;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;


import pe.gob.pj.client.reniec.consultas.ws.ConsultaReniecPortType;
import pe.gob.pj.client.reniec.consultas.ws.ConsultaReniecService;
import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.Auditoria;
import pe.gob.pj.rnc.model.DatosReniec;
import pe.gob.pj.rnc.model.reniec.AuditoriaReniec;
import pe.gob.pj.rnc.model.reniec.DatosConsultaReniec;
import pe.gob.pj.rnc.model.reniec.PaginacionReniec;
import pe.gob.pj.rnc.model.reniec.RequestConsultaReniecRest;
import pe.gob.pj.rnc.model.reniec.ResponseConsultaReniecRest;
import pe.gob.pj.util.CommonsUtilities;
import pe.gob.pj.util.Constantes;
import uif.login;

/** **************************************************************************** 
* Objeto : DenunciaPenalMB 
* Descripción : Registro de denuncias penales. 
* Fecha :  
* Autor :  
* ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
* ID Fecha Autor Método Tipo Cambio Descripción 
* ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
* @<Id> 	<Fecha Cambio> 		<Autor> 	                <Nombre> 			<Nuevo/Modificado> 		<Descripción del cambio> 
* @01		07/05/2024			Nestor Nuñez Marinovich 	consultarDatos		 Modificado				Considerar nuevo servicio rest de consulta a reniec  
* @02       22/07/2024			Nestor Nuñez Marinovich 	consultarDatos		 Modificado				Cambio por el usuario q se loguea
* **************************************************************************** */

public class ReniecService {

//	private ProxyReniec proxyReniec;
//	private PropertiesReniec properties;


//	public ServiciosRENIEC() {
//		this.properties = new PropertiesReniec();
//		this.properties.setTimeOut(Constantes.CONFIG_WS_RENIEC_TIMEOUT);
//		this.properties.setEndPoint(Constantes.CONFIG_WS_RENIEC_ENDPOINT);
//		this.proxyReniec = new ReniecBuilder().build(properties);
//	}
//
//	public BeanPersona obtenerPersonaPorDNI(String dni ) throws Exception {
//		BeanCosulta consulta =  new BeanCosulta();
//		consulta.setReqTrama("");
//		consulta.setReqDniConsultante(Constantes.CONFIG_WS_RENIEC_DNI_AUTH);
//		consulta.setReqUsuario(Constantes.CONFIG_WS_RENIEC_USUARIO);
//		consulta.setReqIp(Constantes.CONFIG_WS_RENIEC_IP);
//		consulta.setReqTipoConsulta("2");
//		consulta.setReqDni(dni.trim());
//		consulta.setReqNombres("");
//		consulta.setReqApellidoPaterno("");
//		consulta.setReqApellidoMaterno("");
//		consulta.setReqNroRegistros("");
//		consulta.setReqGrupo("");
//		consulta.setReqDniApoderado("");
//		consulta.setReqTipoVinculoApoderado("");
//
//		BeanPersona persona = proxyReniec.consultaReniecPersona(consulta);
//    	return persona;
//    }
	static MyLogger	logger	= new MyLogger(login.class.getName());
	private static final String CODIFICADOR_UTF8=";charset=utf-8";
	
	ConsultaReniecService service = new ConsultaReniecService();

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private ConsultaReniecPortType getPort() {
		ConsultaReniecPortType port = service.getConsultaReniec();
		BindingProvider bp = (BindingProvider) port;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, Constantes.CONFIG_WS_RENIEC_ENDPOINT);
		bp.getRequestContext().put("com.sun.xml.internal.ws.connect.timeout", Integer.valueOf(Constantes.CONFIG_WS_RENIEC_TIMEOUT) * 1000);
		bp.getRequestContext().put("com.sun.xml.internal.ws.request.timeout", Integer.valueOf(Constantes.CONFIG_WS_RENIEC_TIMEOUT) * 1000);
		
		return port;
	}
	
	public DatosReniec consultarDatos(String dni,String codUsuarioLogin) throws Exception {
		
		Holder<String> resTrama = new Holder <String>() ;
		Holder<String> resCodigo = new Holder <String>() ;
		Holder<String> resDescripcion = new Holder <String>();
		Holder<String> resTotalRegistros = new Holder <String>();
		Holder<String> resPersona= new Holder <String>();
		Holder<byte[]> resFoto = new Holder <byte[]>();
		Holder<byte[]> resFirma =  new Holder <byte[]>();
		Holder<String> resListaPersonas = new Holder <String>();	
		
		/*getPort().consultaReniec(null, Constantes.CONFIG_WS_RENIEC_DNI_AUTH, "2", Constantes.CONFIG_WS_RENIEC_USUARIO, Constantes.CONFIG_WS_RENIEC_IP, 
				dni, null, null, null, null, null, null, null, resTrama, resCodigo, resDescripcion, resTotalRegistros, resPersona, resFoto, resFirma, resListaPersonas);*/
		//@01
		Auditoria auditoriaPer=getAuditoriaMacEstatica();
		auditoriaPer.setUsuarioSis(codUsuarioLogin);//@02
		//auditoriaPer.setCuo(cuo);
		RequestConsultaReniecRest requestConsultaReniec = new RequestConsultaReniecRest();
		requestConsultaReniec.setConsultante(Constantes.CONFIG_WS_RENIEC_DNI_AUTH);
		DatosConsultaReniec datosConsultaReniec = new DatosConsultaReniec();
		datosConsultaReniec.setTipoConsulta(Constantes.TIPO_CONSULTA_POR_NUMERO_DNI);
		datosConsultaReniec.setNroDocumentoIdentidad(dni);
		requestConsultaReniec.setPersonaConsultada(datosConsultaReniec);
		ResponseConsultaReniecRest respuestaReniec = consultaReniecRest(auditoriaPer,requestConsultaReniec);
		//fin @01
		
		/*
		// En caso de que la respuesta sea correcta "000"
		if(resCodigo != null && resCodigo.value.equals("0000"))
			return agregarDatosReniec(dni, resPersona.value.split("\t"), resFoto.value);
		else
			return null;
		*/
		
		
		// @01: En caso de que la respuesta sea correcta "000"
		if(respuestaReniec != null &&  respuestaReniec.getCodigo().equals("0000"))
			return agregarDatosReniec(dni, respuestaReniec);
		else
			return null;
	}
	
	//@01
	private DatosReniec agregarDatosReniec(String dni, ResponseConsultaReniecRest respuestaReniec) {
		DatosReniec datos = null;
		if(dni.equals(respuestaReniec.getData().getNroDocumentoIdentidad())) {
			datos = new DatosReniec();
			datos.setDni(respuestaReniec.getData().getNroDocumentoIdentidad());
			datos.setDigitoVerificacion(respuestaReniec.getData().getCodigoVerificacion());
			datos.setApellidoPaterno(respuestaReniec.getData().getApellidoPaterno());
			datos.setApellidoMaterno(respuestaReniec.getData().getApellidoMaterno());
			datos.setApellidoCasada(respuestaReniec.getData().getApellidoCasado());
			datos.setNombres(respuestaReniec.getData().getNombres());
			datos.setSexo(respuestaReniec.getData().getSexo());
			datos.setCodDepartamentoNac(respuestaReniec.getData().getCodigoUbigeoDepartamentoNacimiento());
			datos.setCodProvinciaNac(respuestaReniec.getData().getCodigoUbigeoProvinciaNacimiento());
			datos.setCodDistritoNac(respuestaReniec.getData().getCodigoUbigeoDistritoNacimiento());
			datos.setDepartamentoNac(respuestaReniec.getData().getDepartamentoNacimiento());
			datos.setProvinciaNac(respuestaReniec.getData().getProvinciaNacimiento());
			datos.setDistritoNac(respuestaReniec.getData().getDistritoNacimiento());
			try {
				datos.setFechaNacimiento(sdf.parse(respuestaReniec.getData().getFechaNacimiento()));
			} catch (ParseException e) {
				System.out.println("Error al obtener fecha de nacimiento: " + respuestaReniec.getData().getFechaNacimiento());
				e.printStackTrace();
			}			
			datos.setNombrePadre(respuestaReniec.getData().getNombrePadre());
			datos.setNombreMadre(respuestaReniec.getData().getNombreMadre());
			datos.setLongitudFoto(Integer.valueOf(respuestaReniec.getData().getLongitudFoto()));
			datos.setFechaProceso(new Date());
			//datos.setFoto(respuestaReniec.getData().getFoto().getBytes());
			datos.setFoto(Base64.decodeBase64(respuestaReniec.getData().getFoto().getBytes()));
			
		}
		return datos;
	}
	
	private DatosReniec agregarDatosReniec(String dni, String[] array, byte[] foto) {
		DatosReniec datos = null;
		if(dni.equals(array[0])) {
			datos = new DatosReniec();
			datos.setDni(array[0]);
			datos.setDigitoVerificacion(array[1]);
			datos.setApellidoPaterno(array[2]);
			datos.setApellidoMaterno(array[3]);
			datos.setApellidoCasada(array[4]);
			datos.setNombres(array[5]);
			datos.setSexo(array[17]);
			datos.setCodDepartamentoNac(array[20]);
			datos.setCodProvinciaNac(array[21]);
			datos.setCodDistritoNac(array[22]);
			datos.setDepartamentoNac(array[24]);
			datos.setProvinciaNac(array[25]);
			datos.setDistritoNac(array[26]);
			try {
				datos.setFechaNacimiento(sdf.parse(array[28]));
			} catch (ParseException e) {
				System.out.println("Error al obtener fecha de nacimiento: " + array[28]);
				e.printStackTrace();
			}			
			datos.setNombrePadre(array[31]);
			datos.setNombreMadre(array[34]);
			datos.setLongitudFoto(Integer.valueOf(array[54]));
			datos.setFechaProceso(new Date());
			datos.setFoto(foto);
		}
		return datos;
	}
	
	//01:	
	public ResponseConsultaReniecRest consultaReniecRest(Auditoria auditoria, RequestConsultaReniecRest requestConsultaReniec)
			throws Exception {
		
		ResponseConsultaReniecRest response=new ResponseConsultaReniecRest();	
		
		AuditoriaReniec auditoriaReniec =new AuditoriaReniec();
		auditoriaReniec.setUsuario(auditoria.getUsuarioSis());
		auditoriaReniec.setNumeroIp(auditoria.getIpPc());
		auditoriaReniec.setDireccionMac(auditoria.getMacAddressPc());
		auditoriaReniec.setNombrePc(auditoria.getPcName());
		
		PaginacionReniec paginacionReniec = new PaginacionReniec();
		paginacionReniec.setPage(Constantes.VALUE_PAGINATION_PAGE_RENIEC);
		paginacionReniec.setSize(Constantes.VALUE_PAGINATION_SIZE_RENIEC);
		
		try {			
			logger.info("INICIA LA CONSULTA A RENIEC REST");
			ResponseEntity<String> result=  this.autenticacionWebServiceReniec(); 
		    if (result.getStatusCode().equals(HttpStatus.OK)) {	    	
		    	RestTemplate restTemplate = new RestTemplate();	
				String token= result.getHeaders().get(HttpHeaders.AUTHORIZATION).toString();
			    token=token.substring(1, token.length()-1);	
			    HttpHeaders headers2 = new HttpHeaders();
			    headers2.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			    headers2.set(HttpHeaders.AUTHORIZATION,token );
			    headers2.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE+CODIFICADOR_UTF8);	
			
			    Map<String, Object> requestEnvio=new HashMap<>();
			    
			    
			    requestEnvio.put(Constantes.KEY_AUDITORIA_RENIEC, auditoriaReniec);
			    requestEnvio.put(Constantes.KEY_FORMATO_RESPUESTA_RENIEC, Constantes.VALUE_FORMATO_RESPUESTA_RENIEC);
			    requestEnvio.put(Constantes.KEY_CONSULTANTE_RENIEC, requestConsultaReniec.getConsultante());
			    requestEnvio.put(Constantes.KEY_MOTIVO_RENIEC, Constantes.VALUE_MOTIVO_RENIEC);
			    requestEnvio.put(Constantes.KEY_PAGINATION_RENIEC, paginacionReniec);
			    requestEnvio.put(Constantes.KEY_PERSONA_CONSULTADA_RENIEC, requestConsultaReniec.getPersonaConsultada());
			    
			    
			    ObjectMapper mapper = new ObjectMapper();
			    String json = mapper.writeValueAsString(requestEnvio);		    
			    HttpEntity<String> entity2 = new HttpEntity<>(json, headers2);	
			    
			    logger.info("TRAMA [consultar/persona] : "+json);
			    try {
				    //ResponseEntity<ResponseConsultaReniecRest> result2 = restTemplate.postForEntity(inicioService.getParamConfigReniecRestBean().getEndpoint().concat(ConstantesMpe.URI_METODO_CONSULTAR_WS_RENIEC_REST), entity2, ResponseConsultaReniecRest .class);				    
				  
			    	ResponseEntity<ResponseConsultaReniecRest> result2 = restTemplate.postForEntity(Constantes.CONFIG_WS_REST_ENDPOINT.concat(Constantes.URI_METODO_CONSULTAR_WS_RENIEC_REST), 
			    			entity2, ResponseConsultaReniecRest .class);				    
				   	response=result2.getBody();	
				   	
			    } catch(HttpStatusCodeException e) {
			    	if(e.getMessage()!=null&&e.getMessage().contains(Constantes.STATUS_BAD_REQUEST)) {
				    	throw new Exception ("Ocurrio un error en el WS RENIEC REST- parámetros incorrectos - Status Code: ".concat(Constantes.STATUS_BAD_REQUEST).concat(" - Response Body: ".concat(e.getResponseBodyAsString())));
			    	}else{
			    		throw new Exception ("Ocurrio un error en el WS RENIEC REST - Status Code: ".concat( String.valueOf(result.getStatusCode())).concat(" - Response Body: ".concat(e.getResponseBodyAsString())));
			    	}
			    }		    	
			}else {
				throw new Exception ("Ocurrio un error al autentificar en el WS RENIEC REST - StatusCode: ".concat( String.valueOf(result.getStatusCode())));				
			}
		}catch(Exception e){
			logger.error(e.getMessage());			
    		throw e;			
		}			
		return response;
		
	}

	//01:
	private ResponseEntity<String> autenticacionWebServiceReniec() throws Exception  {		
		ResponseEntity<String> result = null;
	    try {	  
	    	RestTemplate restTemplate = new RestTemplate();	     
		    HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    
			headers.set(Constantes.HEADER_USERNAME_HTTP_MPE_REST, Constantes.CONFIG_WS_REST_USUARIO);
			headers.set(Constantes.HEADER_PASSWORD_HTTP_MPE_REST, Constantes.CONFIG_WS_REST_PASSWORD);
			headers.set(Constantes.HEADER_CODIGO_CLIENTE_HTTP_MPE_REST, Constantes.CONFIG_WS_REST_COD_CLIENTE);
			headers.set(Constantes.HEADER_CODIGO_ROL_HTTP_MPE_REST, Constantes.CONFIG_WS_REST_COD_ROL);			
					    
		    HttpEntity<String> entity = new HttpEntity<>(Constantes.HEADER_PARAMETERS_HTTP_MPE_REST, headers);		    
		    result = restTemplate.exchange(Constantes.CONFIG_WS_REST_ENDPOINT.concat(Constantes.URI_METODO_AUTENTIFICACION_WS_RENIEC_REST), HttpMethod.GET, entity, String.class);	    	
		    
		    return result;
	    } catch(HttpStatusCodeException e) {
			if(e.getMessage()!=null && e.getStatusCode() == HttpStatus.UNAUTHORIZED) {
				throw  new Exception ("Ocurrio un error en el WS RENIEC REST - autenticación - ".concat(e.getResponseBodyAsString()));
			 }else if(e.getMessage()!=null&&e.getMessage().contains(Constantes.STATUS_BAD_REQUEST)) {
		    	throw new Exception ("Ocurrio un error en el WS RENIEC REST - parámetros incorrectos - Status Code: ".concat(Constantes.STATUS_BAD_REQUEST).concat(" - Response Body: ".concat(e.getResponseBodyAsString())));
	    	}else{
	    		throw new Exception ("Ocurrio un error en el WS RENIEC REST - Status Code: ".concat( String.valueOf(e.getStatusCode())).concat(" - Response Body: ".concat(e.getResponseBodyAsString())));
	    	}
		}		    
	}
	
	//01:
	public Auditoria getAuditoriaMacEstatica(){
		Auditoria auditoria = new Auditoria();
		
		auditoria.setIpPc(CommonsUtilities.getRemoteIpAddress());
		auditoria.setMacAddressPc(CommonsUtilities.getMACEstatica());
		auditoria.setNombreSo("WIN");
		auditoria.setPcName(CommonsUtilities.getPCName());		
		auditoria.setUsuarioRed(Constantes.CONFIG_WS_REST_COD_CLIENTE);
		auditoria.setUsuarioSis(Constantes.CONFIG_WS_REST_COD_CLIENTE);
		//auditoria.setUsuarioRed(String.valueOf(getSessionMB().getUsuarioSession().getIdUsuario()));
		//auditoria.setUsuarioSis(String.valueOf(getSessionMB().getUsuarioSession().getIdUsuario()));	
		
		return auditoria;
	}
}
