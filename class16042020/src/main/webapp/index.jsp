<html>
	<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-latest.js">
</script>

<script type="text/javascript">

	$(document).ready(function(){
		
			var btn = $('carga').val();
			$.post('ServeleteControler',{


			},function(response){

		let datos = JSON.parse(response);
			//console.log(datos);
   

  var tabladatos = document.getElementById('tablaDatos')
  for(let item of datos){

    tablaDatos.innerHTML += `
     <tr>
     <td>${item.id}</td>
     <td>${item.nombreProducto}</td>
     <td>${item.precioProducto}</td>
     <td>${item.cantidadProducto}</td>
     <td>${item.totalProducto}</td>
     <td><a href = "ServeleteControler?btn=ELIMINAR&Id=${item.id}" class = "btn btn-warning">ELIMINAR<a>
     <a href = "fuciones.jsp?IdBus=${item.id}&Npr=${item.nombreProducto}&PrecioPr=${item.precioProducto}&CantidadPr=${item.cantidadProducto}&TotalPr=${item.totalProducto}" class = "btn btn-danger">ACTUALIZAR<a></td>
     
     </tr>`
      }
        
		}); 
	});
</script>






<head>
	<title>PRACTICA CLASS 16042020</title>



</head>
<body>
 	


 	
 	


<a href = "fuciones.jsp" class="btn btn-info">AGREGAR</a>


              <table class="table table-dark" id="tablaDatos">
              	<thead>
              		   	<th>ID</th>
              			<th>NOMBRE</th>
              			<th>PRECIO</th>
              			<th>CANTIDAD</th>
              			<th>TOTAL</th>
              			<th>OPCIONES</th>
                    	</thead>

                    	<TBODY>
                    		
                    	</TBODY>
                </table>




</body>
</html>
