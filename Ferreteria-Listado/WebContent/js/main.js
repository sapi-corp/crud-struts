//		function listaClientes() {
//			$("#CargaListado").load("consultaCliente");
//		};
//		$(document).ready(function() {
//			listaClientes();
//		});

	$(document).ready( function(){
			//llamar a la accion llenaMarca
			$.getJSON("llenaDistrito",{}, function (data,txt,jq){
					console.log(data);
					
					$.each(data.lstDistrito, function (index, item){
						$("#id_distrito").append("<option value='"+item.cod_distrito+"'>"+item.nom_distrito+"</option>");
					});
			});
	});
		