function sendPatchRequest(contextPath, boardId) {
    var xhr = new XMLHttpRequest();
    var body = '?name=' +document.getElementById("name").value;
    xhr.open("PATCH", contextPath + "/boards/" + boardId+ body, false);
    xhr.setRequestHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
    xhr.send(null);
    window.location.href = contextPath + '/boards';
}