function validarDocumento() {
    var numrIdentidad = document.getElementById("form1:txtNumrIdentidad");
    var e = document.getElementById("form1:ddTipoDocumento");
    var tipoDoc = e.options[e.selectedIndex].value;

    if(tipoDoc == '0010'){
    	document.getElementById('form1:txtApellidoPaterno').readOnly = true;
    	document.getElementById('form1:txtApellidoMaterno').readOnly = true;
    	document.getElementById('form1:txtNombre1').readOnly = true;
    	document.getElementById('form1:txtNombre2').readOnly = true;
    	document.getElementById('form1:txtNombre3').readOnly = true;

    	if(numrIdentidad.value != null && trimAll(numrIdentidad.value).length == 8){
        	document.getElementById('form1:btnValidarDocumento').click();
        }
    }else{
    	document.getElementById('form1:txtApellidoPaterno').readOnly = false;
    	document.getElementById('form1:txtApellidoMaterno').readOnly = false;
    	document.getElementById('form1:txtNombre1').readOnly = false;
    	document.getElementById('form1:txtNombre2').readOnly = false;
    	document.getElementById('form1:txtNombre3').readOnly = false;
    }
}

function validarDocumentoF2() {
    var numrIdentidad = document.getElementById("form1:txtNumrIdentidad");
    var e = document.getElementById("form1:ddTipoDocumento");
    var tipoDoc = e.options[e.selectedIndex].value;

    if(tipoDoc == '0010'){
    	if(numrIdentidad.value != null && trimAll(numrIdentidad.value).length == 8){
        	document.getElementById('form1:btnValidarDocumento').click();
        }
    }else{
    	document.getElementById('form1:txtApellidoPaterno').readOnly = false;
    	document.getElementById('form1:txtApellidoMaterno').readOnly = false;
    	document.getElementById('form1:txtNombre1').readOnly = false;
    	document.getElementById('form1:txtNombre2').readOnly = false;
    	document.getElementById('form1:txtNombre3').readOnly = false;
    }
}
function validarDocumentoF3() {
    var numrIdentidad = document.getElementById("form1:txtDocumento");
    var e = document.getElementById("form1:ddTipoDocumento");
    var tipoDoc = e.options[e.selectedIndex].value;

    if(tipoDoc == '0010'){
    	if(numrIdentidad.value != null && trimAll(numrIdentidad.value).length == 8){
        	document.getElementById('form1:btnValidarDocumento').click();
        }
    }else{
    	document.getElementById('form1:txtApellidos').readOnly = false;
    	document.getElementById('form1:txtNombres').readOnly = false;
    }
}
function validarDocumentoOnLoadF3() {
    var e = document.getElementById("form1:ddTipoDocumento");
    var tipoDoc = e.options[e.selectedIndex].value;

    if(tipoDoc == '0010'){
    	document.getElementById('form1:txtApellidos').readOnly = true;
    	document.getElementById('form1:txtNombres').readOnly = true;
    }else{
    	document.getElementById('form1:txtApellidos').readOnly = false;
    	document.getElementById('form1:txtNombres').readOnly = false;
    }
}

function validarDocumentoOnLoad() {
    var e = document.getElementById("form1:ddTipoDocumento");
    var tipoDoc = e.options[e.selectedIndex].value;

    if(tipoDoc == '0010'){
    	document.getElementById('form1:txtApellidoPaterno').readOnly = true;
    	document.getElementById('form1:txtApellidoMaterno').readOnly = true;
    	document.getElementById('form1:txtNombre1').readOnly = true;
    	document.getElementById('form1:txtNombre2').readOnly = true;
    	document.getElementById('form1:txtNombre3').readOnly = true;
    }else{
    	document.getElementById('form1:txtApellidoPaterno').readOnly = false;
    	document.getElementById('form1:txtApellidoMaterno').readOnly = false;
    	document.getElementById('form1:txtNombre1').readOnly = false;
    	document.getElementById('form1:txtNombre2').readOnly = false;
    	document.getElementById('form1:txtNombre3').readOnly = false;
    }
}

