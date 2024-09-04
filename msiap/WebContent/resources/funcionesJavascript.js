function habilitarComponente(nombreComponente) {
	document.getElementById(nombreComponente).readOnly = false;
	document.getElementById(nombreComponente).focus();
}

function deshabilitarComponente(nombreComponente) {
	document.getElementById(nombreComponente).value = "";
	document.getElementById(nombreComponente).readOnly = true;
}

function cambiarSoloLectura(chkInciso, txt) {
	if(!chkInciso.checked) deshabilitarComponente(txt);
	else habilitarComponente(txt);
}

function encenderApagarTextoPorCombo(cbo, texto, valorApagado) {
	if(cbo[cbo.selectedIndex].value==valorApagado) deshabilitarComponente(texto);
	else habilitarComponente(texto);
}

function isFecha(txt) {
	if(!isContieneAlgo(txt)) return false;
	if(txt.length!=10) return false;
	dia = enNumero(txt.substring(0,2));
	mes = enNumero(txt.substring(3,5));
	ano = enNumero(txt.substring(6,10));
	if(!(1900<=ano && ano<=3000)) return false;
	if(!(1<=mes && mes<=12)) return false;
	if(!(1<=dia && dia<=31)) return false;
	return true;
}

function enDate(txt) {
	fecha = new Date();
	if(isFecha(txt)) {
		fecha.setDate(enNumero(txt.substring(0,2)));
		fecha.setMonth(enNumero(txt.substring(3,5)) - 1);
		fecha.setFullYear(enNumero(txt.substring(6,10)));
	}
	return fecha;
}

function validarFecha(txtFecha) {
	txt = txtFecha.value;
	if(isContieneAlgo(txt)) {
		if(txt.length==10) {
			if(isFecha(txt)) return true;
		}
		alert("La fecha ingresada no es valida");
	 	txtFecha.value = "";
		txtFecha.focus();
	}
	return false;
}

function trim(txt)
{	if(isContieneAlgo(txt)) {
		for(i=0;i<txt.length;i++)    { if(txt.charAt(i)==" ") txt = txt.substring(i+1,txt.length); else break;}
		for(i=txt.length-1;0<=i;i++) { if(txt.charAt(i)==" ") txt = txt.substring(0,i); else break;}
	}
	return txt;
}

function isContieneAlgo(txt)
{   if(txt!=null) return 0<txt.length;
	return false;
}

function enNumero(txt) {
	if(isContieneAlgo(txt)) return txt * 1;
	return 0;
}

function enTexto(fechaDate) {
	dia = fechaDate.getDate() + "";
	mes = fechaDate.getMonth() + 1 + "";
	ano = fechaDate.getFullYear() + "";
	if(dia.length==1) dia = "0" + dia;
	if(mes.length==1) mes = "0" + mes;
	return dia + "/" +  mes + "/" + ano;
}

function sumarFecha(txtDias, txtMeses, txtAnos, fechaInicio, fechaFin) {
	txtFechaInicio = document.getElementById(fechaInicio);
	txtFechaInicio.value = trim(txtFechaInicio.value);
	txtDias.value = trim(txtDias.value);
	txtMeses.value = trim(txtMeses.value);
	txtAnos.value = trim(txtAnos.value);
	if(isFecha(txtFechaInicio.value)) {	
		dateFin = enDate(txtFechaInicio.value);
		dateFin.setFullYear(dateFin.getFullYear() + enNumero(txtAnos.value));
		dateFin.setMonth(dateFin.getMonth() + enNumero(txtMeses.value));
		dateFin.setDate(dateFin.getDate() + enNumero(txtDias.value));		
		document.getElementById(fechaFin).value = enTexto(dateFin);
	}
}

function sumarAnos(dias, meses, txtAnos, fechaInicio, fechaFin) {
	sumarFecha(document.getElementById(dias), document.getElementById(meses), txtAnos, fechaInicio, fechaFin);
}

function sumarMeses(dias, txtMeses, anos, fechaInicio, fechaFin) {
	sumarFecha(document.getElementById(dias), txtMeses, document.getElementById(anos), fechaInicio, fechaFin);
}

function sumarDias(txtDias, meses, anos, fechaInicio, fechaFin) {
	sumarFecha(txtDias, document.getElementById(meses), document.getElementById(anos), fechaInicio, fechaFin);
}

function actualizarPeriodo(txtFechaConsentimiento, event, fechaInicio) {
	resultado = formatearFecha(txtFechaConsentimiento, event);
	document.getElementById(fechaInicio).value = txtFechaConsentimiento.value;
	return resultado;
}

function anosTranscurridos(txt){
    fechaInicial = enDate(txt);
    fechaFinal = new Date();
    anos = fechaFinal.getFullYear() - fechaInicial.getFullYear() - 1;
    if(fechaFinal.getMonth()<fechaInicial.getMonth()) return anos;
    if(fechaInicial.getMonth()<fechaFinal.getMonth()) return anos + 1;
    if(fechaInicial.getDate()<=fechaFinal.getDate()) return anos + 1;
    return anos;
} 

function calcularEdad(txtFechaNacimiento, edad) {
	document.getElementById(edad).value = "";
	txtFechaNacimiento.value = trim(txtFechaNacimiento.value);
	if(isFecha(txtFechaNacimiento.value))
		document.getElementById(edad).value = anosTranscurridos(txtFechaNacimiento.value);
}

