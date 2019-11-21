
var fileJson = grafo;



//___________________________________ Se instancia el sigma
var s = new sigma('container');
var informacion;

//_________________________________ Tabla para mostrar los nodos y añadir al grafo
$(function () {
    var table;
    $.getJSON(fileJson, function (data) {
        table = data;
        iniciando(0);
    });

    function iniciando() {
        $("#mi_tabla").empty();

        var t = "<tr class='tableTitle'><th>Node</th><th>Name</th><th>x</th><th>y</th><th>Size</th></tr>";
        $("#mi_tabla").append(t);

        jQuery.each(table.nodes, function (i, row) {
            var r = "";

            $.each(row, function (index, valor) {
                if (index == "id") {
                    r = r + "<tr><td>" + valor + "</td>";
                    s.graph.addNode(row);
                    s.refresh();
                } else {
                    r = r + "<td>" + valor + "</td>";
                }
            });
            r += "</tr>";
            $("#mi_tabla").append(r);
        });
    }
});

//_________________________________ Tabla para mostrar los arcos y añadir al grafo

$(function () {
    var table;
    $.getJSON(fileJson, function (data) {
        table = data;
        iniciando(0);
    });

    function iniciando() {
        $("#mi_tabla2").empty();

        var t = "<tr class='tableTitle'><th>Edge</th><th>Start</th><th>End</th><th>Color</th></tr>";
        $("#mi_tabla2").append(t);

        jQuery.each(table.edges, function (i, row) {
            var r = "";
            $.each(row, function (index, valor) {
                if (index == "id") {
                    r = r + "<tr><td>" + valor + "</td>";
                    s.graph.addEdge(row);
                    s.refresh();
                } else {
                    r = r + "<td>" + valor + "</td>";
                }
            });
            r += "</tr>";
            $("#mi_tabla2").append(r);
        });
    }
});

