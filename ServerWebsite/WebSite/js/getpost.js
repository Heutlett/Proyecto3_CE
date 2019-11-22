//____________________________________ Método para enviar GET al api
function getGraph(){
  $.ajax({
    url: 'http://localhost:9080/Proyecto3/graphs',
    type: 'GET',
    dataType: 'json',
    error: function(respuesta){
      console.log(respuesta);
      alert("¡Oh No! Intente de nuevo");
    },
    success: function(respuesta){
      console.log("WooHoo!");
      //ultimoMensaje = respuesta.mensaje;
    }
  });
}


//____________________________________ Método para enviar POST al api
function postGraph(){
  var enviar = {
    "id": "00000000-0000-007b-0000-00000000009c",
    "nombre": "aaaa",
    "edad": "12"
    };
  console.log(enviar);
  $.ajax({
    url: 'http://localhost:9080/Proyecto3/graphs',
    type: 'POST',
    contentType: 'application/json',
    data: JSON.stringify(enviar),
    error: function(respuesta){
      console.log(respuesta);
      alert("¡Oh No! Intente de nuevo");
    },
    success: function(respuesta){
      console.log("WooHoo!");
    }
  });
}


