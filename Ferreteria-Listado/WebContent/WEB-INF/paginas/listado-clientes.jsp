<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>STRUTS 2.0</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <style>
    .nav > .navbar-brand{
        color: #5F6673;
        font-weight: bold;
    }
    .font-nav{
        font-size: 17px;
        padding: 20px 5px 20px 20px;
    }
    .abc{
        align-items: center;
        justify-content: center;
    }
    </style>
</head>
<body>
	<!-- :::: NAV ::::: -->
        <nav  class="nav bg-light navbar-expand-lg col-md-">
            <a class="navbar-brand font-nav" href="#">Bootstrap 4.4</a>
            <a class="navbar-brand font-nav" href="#">Struts 2.0</a>
        </nav>
     <!-- ::::::::::::: -->
	
	<div id="CargaListado" class="container-fluid">
		<div class="row">
		<!-- AGREGAR CLIENTES -->
			<div class="col-md-5 mt-3">
				<div class="card">
					<div class="card-body">
						<form accept-charset="UTF-8" action="addClient" method="post">
							<label for="exampleFormControlInput1">Nombres</label> 
							<input name="cliente.nom_cliente" type="text" class="form-control"	id="exampleInputEmail1">
							<div class="form-group">
								<label for="exampleFormControlSelect1">Distrito</label> 
								<select	class="form-control" id="id_distrito"
									name="tb_distrito.cod_distrito">
									<option value=" ">[Seleccione]</option>
								</select>
							</div>
							<div class="card-body">
								<button type="submit" class="btn btn-primary">Agregar</button>
							</div>
						</form>
					</div>
				</div>
			</div>
			<!-- :::::::::::::::: -->
			<!-- FORMULARIO DE LISTADO -->
			<div class="col-md-7 mt-3">
				<div class="card">
					<div class="card-body">
						<form  accept-charset="UTF-8" action="consultaCliente"
							method="post">
							<div class="card-body">
								<button value="submit" type="submit" class="btn btn-primary">Listar</button>
							</div>
							<div  id="CargaListado">
								<table class="table table-striped table-bordered">
									<thead>
										<tr>
											<th>ID</th>
											<th>Nombre</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${lstCliente}" var="x">
											<tr>
												<td>${x.cod_cliente}</td>
												<td>${x.nom_cliente}</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</form>
					</div>
				</div>
			</div>
			<!-- :::::::::::::::: -->
		</div>
	</div>



	<script	src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous"></script>
	
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

<script type="text/javascript" src="<c:url value="/js/main.js" />"></script>

</body>
</html>