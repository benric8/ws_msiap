    function doPopup(destination) {
        popup = window.open("", "popup", 
        "width=" + screen.availWidth + ",height=" + screen.availHeight + ",toolbar=no,menubar=no,scrollbars=yes");
        popup.focus();
    }