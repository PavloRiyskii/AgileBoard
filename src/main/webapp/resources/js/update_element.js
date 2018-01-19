function sendPatchRequest(contextPath, boardId, elementId) {
    var xhr = new XMLHttpRequest();
    var body = '?name=' +document.getElementById("name").value +
        '&description=' + document.getElementById("description").value + "&boardId=" + document.getElementById("selectBoard").value;
    xhr.open("PATCH", contextPath + "/boards/12tgadg654asdg8xca474a367xc/elements/" + elementId + body, false);
    xhr.setRequestHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
    xhr.send(null);
    window.location.href = contextPath + '/boards';
}

function selectNeedBoard(boardId) {
    var select = document.getElementById("selectBoard");
    for(var i = 0; i < select.options.length; i++) {
        if(select.options[i].value == boardId) {
            select.options[i].selected = "selected";
        }
    }
}
