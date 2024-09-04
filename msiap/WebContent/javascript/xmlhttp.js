var http = getHTTPObject();

function getHTTPObject() {
  var xmlhttp;
  try {
    xmlhttp = new ActiveXObject("Msxml2.XMLHTTP");
  } catch (e) {
     try {
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
     } catch (E) {
        xmlhttp = false;
     }
  }

  if (!xmlhttp && typeof XMLHttpRequest != 'undefined') {
    try {
      xmlhttp = new XMLHttpRequest();
      if (xmlhttp .overrideMimeType) {
             xmlhttp .overrideMimeType('text/xml');
            
      }
    } catch (e) {
      xmlhttp = false;
    }
  }

  return xmlhttp;
}


function handleHttpResponse() {
  if (http.readyState == 4) {
    //GoogleSearchResults.innerHTML = http.responseText;
    document.getElementById("txtDisplay").value = http.responseText;
    // alert(http.responseText);
  }
}

function HttpSendRequestA(ruta){  // asincrono
  http.open("GET", ruta, true);  
  http.onreadystatechange = handleHttpResponse;  
  try {
        http.send(null);
      } catch (e) {
        alert(e.message);
    }      
}

function HttpSendRequest(ruta){  
  http.open("GET", ruta, false);  
    try {
        http.send(null);
	if (http.readyState == 4) {
     	  return(http.responseText);
  	}	  
      } catch (e) {
        return(e.message);
    }      
}

function loadCbo(resultStr, object){
	object.options.length = 0;
	var optionsArr = resultStr.split("|");
	for (var i = 0; i < optionsArr.length-1; i++){
		var elementsArr = optionsArr[i].split(",");
		object.options[i] = new Option(elementsArr[1], elementsArr[0]);
	}
	object.selectedIndex = 0;
}