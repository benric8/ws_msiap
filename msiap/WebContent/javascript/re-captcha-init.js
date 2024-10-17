function onRecaptchaCallback(tokenResult){
    //console.log("token", tokenResult);
    //console.log( "token 2", grecaptcha.getResponse());
    const inputToken = document.querySelector("#input-captcha-token");
    if(inputToken){
        inputToken.value = tokenResult;
    }
}

function onRecaptchaExpiredCallback(expirdeData){
    //console.log("expirado",expirdeData);
    const inputToken = document.querySelector("#input-captcha-token");
    if(inputToken){
        inputToken.value = null;
    }
}

function onRecaptchaErrorCallback(errorData){
    const inputToken = document.querySelector("#input-captcha-token");
    if(inputToken){
        inputToken.value = null;
    }
}

document.addEventListener("DOMContentLoaded", (event) => {
    //onst btnValidate = document.querySelector("#btn-validar");
    //const rootCaptcha = document.getElementById("root-captcha");
    const rootCaptcha = document.querySelector("#root-captcha");
    const inputName = rootCaptcha.getAttribute("data-name");
    const apiKey = rootCaptcha.getAttribute("data-api-key");
    var importCaptcha = document.createElement('script');
    importCaptcha.src = 'https://www.google.com/recaptcha/api.js';
    importCaptcha.onload = function() {
        /*const onRecaptchaCallback = (token) =>{
            var response = grecaptcha.getResponse();
            if (response !== "") {
                console.log("captcha response",response );
                grecaptcha.reset();
            } else {
                console.log("capctha response no resuelto", response);
            }
        }*/

        //const apiKey = "6LeqbAAnAAAAAIfjfpyKd8J1k5tHZa6uFClrLmxm";
        const divCaptcha = document.createElement('div');
        divCaptcha.className = "g-recaptcha";
        divCaptcha.setAttribute('data-sitekey',apiKey);
        divCaptcha.setAttribute('data-callback' ,"onRecaptchaCallback");
        divCaptcha.setAttribute('data-expired-callback' ,"onRecaptchaExpiredCallback");
        divCaptcha.setAttribute('data-error-callback' ,"onRecaptchaErrorCallback");

        rootCaptcha.appendChild(divCaptcha);

        const inputCaptcha = document.createElement('input');
        inputCaptcha.setAttribute("type","password");
        inputCaptcha.setAttribute("id","input-captcha-token");
        inputCaptcha.setAttribute("name",inputName);
        inputCaptcha.style.position = "relative";
        inputCaptcha.style.display = "none";
        inputCaptcha.style.zIndex ="-1";
        rootCaptcha.appendChild(inputCaptcha);
        /*btnValidate.addEventListener("click", (event) = function(){
            console.log("resolviendo captcha");
            var response = grecaptcha.getResponse();

            if (response !== "") {
                
                console.log("captcha response",response );
                grecaptcha.reset();
            } else {
                console.log("capctha response no resuelto", response);
            }
        });*/
        
    }
    document.head.appendChild(importCaptcha);
});
