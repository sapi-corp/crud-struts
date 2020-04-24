<%@ taglib prefix="s" uri="/struts-tags" %>
<div>
<table>
	<tr>
		<td style="">
			<s:text name="titulo.menu"/>
		</td>
	</tr>
		<tr>
		<td>
		<a href=""><s:url action="inicializarEmpleado" namespace="/empleado"/>
			<s:text name="titulo.menu.empleado" />
		</a>
		</td>
	</tr>
		<tr>
		<td>
					<a href=""><s:url action="inicializarVendedor" namespace="/vendedor"/>
			<s:text name="accion.mantenimiento" />
		</a>
		</td>
	</tr>
		<tr>
		<td>
		<a href=""><s:url action="logoutUsuario" namespace="/seguridad"/>
			<s:text name="accion.logout" />
			</a>
		</td>
	</tr>
</table>
</div>