function trimAll(sString) {
	if (sString != null) {
		while (sString.substring(0, 1) == ' ') {
			sString = sString.substring(1, sString.length);
		}
		while (sString.substring(sString.length - 1, sString.length) == ' ') {
			sString = sString.substring(0, sString.length - 1);
		}
	}
	return sString;
}


function validateAll() {
	var motivo = document.getElementById('form1:ddMotivo');
	var tipoDocumento = document.getElementById('form1:ddTipoDocumento');
	var numrIdentidad = document.getElementById('form1:txtNumrIdentidad');
	var apePaterno = document.getElementById('form1:txtApellidoPaterno');
	var apeMaterno = document.getElementById('form1:txtApellidoMaterno');
	var nombre1 = document.getElementById('form1:txtNombre1');
	var nombre2 = document.getElementById('form1:txtNombre2');
	var nombre3 = document.getElementById('form1:txtNombre3');
//	var nomPadre = document.getElementById('form1:txtNomPadre');
//	var nomMadre = document.getElementById('form1:txtNomMadre');
//	var lugar = document.getElementById('form1:ddLugar');
//	var fechNacimiento = document.getElementById('form1:calFechNacimiento_field');
	//console.log("1");
	if (motivo.selectedIndex<0 || motivo.value == null || motivo.value == "" || trimAll(motivo.value) == ""){
		alert('\u00BB Seleccione el motivo de solicitud');
		motivo.focus();
		return false;
	}
	if (tipoDocumento.selectedIndex<1 || tipoDocumento.value == null || tipoDocumento.value == "" || trimAll(tipoDocumento.value) == ""){
		alert('\u00BB Seleccione el tipo de documento');
		tipoDocumento.focus();
		return false;
	}
	if (numrIdentidad.value == null || numrIdentidad.value == "" || trimAll(numrIdentidad.value) == "") {
		alert('\u00BB Ingrese el n\u00FAmero correspondiente al siguiente documento :\n\n' + trimAll(tipoDocumento.options[tipoDocumento.selectedIndex].text));
		numrIdentidad.focus();
		return false;
	}
	var apePaternoR = '***';
	var apeMaternoR = '***';
	var nombre1R = '';
	var nombre2R = '';
	var nombre3R = '';
//	var nomPadreR = '';
//	var nomMadreR = '';
	cont1 = 0; // apellidos
	cont2 = 0; // nombres
//	cont3 = 0;// padres

	if ((trimAll(apePaterno.value) != null && trimAll(apePaterno.value) != "")|| trimAll(apePaterno.value) == '***') {
		apePaternoR = trimAll(apePaterno.value);
		apePaterno.value = trimAll(apePaterno.value);
	} else {
		cont1++;
	}
	if ((trimAll(apeMaterno.value) != null && trimAll(apeMaterno.value) != "")|| trimAll(apeMaterno.value) == '***') {
		apeMaternoR = trimAll(apeMaterno.value);
		apeMaterno.value = trimAll(apeMaterno.value);
	} else {
		cont1++;
	}
	var message = 'Validaci\u00F3n:\n\n';
	if (cont1 > 0) {
		if (apePaternoR == '***' && apeMaternoR == '***') {
			alert(message + '\u00BB Los campos de apellidos deben contener un valor v\u00E1lido, por lo menos uno de ellos');
			apePaterno.focus();
			return false;
		} else {
			message = message + '\u00BB Los campos de apellidos que han sido dejados en blanco ser\u00E1n marcados con \'***\'\n\n';
			apePaterno.value = apePaternoR;
			apeMaterno.value = apeMaternoR;
		}
	} else {
		if (apePaternoR == '***' && apeMaternoR == '***') {
			alert(message + '\u00BB Los campos de apellidos deben contener un valor v\u00E1lido, por lo menos uno de ellos');
			apePaterno.focus();
			return false;
		}
	}

	if (trimAll(nombre1.value) != null && trimAll(nombre1.value) != "") {
		nombre1R = trimAll(nombre1.value);
		nombre1.value = trimAll(nombre1.value);
	} else {
		cont2++;
	}
	if (trimAll(nombre2.value) != null && trimAll(nombre2.value) != "") {
		nombre2R = trimAll(nombre2.value);
		nombre2.value = trimAll(nombre2.value);
	} else {
		cont2++;
	}
	if (trimAll(nombre3.value) != null && trimAll(nombre3.value) != "") {
		nombre3R = trimAll(nombre3.value);
		nombre3.value = trimAll(nombre3.value);
	} else {
		cont2++;
	}
	if (cont2 > 0) {
		if (nombre1R == '' || (nombre1R != '' & nombre2R == '' & nombre3R != '')) {
			alert(message + '\u00BB Los campos de nombres deben ser llenados en el siguiente orden:\n\nnombre 1\nnombre 2\nnombre 3');
			nombre1.focus();
			return false;
		}
		// message = message + 'Los campos de nombres que han sido dejados en
		// blanco v\n';
	}
/*
	if (lugar.selectedIndex<1 || lugar.value == null || lugar.value == "" || trimAll(lugar.value) == ""){
		alert('\u00BB Seleccione el lugar de nacimiento');
		lugar.focus();
		return false;
	}
	if (fechNacimiento.value == null || fechNacimiento.value == "" || trimAll(fechNacimiento.value) == "") {
		if (!confirm('\u00BB La fecha de nacimiento ha sido dejada en blanco:\n\n\u00BFDeclara usted que desconoce la fecha de nacimiento de la persona que esta ingresando?')){
			fechNacimiento.focus();
			return false;
		}
	}
	if (trimAll(nomPadre.value) != null && trimAll(nomPadre.value) != "") {
		nomPadreR = trimAll(nomPadre.value);
		nomPadre.value = trimAll(nomPadre.value);
	} else {
		cont3++;
	}
	if (trimAll(nomMadre.value) != null && trimAll(nomMadre.value) != "") {
		nomMadreR = trimAll(nomMadre.value);
		nomMadre.value = trimAll(nomMadre.value);
	} else {
		cont3++;
	}
	if (cont3 > 0) {
		alert(message + '\u00BB Los campos con los nombres del Padre y Madre son obligatorios');
		/*if(trimAll(nomPadre.value) == ""){
			nomPadre.focus();
		}else{
			nomMadre.focus();
		}*//*
		trimAll(nomPadre.value) == ""?nomPadre.focus():nomMadre.focus();
		return false;
	}
	*/
	/*
	if (cont1 == 0 && cont2 <= 2 && cont3 == 0) {
		if (fechNacimiento.value == null || fechNacimiento.value == "" || trimAll(fechNacimiento.value) == "") {
			if (!confirm(message + '\u00BB La fecha de nacimiento ha sido dejada en blanco,\n\u00BFDeclara usted que desconoce la fecha de nacimiento de la persona que esta ingresando?')){
				return false;
			}
		} else {
			return true;
		}
	}*/
	/*if (fechNacimiento.value == null || fechNacimiento.value == "" || trimAll(fechNacimiento.value) == "") {
		message = message + '\u00BB La fecha de nacimiento ha sido dejada en blanco,\n\u00BB \u00BFDeclara usted que desconoce la fecha de nacimiento?\n';
	}*/
	var result = confirm(message + '\u00BFDesea continuar?\n\n\u00BB Si cancela esta operaci\u00F3n debera completar los campos restantes');

	if (result) {
		apePaterno.value = apePaternoR;
		apeMaterno.value = apeMaternoR;
		nombre1.value = nombre1R;
		nombre2.value = nombre2R;
		nombre3.value = nombre3R;
	}
	return result;

}