var fileJson = 'datos.json'




//___________________________________ Se instancia el sigma
var s = new sigma('container');

//_____________________ Llamar al JSON que contiene el grafo
sigma.parsers.json(
    fileJson, s,
    function () {
        s.refresh();
    }
);



//_________________________________ Tabla para mostrar los nodos

$(function(){
    var table;
    
    $.getJSON(fileJson,function(data){
        table = data;
        
        iniciando(0);
        
    });
    
    function iniciando(){
        $("#mi_tabla").empty();
        
        jQuery.each(table.nodes,function(i,row){
            var r = "";
            
            $.each(row,function(index,valor){
                
                
              // r = r + "<tr><td>" + valor + "</td>";
                
                if (index == "id"){
                    r = r + "<tr><td>" + valor + "</td>";
                }
                else{
                    r = r + "<td>" + valor + "</td>";
                }
            });
            r += "</tr>";
            
            $("#mi_tabla").append(r);
            
        });
        
    }
    
});

//_________________________________ Tabla para mostrar los arcos

$(function(){
    var table;
    
    $.getJSON(fileJson,function(data){
        table = data;
        
        iniciando(0);
        
    });
    
    function iniciando(){
        $("#mi_tabla2").empty();
        
        
        jQuery.each(table.edges,function(i,row){
            var r = "";
            
            $.each(row,function(index,valor){
                
                
              // r = r + "<tr><td>" + valor + "</td>";
                
                if (index == "id"){
                    r = r + "<tr><td>" + valor + "</td>";
                }
                else{
                    r = r + "<td>" + valor + "</td>";
                }
            });
            r += "</tr>";
            
            $("#mi_tabla2").append(r);
            
        });
        
    }
    
});