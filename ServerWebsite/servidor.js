//_____________________ Se importa la librería express y se importa el método express() en app
const express = require('express');
const app = express();


//____________________________________ Añade la carpeta que se va a visualizar
app.use(express.static('./WebSite'))


//___________________________________ Abre el servidor en el puerto 8000 y carga el sitio web
app.listen(8000, readWebSite());


//_____________________ Método comprobar inicio del servidor
function readWebSite(){
    console.log("Corriendo servidor en el puerto localhost:8000");
}