function cambiarComboValor(cboOrigen, destino, opcion) {
	cboOpcion = cboOrigen;
	if(opcion!=null) cboOpcion = document.getElementById(opcion);
	cboDestino = document.getElementById(destino);
	cboDestino.value = cboOpcion[cboOrigen.selectedIndex].value;
}

function str_replace(cadena, cambia_esto, por_esto) {
	return cadena.split(cambia_esto).join(por_esto);
}		

function deshabilitarUnCheckBox(componente,idEsteComponente,idOtroComponente){
	if(componente.checked){
		document.getElementById(str_replace(componente.id,idEsteComponente,idOtroComponente)).checked=false;
		document.getElementById(str_replace(componente.id,idEsteComponente,idOtroComponente)).disabled=true;
	}
	else
		document.getElementById(str_replace(componente.id,idEsteComponente,idOtroComponente)).disabled=false;
}

function deshabilitarUnCheckBoxHabilitarOtro(componente,idEsteComponente,idOtroComponente,idOtroComponenteMas){
	if(componente.checked){
		document.getElementById(str_replace(componente.id,idEsteComponente,idOtroComponente)).checked=false;
		document.getElementById(str_replace(componente.id,idEsteComponente,idOtroComponente)).disabled=true;
		document.getElementById(str_replace(componente.id,idEsteComponente,idOtroComponenteMas)).disabled=false;
	}
	else
		document.getElementById(str_replace(componente.id,idEsteComponente,idOtroComponente)).disabled=false;
}

function deshabilitarDosCheckBox(componente,idEsteComponente,idOtroComponente,idOtroComponenteMas){
	if(componente.checked){
		document.getElementById(str_replace(componente.id,idEsteComponente,idOtroComponente)).checked=false;
		document.getElementById(str_replace(componente.id,idEsteComponente,idOtroComponenteMas)).checked=false;
		document.getElementById(str_replace(componente.id,idEsteComponente,idOtroComponente)).disabled=true;
		document.getElementById(str_replace(componente.id,idEsteComponente,idOtroComponenteMas)).disabled=true;
	}else{
		document.getElementById(str_replace(componente.id,idEsteComponente,idOtroComponente)).disabled=false;
		document.getElementById(str_replace(componente.id,idEsteComponente,idOtroComponenteMas)).disabled=false;
	}	
}
		
function desmarcarCheckBox(componente,idEsteComponente,idOtroComponente){
	if(componente.checked)
		document.getElementById(str_replace(componente.id,idEsteComponente,idOtroComponente)).checked=false;
}

function formatearFecha(componente,evento){
	var	caracter=obtenerChar(evento);
	if (document.selection) { 		
		document.selection.clear();
	}
	if(!esNumero(caracter))
		return false;
	var posicion=getCursorPos(componente);
	if(componente.value.length>9){
		componente.value=componente.value.substring(0,9);
	}
	if(posicion==1 || posicion==4){
		var caracterSiguiente=componente.value.charAt(posicion);
		if(caracterSiguiente!='/'){
			var nuevoValor=insertarCaracterEnPos(componente.value,posicion,String.fromCharCode(caracter)+'/');
		}
		else{
			var nuevoValor=insertarCaracterEnPos(componente.value,posicion,String.fromCharCode(caracter));
		}
		componente.value=nuevoValor;
		setCursorPosicion(componente,posicion+2,posicion+2);
	}else{
		var nuevoValor=insertarCaracterEnPos(componente.value,posicion,String.fromCharCode(caracter));
		componente.value=nuevoValor;
		setCursorPosicion(componente,posicion+1,posicion+1);
	}
	return false;
}
			
function obtenerChar(evt){
	var charCode = (evt.which) ? evt.which : event.keyCode
	return (charCode);
}
	
function esNumero(caracter){
	if (caracter > 31 && (caracter < 48 || caracter > 57))
	    return false;		
    return true;
}
				
function insertarCaracterEnPos(valor,posicion,caracter){
	var valorAnt=valor.substring(0,posicion);
	var valorDes=valor.substring(posicion,valor.length+1);
	return (valorAnt+caracter+valorDes);
}
	
function seleccionRango(componente){	
	var posicion=getCursorPos(componente);
	if(posicion<=2){
		setCursorPosicion(componente,0,2);
	}
	if(posicion>2 && posicion<=5){
		setCursorPosicion(componente,3,5);
	}
	if(posicion>5 && posicion<10){
		setCursorPosicion(componente,6,10);
	}
}
	
function getCursorPos(componente){
    var iCaretPos = 0;
    if (document.selection) { 
	    componente.focus ();
	    var oSel = document.selection.createRange ();
	    oSel.moveStart ('character', -componente.value.length);
	    iCaretPos = oSel.text.length;
	}
    else  
    	if (componente.selectionStart || componente.selectionStart == '0')
	    	iCaretPos = componente.selectionStart;
   	return (iCaretPos);
}		
		
function setCursorPosicion(oInput,oStart,oEnd) {
	if( oInput.setSelectionRange ) {
    	oInput.focus();
    	oInput.setSelectionRange(oStart,oEnd);
	}else 
		if( oInput.createTextRange ) {
          	var range = oInput.createTextRange();
           	range.collapse(true);
           	range.moveEnd('character',oEnd);
           	range.moveStart('character',oStart);
           	range.select();
	}
}
