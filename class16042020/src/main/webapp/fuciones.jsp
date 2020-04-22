<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AGREGAR DATOS</title>
</head>

<%
String IdBus= request.getParameter("IdBus");
String nombrePr= request.getParameter("Npr");
String precioPr= request.getParameter("PrecioPr");
String cantidadPr= request.getParameter("CantidadPr");
String totalPr= request.getParameter("TotalPr");

if(IdBus==null)
	IdBus = "";
    nombrePr = "";
    precioPr=""; 
    cantidadPr=""; 
    totalPr= "";




%>
<body>

<H2 align="center">AGREGAR DATOS</H2>

 	<TABLE align="center">
 		<thead>
 			


 		</thead>
 		<tbody align="center">
 			<tr align="center">
 				<td align="center">


<form action="ServeleteControler" >					
 <p>id</p><input type="tex" name="Id"  align="center" value="<%=IdBus%>">
 <p>Nombre Producto</p><input type="tex" name="Nproducto"  align="center" value="<%=nombrePr%>">
 <p>Precio Producto</p><input type="tex" name="Pproducto"  align="center" value="<%=precioPr%>">
 <p>Cantidad Producto</p><input type="tex" name="Cproducto"  align="center" value="<%=cantidadPr%>">
 <p>Total de Producto</p><input type="tex" name="Tproducto"  align="center" value="<%=totalPr%>">
 <br>
 <br>
 
 						
 					
 				</td>
 			</tr>
 		</tbody>


 	</TABLE>

 	<input type="submit" class="btn btn-info" value="GUARDAR" name="btn">
 	<input type="submit" class="btn btn-info" value="ACTUALIZAR" name="btn">
</form> 
 </body>

</body>
</html>