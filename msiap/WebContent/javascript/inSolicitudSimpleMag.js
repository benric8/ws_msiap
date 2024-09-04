/*erodriguezbu migración: js diferente en mag y msiap*/   
function trimAll(sString){
                                if (sString != null){
                                    while (sString.substring(0,1) == ' ')
                                    {
                                        sString = sString.substring(1, sString.length);
                                    }
                                    while (sString.substring(sString.length-1, sString.length) == ' ')
                                    {
                                        sString = sString.substring(0,sString.length-1);
                                    }
                                }
                                return sString;
                            }
                            
                            
                            function validateAll(){
                                var apePaterno  = document.getElementById('form1:txtApellidoPaterno');
                                var apeMaterno  = document.getElementById('form1:txtApellidoMaterno');
                                var nombre1     = document.getElementById('form1:txtNombre1');
                                var nombre2     = document.getElementById('form1:txtNombre2');
                                var nombre3     = document.getElementById('form1:txtNombre3');
                                var nomPadre     = document.getElementById('form1:txtNomPadre');
                                var nomMadre     = document.getElementById('form1:txtNomMadre');
                                var fechNacimiento = document.getElementById('form1:calFechNacimiento_field');
                                var apePaternoR = '***';
                                var apeMaternoR = '***';
                                var nombre1R    = '';
                                var nombre2R    = '';
                                var nombre3R    = '';
                                var nomPadreR   = '';
                                var nomMadreR   = '';
                                cont1 = 0; //apellidos
                                cont2 = 0; //nombres
                                cont3 = 0;
                                if((trimAll(apePaterno.value) != null && trimAll(apePaterno.value) != "") || trimAll(apePaterno.value) == '***'){
                                    apePaternoR = trimAll(apePaterno.value);
                                    apePaterno.value = trimAll(apePaterno.value);
                                }else{
                                    cont1++;
                                }
                                if((trimAll(apeMaterno.value) != null && trimAll(apeMaterno.value) != "") || trimAll(apeMaterno.value) == '***'){
                                    apeMaternoR = trimAll(apeMaterno.value);
                                    apeMaterno.value = trimAll(apeMaterno.value);
                                }else{
                                    cont1++;
                                }
                                if(trimAll(nombre1.value) != null && trimAll(nombre1.value) != ""){
                                    nombre1R = trimAll(nombre1.value);
                                    nombre1.value = trimAll(nombre1.value);
                                }else{
                                    cont2++;
                                }
                                if(trimAll(nombre2.value) != null && trimAll(nombre2.value) != ""){
                                    nombre2R = trimAll(nombre2.value);
                                    nombre2.value = trimAll(nombre2.value);
                                }else{
                                    cont2++;
                                }
                                if(trimAll(nombre3.value) != null && trimAll(nombre3.value) != ""){
                                    nombre3R = trimAll(nombre3.value);
                                    nombre3.value = trimAll(nombre3.value);
                                }else{
                                    cont2++;
                                }
                                
                                if(trimAll(nomPadre.value) != null && trimAll(nomPadre.value) != ""){
                                    nomPadreR = trimAll(nomPadre.value);
                                    nomPadre.value = trimAll(nomPadre.value);
                                }else{
                                    cont3++;
                                }
                                if(trimAll(nomMadre.value) != null && trimAll(nomMadre.value) != ""){
                                    nomMadreR = trimAll(nomMadre.value);
                                    nomMadre.value = trimAll(nomMadre.value);
                                }else{
                                    cont3++;
                                }
                                
                                var message = 'Validación:\n';
                                if (cont1 > 0){
                                    
                                    if (apePaternoR == '***' && apeMaternoR == '***'){
                                        alert(message + 'Los campos de apellidos deben contener un valor válido, por lo menos uno de ellos');
                                        return false;
                                    }else{
                                        message = message + 'Los campos de apellidos que han sido dejados en blanco serán marcados con \'***\'\n';
                                        apePaterno.value = apePaternoR;
                                        apeMaterno.value = apeMaternoR;
                                    }
                                }else{
                                    if (apePaternoR == '***' && apeMaternoR == '***'){
                                        alert(message + 'Los campos de apellidos deben contener un valor válido, por lo menos uno de ellos');
                                        return false;
                                    }
                                }
                                
                                if (cont2 > 0){
                                    if (nombre1R == '' || (nombre1R != '' & nombre2R == '' & nombre3R != '') ){
                                        alert(message + 'Los campos de nombres deben ser llenados en orden,\nprimero nombre1 luego nombre2 y finalmente nombre 3');
                                        return false;
                                    }
                                    //message = message + 'Los campos de nombres que han sido dejados en blanco v\n';
                                }
                                
                                if(cont3 > 0){
                                    alert(message + 'Los campos con los nombres del Padre y Madre son obligatorios\n');
                                    
                                    return false;
                                }
                                
                                if(cont1 == 0 && cont2 <= 2 && cont3 == 0){
                                    if (fechNacimiento.value == null || fechNacimiento.value == "" || trimAll(fechNacimiento.value) == ""){
                                        return confirm(message + '\nDeclara usted que desconoce la fecha de nacimiento de la persona que esta ingresando');
                                    }else{
                                        return true;
                                    }
                                }
                                if (fechNacimiento.value == null || fechNacimiento.value == "" || trimAll(fechNacimiento.value) == ""){
                                    message = message + '\nLa fecha de nacimiento ha sido dejada en blanco,\n¿Declara usted que desconoce la fecha de nacimiento?\n';
                                }
                                var result = confirm(message + '\n¿Desea continuar?\nSi cancela esta operación debera completar los campos restantes');
                                
                                if (result){
                                    apePaterno.value = apePaternoR;
                                    apeMaterno.value = apeMaternoR;
                                    nombre1.value = nombre1R;
                                    nombre2.value = nombre2R;
                                    nombre3.value = nombre3R;
                                }
                                return result;
                                
                            }