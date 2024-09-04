/***********************************************
* Auto Maximize Window Script- © Dynamic Drive (www.dynamicdrive.com)
* This notice must stay intact for use
* Visit http://www.dynamicdrive.com/ for this script and 100's more.
***********************************************/

top.window.moveTo(0,0);
if (document.all) {
    top.window.resizeTo(screen.availWidth,screen.availHeight);
}
else if (document.layers||document.getElementById) {
    if (top.window.outerHeight<screen.availHeight||top.window.outerWidth<screen.availWidth){
        top.window.outerHeight = screen.availHeight;
        top.window.outerWidth = screen.availWidth;
    }
}

function send(){
    var bar1= createBar(300,15,'white',1,'black','blue',85,7,3,"");
    return true;
}