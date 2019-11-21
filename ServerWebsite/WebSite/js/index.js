function getGrafo(){

//_____________ Añade la url del API al servidor
    $.getJSON('http://localhost:9080/Proyecto3/graphs', function (data) {
     console.log(data);
    }).fail(function () {
        console.log('Error al consumir la API!');
    });

}