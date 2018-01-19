function  hide(caller) {
    var id = caller.id;
    var element = document.getElementById(id);
    if(id.toString().search("pencil-board-") != -1 || id.toString().search("remove-board-") != -1) {
        element.style.color = "#8f8686";
    } else {
        element.style.color = "#d2cccc";
    }
    console.log("id" + id + " is hidden" );
}

function show(caller) {
    var id = caller.id;
    var element = document.getElementById(id);
    element.style.color = "#555";

    console.log("id" + id + " is visible" );
}

function deleteElement(caller, contextPath) {
    var xhr = new XMLHttpRequest();
    var elementId = caller.id;
    if(elementId.toString().search("remove-element-") != -1) {
        var id = elementId.substring("remove-element-".length, elementId.length);
        xhr.open("DELETE", contextPath + "/boards/ga8769ad86g7a9as8765gascz56a/elements/" + id, false);
    } else if(elementId.toString().search("remove-board-") != -1) {
        var id = elementId.substring("remove-board-".length, elementId.length);
        xhr.open("DELETE", contextPath + "/boards/" + id, false);
    }
    xhr.send(null);
    location.reload();
}


