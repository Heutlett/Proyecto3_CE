var presentGRAPH;
//___________________________________________ Mostrar la información del Grafo
function showInfoNode(fileJson,n) {

    presentGRAPH = n;
    $("#main").empty();

    var contentTableGRAPHS = "<div class='mainTableGRAPH'><section class='container' id='container'></section><section class='info' id='info'><br><h2>Tabla de NODOS</h2><br><table id='mi_tabla' class='tablaInfo'><tbody></tbody></table><br><table id='mi_tabla2' class='tablaInfo'><tbody></tbody></table></section><section class='buttonsTableGRAPHS' id='buttonsTableGRAPHS'><input type='button' class='btnOPTION' value='New NODE' onclick='newNODE()'><input type='button' class='btnOPTION' value='Delete NODE' onclick='deleteNODE()'><input type='button' class='btnOPTION' value='New EDGE' onclick='newEDGE()'><input type='button' class='btnOPTION' value='Delete EDGE' onclick='deleteEDGE()'><input type='button' class='btnOPTION' value='Refresh' onclick='refreshGRAPH()'><input type='button' class='btnOPTION' value='Return' onclick='getList()'><input type='button' class='btnOPTION' value='DIJKSTRA' onclick='showDijkstra()'><input type='button' class='btnOPTION' value='delete ALL Nodes' onclick='deleteAllNODES()'></section></div>";

    $("#main").append(contentTableGRAPHS);


    //_______________________________ Envia el grafo para la confeccion del server

    showSigmaNode(fileJson);

}



    //_____________________________________ Funcion para construir el grafo en la ventana
function showSigmaNode(fileJson) {



    //__________________________________________ Se agrega la seccion de nodos del grafo
    var numE;

    jQuery.each(fileJson, function (i, field) {
       numE = field;
    });

    //___________________________________ Se instancia el sigma y se incluye los nodos en la pantalla

    var s = new sigma('container');


     //__________________________________ Tabla para mostrar los nodos y añadir al grafo
    $("#mi_tabla").empty();

    var t = "<tr class='tableTitle'><th>Node</th><th>Name</th><th>x</th><th>y</th><th>Size</th></tr>";
    $("#mi_tabla").append(t);

    var n = numE.length;
    for(var i = 0; i < n; i++){
        var Rnodo = addXnY(numE[i]);

        s.graph.addNode(Rnodo);
        s.refresh();

        var r = "<tr><th>"+Rnodo.id+"</th><th>"+Rnodo.label+"</th><th>"+Rnodo.x+"</th><th>"+Rnodo.y+"</th><th>"+Rnodo.size+"</th></tr>" ;
        $("#mi_tabla").append(r);
    }



    var f = fileJson.edges.length;
    var numF = fileJson.edges;

    console.log(numF);
    console.log(numF[0]);
    //_________________________________ Tabla para mostrar los arcos y añadir al grafo


    $("#mi_tabla2").empty();

    var t = "<tr class='tableTitle'><th>Edge</th><th>Start</th><th>End</th><th>Weight</th></tr>";
    $("#mi_tabla2").append(t);

   for(var i = 0; i < f; i++){
       
       var Redge = createEdge(numF[i]);
       s.graph.addEdge(Redge);
       s.refresh();
       

        var r = "<tr><th>"+numF[i].id+"</th><th>"+numF[i].start+"</th><th>"+numF[i].end+"</th><th>"+numF[i].weight+"</th></tr>" ;
        $("#mi_tabla2").append(r);
    }

};


//___________________________________ Funcion para añadir los posición x y de los nodos

function addXnY(row){

    var Nid = row.id;
    var Nx = Math.floor((Math.random() * 100) + 1);
    var Ny = Math.floor((Math.random() * 100) + 1);
    var Nrow = {"id": Nid ,"label": Nid,"x": Nx,"y": Ny,"size": 1, "entity": row.entitiy ,};

    return Nrow;


}

function createEdge(row){

    var Rid = row.id;
    var Rstart = row.start;
    var Rend = row.end;
    var Rweight = row.weight;
    var Rrow = {"id": Rid ,"source": Rstart,"target": Rend,"weight": Rweight};

    return Rrow;
}



