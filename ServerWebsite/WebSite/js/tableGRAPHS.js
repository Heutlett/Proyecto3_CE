var URL_API = "http://localhost:9080/Proyecto3/graphs/";

//___________________________________ Obtener la lista de Grafos
function getList() {
    $.ajax({
        url: URL_API,
        type: 'GET',
        dataType: 'json',
        error: function (respuesta) {
            console.log(respuesta);
            alert("¡Oh No! Intente de nuevo");
        },
        success: function (respuesta) {
            //______________________________Añadir la lista a la ventana de tablas del grafo
            enterToListGRAPHS(respuesta);
        }
    });
}


//____________________________________________ Ingresa a la ventana de la lista de los grafos
function enterToListGRAPHS(JSONfile) {

    $("#main").empty();

    var contentTableGRAPHS = " <div class='mainTableGRAPH'><section class='info' id='info'><br><h2>Tabla del GRAFOS</h2><br><table id='tableListGraph' class='tableListGraph'><tbody></tbody></table><br></section><section class='buttonsTableGRAPHS' id='buttonsTableGRAPHS'><input type='button' class='btnOPTION' value='New GRAPH' onclick='newGRAPH()'><input type='button' class='btnOPTION' value='Delete GRAPH' onclick='deleteGRAPH()'><input type='button' class='btnOPTION' value='Delete LIST' onclick='deleteAllGRAPH()'><input type='button' class='btnOPTION' value='Sort LIST' onclick='sortList'><input type='button' class='btnOPTION' value='Refresh' onclick='getList()'></section></div>";

    $("#main").append(contentTableGRAPHS);


    showListGraphs(JSONfile);

};


//___________________________________________ Mostrar lista de Grafos
function showListGraphs(JSONfile) {
    //_________________________________ Tabla para mostrar los nodos y añadir al grafo
    $("#tableListGraph").empty();
    jQuery.each(JSONfile, function (i, field) {
        var n = field.id;
        var r = "<tr><td><p>" + n + "</p><input type='button' class='btnOPTION' value='OPEN' onclick='getGraph(" + '"'+ n+ '"'  + ")'></td></tr>";
        $("#tableListGraph").append(r);
    });
}


//_____________________________________________ Obtiene un grafo en específico y entra a la función de mostralo
function getGraph(idGraph) {

    $.ajax({
        url: URL_API + idGraph,
        type: 'GET',
        dataType: 'json',
        error: function (respuesta) {
            console.log(respuesta);
            alert("¡Oh No! Intente de nuevo");
        },
        success: function (respuesta) {
            console.log(respuesta);
            showInfoNode(respuesta, idGraph);
        }
    });


}

//__________________________________________________ Funcion para crear un nuevo Grafo
function newGRAPH() {
    $.ajax({
        url: URL_API,
        type: 'POST',
        contentType: 'application/json',
        error: function (respuesta) {
            console.log(respuesta);
            alert("¡Oh No! Intente de nuevo");
        },
        success: function (respuesta) {
            alert("Grafo creado exitosamente");
            getList();
        }
    });
}


//__________________________________________________ Funcion para eliminar un nuevo Grafo
function deleteGRAPH() {
    var idG = prompt("Ingrese ID del grafo que desea eliminar");
    $.ajax({
        url: URL_API + idG,
        type: 'DELETE',
        contentType: 'application/json',
        error: function (respuesta) {
            console.log(respuesta);
            alert("¡Oh No! Intente de nuevo");
        },
        success: function (respuesta) {
            alert("Grafo eliminado exitosamente");
            getList();
        }
    });
}

//__________________________________________________ Funcion para eliminar todos los Grafo
function deleteAllGRAPH() {
    $.ajax({
        url: URL_API,
        type: 'DELETE',
        contentType: 'application/json',
        error: function (respuesta) {
            console.log(respuesta);
            alert("¡Oh No! Intente de nuevo");
        },
        success: function (respuesta) {
            alert("Lista de grafos eliminados exitosamente");
            getList();
        }
    });
}


//__________________________________________________ Funcion para orderna lista de Grafos

function sortList() {

}