//__________________________________________________ Funcion para crear un nuevo Grafo
function newNODE() {
    console.log(URL_API + presentGRAPH + "/nodes");
    var Nentitiy = prompt("Ingrese un nombre para el nodo");
    var enviar = {
        "entitiy": Nentitiy,
    };
    $.ajax({
        url: URL_API + presentGRAPH + "/nodes",
        type: 'POST',
        contentType: 'application/json',
        data: JSON.stringify(enviar),
        error: function (respuesta) {
            alert("¡Oh No! Intente de nuevo");
            getGraph(presentGRAPH);
        },
        success: function (respuesta) {
            alert("Nodo creado exitosamente");
            getGraph(presentGRAPH);
        }
    });
}


//__________________________________________________ Funcion para eliminar un nuevo Grafo
function deleteNODE() {
    var Nid = prompt("Ingrese ID del nodo que desea eliminar");
    $.ajax({
        url: URL_API + presentGRAPH + '/nodes/' + Nid,
        type: 'DELETE',
        contentType: 'application/json',
        error: function (respuesta) {
            alert("¡Oh No! Intente de nuevo");
            getGraph(presentGRAPH);
        },
        success: function (respuesta) {
            alert("Nodo eliminado exitosamente");
            getGraph(presentGRAPH);
        }
    });
}


//__________________________________________________ Funcion para eliminar un nuevo Grafo
function deleteAllNODES() {
    $.ajax({
        url: URL_API + presentGRAPH + '/nodes/',
        type: 'DELETE',
        contentType: 'application/json',
        error: function (respuesta) {
            console.log(respuesta);
            alert("¡Oh No! Intente de nuevo");
        },
        success: function (respuesta) {
            alert("Nodo eliminado exitosamente");
            getGraph(presentGRAPH);
        }
    });
}

//__________________________________________________ Funcion para crear un nuevo Grafo
function newEDGE() {
    var Nstart = prompt("Ingrese el nombre del nodo inicial");
    var Nfinish = prompt("Ingrese el nombre del nodo final");
    var Ntime = prompt("Ingrese la duración de la llamada");
    
    var enviar = {
	"start" : Nstart,
	"end" : Nfinish,
	"weight" : Ntime,
};
    $.ajax({
        url: URL_API + presentGRAPH + "/edges",
        type: 'POST',
        contentType: 'application/json',
        data: JSON.stringify(enviar),
        error: function (respuesta) {
            alert("¡Oh No! Intente de nuevo");
            getGraph(presentGRAPH);
        },
        success: function (respuesta) {
            alert("Arista creada exitosamente");
            getGraph(presentGRAPH);
        }
    });
}


//__________________________________________________ Funcion para eliminar un nuevo Grafo
function deleteEDGE() {
    var idG = prompt("Ingrese nombre del nodo que desea eliminar");
    $.ajax({
        url: URL_API + presentGRAPH + "/edges/" + idG,
        type: 'DELETE',
        contentType: 'application/json',
        error: function (respuesta) {
            console.log(respuesta);
            alert("¡Oh No! Intente de nuevo");
        },
        success: function (respuesta) {
            alert("Arista eliminada exitosamente");
            getGraph(presentGRAPH);
        }
    });
}

//_____________________________________ Referesca la lista de los los nodos del grafo
function refreshGRAPH(){
    getGraph(presentGRAPH);
}



//_______________________________________ Funcion para ver la ruta más corta DiskTar
function showDijkstra(){
    var firstNode = prompt("Ingrese el nodo inicial");
    var lastNode = prompt("Ingrese el nodo final");
    
    var enviar = { "startNode": firstNode,
                    "endNode": lastNode };

    console.log(enviar);
    
    $.ajax({
    url: URL_API +  "/graph/" + presentGRAPH + "/dijkstra",
    type: 'GET',
    contentType: 'application/json',
    data: enviar,
    dataType: 'json',
    error: function(respuesta){
      alert("¡Oh No! Intente de nuevo");
      console.log(respuesta);
    },
    success: function(respuesta){
      console.log("Dijkstra");
      console.log(respuesta);
    }
  });
    
    
    
}
